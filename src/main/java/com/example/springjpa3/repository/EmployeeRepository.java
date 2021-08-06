package com.example.springjpa3.repository;

import com.example.springjpa3.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 社員テーブルのリポジトリ。
 * 
 * <p>{@link JpaRepository}の便利な機能を使用可能。
 * リポジトリが扱うエンティティを型パラメータで指定。
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
