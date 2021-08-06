package com.example.springjpa3.repository;

import com.example.springjpa3.model.Department;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 部署テーブルのリポジトリ。
 * 
 * <p>{@link JpaRepository}の便利な機能を使用可能。
 * リポジトリが扱うエンティティを型パラメータで指定。
 */
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
