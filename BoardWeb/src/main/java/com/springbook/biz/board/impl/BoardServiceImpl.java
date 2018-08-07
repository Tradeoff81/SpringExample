package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public void insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
		//���� �߻��� �ڵ�(AOP AfterThrowingAdvice�� �׽�Ʈ �� �� �ּ� ����)
		//if(vo.getSeq()==0) {
		//	throw new IllegalArgumentException("0�� ���� ����� �� �����ϴ�.");
		//}
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		boardDAO.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList() {
		// TODO Auto-generated method stub
		return boardDAO.getBoardList();
	}
	
}
