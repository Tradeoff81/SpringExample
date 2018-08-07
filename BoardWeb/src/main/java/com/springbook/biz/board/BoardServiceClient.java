package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		//BoardVO vo = new BoardVO();
		//vo.setTitle("임시 제목");
		//vo.setWriter("홍길동");
		//vo.setContent("임시 내용..........");
		//boardService.insertBoard(vo);
		
		List<BoardVO> boardList =  boardService.getBoardList();
		for(BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
		/* AOP 모두 적용 시 다음과 같은 순서로 실행된다. (AfterThrowing 제외)
		  	[사전 처리] 비즈니스 로직 수행 전 동작 				>>before
			[Before]: 비즈니스 메소드 수행 전에 처리할 내용...	>>around-before
			===> JDBC로 getBoardList() 기능 처리
			[After]: 비즈니스 메소드 수행 후에 처리할 내용...		>>around-after
			[사후 처리] 비즈니스 로직 수행 후 무조건 동작			>>after(finally)
			[사후 처리] 비즈니스 로직 수행 후 동작				>>afterReturning
		*/
		
		container.close();
	}

}
