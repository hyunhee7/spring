<%@page import="test.board.dao.BoardDao"%>
<%@page import="test.board.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//요청 인코딩 설정
	request.setCharacterEncoding("utf-8");
	//폼전송되는 내용 읽어오기
	String writer=request.getParameter("writer");
	String title=request.getParameter("title");
	String content=request.getParameter("content");
	//BoardDto 객체에 담는다.
	BoardDto dto=new BoardDto();
	dto.setWriter(writer);
	dto.setTitle(title);
	dto.setContent(content);
	//BoardDao 객체를 이용해서 DB 에 저장한다. 
	BoardDao dao=BoardDao.getInstance();
	boolean isSuccess=dao.insert(dto);
	//응답하기 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>/board/insert.jsp</title>
</head>
<body>
<%if(isSuccess){ %>
	<p>새글을 저장했습니다.</p>
<%}else{ %>
	<p>새글 저장 실패!</p>
<%} %>
<a href="list.jsp">글 목록 보기</a>
</body>
</html>














