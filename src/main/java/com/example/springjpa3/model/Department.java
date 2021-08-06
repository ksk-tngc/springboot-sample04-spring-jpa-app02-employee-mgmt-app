package com.example.springjpa3.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * 部署テーブルのエンティティ。
 */
@Entity
@Getter
@Setter
public class Department {

    /**
     * ID
     */
    @Id // 主キー
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自動採番（DBのシーケンスを使用）
    private Long id;

    /**
     * 部署名
     */
    @NotBlank // 必須
    @Size(max = 40) // 40文字まで
    private String name;

    /**
     * 社員
     * <p>Employeeエンティティと「双方向」でマップするためのフィールド定義
     */
    @OneToMany(mappedBy = "department") // 社員テーブルとの関係＝一対多（マップする対象フィールドを指定）
    private List<Employee> employees;

}
