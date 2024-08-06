package com.simple.basic.board;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.basic.command.BoardVO;
import com.simple.basic.command.ScoreVO;


@Service("b")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public void regist(BoardVO vo) {
		boardMapper.regist(vo);
	}

	@Override
	public ArrayList<BoardVO> getBoard() {
		return boardMapper.getBoard();
	}

	@Override
	public void delete(int num) {
		boardMapper.delete(num);
	}
}
