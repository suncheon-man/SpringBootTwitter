package com.tistory.jimin.twitter.board;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

	@RequestMapping("/board")
	public String board_test() {
		return "board";
	}
	
	@RequestMapping("/abcd")
	public String abcd_test() {
		return "abcd";
	}
}
