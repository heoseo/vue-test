package com.vue.test.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vue.test.board.ResultVO;
import com.vue.test.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

	private static final Logger LOG = LoggerFactory.getLogger(BoardController.class);

	private final BoardService boardService;

	@RequestMapping(value = "get-board-list.do", method = RequestMethod.GET)
//	@GetMapping("get-board-list.do")	동일한 코드
	public ResultVO getBoardList() {
		LOG.info("[GET] getBoardList");


		ResultVO result = new ResultVO(false, null);

		try {
			result.setResult(boardService.getBoardList());
			result.setSuccess(true);
		} catch (Exception e) {
			LOG.error("[Board] getBoardList : " + e.getMessage(), e);
		}

		return result;
	}
}