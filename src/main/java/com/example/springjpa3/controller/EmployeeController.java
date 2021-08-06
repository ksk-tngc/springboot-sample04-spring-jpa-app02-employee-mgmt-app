package com.example.springjpa3.controller;

import com.example.springjpa3.model.Employee;
import com.example.springjpa3.repository.EmployeeRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;

/**
 * 社員情報画面のコントローラ。
 */
@Controller
@RequiredArgsConstructor
public class EmployeeController {

    /**
     * 社員テーブルのリポジトリ。
     * <p>Lombokの{@code @RequiredArgsConstructor}でコンストラクタインジェクションされる。
     * コンストラクタが１つの場合、コンストラクタに付ける{@code @Autowired}は省略可。
     */
    private final EmployeeRepository repository;

    /**
     * トップページを表示するハンドラメソッド。
     * @param model モデル
     * @return 遷移後の画面
     */
    @GetMapping("/")
    public String showEmployeeList(Model model) {
        model.addAttribute("employees", repository.findAll()); // 従業員テーブルの全データをモデルに追加
        return "index";
    }

    /**
     * 社員情報登録ページを表示するハンドラメソッド。
     * @param employee モデルに追加するオブジェクト
     * @return 遷移後の画面
     */
    @GetMapping("/add")
    public String showEmployeeAdd(@ModelAttribute Employee employee) {
        return "form";
    }

    /**
     * 社員情報編集画面を表示するハンドラメソッド。
     * @param id 編集対象の社員ID
     * @param model モデル
     * @return 遷移後の画面
     */
    @GetMapping("/edit/{id}")
    public String showEmployeeEdit(@PathVariable Long id, Model model) {
        model.addAttribute("employee", repository.findById(id)); // IDで検索した社員レコードをモデルに追加
        return "form";
    }

    /**
     * 社員情報登録処理。
     * @param employee リクエストボディがバインドされた検証済みのオブジェクト
     * @param bindingResult バインド結果
     * @return 遷移後の画面
     */
    @PostMapping("/add")
    public String addEmployee(@Validated @ModelAttribute Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) { // バリデーションエラーあり
            return "form"; // 社員登録ページに戻る（バリデーション表示）
        }
        repository.save(employee); // 社員テーブルに登録
        return "redirect:/"; // トップページにリダイレクト（PRG）
    }

    /**
     * 社員情報削除処理。
     * @param id 削除対象の社員ID
     * @return 遷移後の画面
     */
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id); // IDをキーに社員テーブルから削除
        return "redirect:/"; // トップページにリダイレクト
    }

}
