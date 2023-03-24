package com.vue.test.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vue.test.common.entity.Board;


@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

}

