package com.vue.test.board.service;

import java.util.List;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import com.vue.test.common.entity.Board;
import com.vue.test.common.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@EnableAsync
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository boardRepository;

	/**
	 * 게시판 조회
	 * @return List<Board>
	 */
	public List<Board> getBoardList(){
		return boardRepository.findAll();
	}
}
