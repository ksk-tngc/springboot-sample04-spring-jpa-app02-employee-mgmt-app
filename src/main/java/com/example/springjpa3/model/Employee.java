package com.example.springjpa3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * 社員テーブルのエンティティ。
 */
@Entity
@Getter
@Setter
public class Employee {

    /**
     * ID
     */
    @Id // 主キー
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自動採番（DBのシーケンスを使用）
    private Long id;

    /**
     * 名前
     */
    @NotBlank(message = "名前を入力してください") // 必須
    @Size(max = 40, message = "名前は{1}文字以内で入力してください") // 40文字まで
    private String name;

    /**
     * 部署
     */
    @ManyToOne // 部署テーブルとの関係＝多対一
    private Department department;

}
