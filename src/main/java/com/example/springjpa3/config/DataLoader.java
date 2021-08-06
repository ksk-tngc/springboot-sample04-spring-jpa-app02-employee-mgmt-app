package com.example.springjpa3.config;

import com.example.springjpa3.model.Department;
import com.example.springjpa3.model.Employee;
import com.example.springjpa3.repository.DepartmentRepository;
import com.example.springjpa3.repository.EmployeeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

/**
 * データローダコンポーネント。
 * 
 * <p>DBの初期データを登録するコンポーネント。
 * Spring Boot 起動時にコマンドラインとして実行される。（{@link CommandLineRunner}）
 */
@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    /**
    * 部署テーブルのリポジトリ。
    * <p>Lombokの{@code @RequiredArgsConstructor}でコンストラクタインジェクションされる。
    * コンストラクタが１つの場合、コンストラクタに付ける{@code @Autowired}は省略可。
    */
    private final DepartmentRepository departmentRepository;

    /**
     * 社員テーブルのリポジトリ。
     * <p>{@code DepartmentRepository}同様、コンストラクタインジェクションされる。
     */
    private final EmployeeRepository employeeRepository;

    /**
     * Spring Boot 起動時にコマンドラインとして実行する処理。
     * <p>DBの初期データを登録する。
     */
    @Override
    public void run(String... args) throws Exception {
        // 部署テーブルの初期データ
        Department department1 = new Department();
        department1.setName("営業");
        departmentRepository.save(department1); // DB登録

        Department department2 = new Department();
        department2.setName("開発");
        departmentRepository.save(department2); // DB登録

        // 社員テーブルの初期データ
        Employee employee1 = new Employee();
        employee1.setName("Tom");
        employee1.setDepartment(department1);
        employeeRepository.save(employee1); // DB登録

        Employee employee2 = new Employee();
        employee2.setName("Jane");
        employee2.setDepartment(department2);
        employeeRepository.save(employee2); // DB登録
    }

}
