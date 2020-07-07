package com.biz.word.exec;

import com.biz.word.service.WordGameService;
import com.biz.word.service.WordGameServiceImplV2;

public class WordEx_02 {
	public static void main(String[] args) {
		WordGameService wGameService = new WordGameServiceImplV2();
		wGameService.loadWord();
		wGameService.playGame();
		wGameService.gameOver();
	}
}
