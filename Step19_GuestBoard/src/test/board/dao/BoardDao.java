package test.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.board.dto.BoardDto;
import test.mybatis.SqlMapConfig;

public class BoardDao {
	private static BoardDao dao;
	// MyBatis 를 사용하기 위한 객체
	private static SqlSessionFactory factory;
	//생성자
	private BoardDao(){}
	//자진의 참조값을 리턴해주는 static 맴버 메소드
	public static BoardDao getInstance(){
		if(dao==null){
			dao=new BoardDao();
			factory=SqlMapConfig.getSqlSession();
		}
		return dao;
	}
	//게시글 목록을 리턴해주는 메소드
	public List<BoardDto> getList(BoardDto dto){
		//SqlSession 객체의 참조값 얻어오기 
		SqlSession session=factory.openSession();
		/*	Mapper.xml 문서의 namespace => board
		 *  sql 문의 id => getList
		 *  resultType => BoardDto
		 */
		List<BoardDto> list=session.selectList("board.getList", dto);
		session.close();
		return list;
	}
	//게시글 한개의 정보를 리턴해주는 메소드
	public BoardDto getData(int num){
		SqlSession session=factory.openSession();
		/*	Mapper.xml 문서의 namespace => board
		 *  sql 문의 id => getData
		 *  resultType => BoardDto
		 *  parameterType => int
		 */
		BoardDto dto=session.selectOne("board.getData", num);
		session.close();
		return dto;
	}
	//게시글 한개를 추가하는 메소드 
	public void insert(BoardDto dto){
		// Auto Commit  해주는 SqlSession 객체의 참조값 얻어오기 
		SqlSession session=factory.openSession(true);
		/*	Mapper.xml 문서의 namespace => board
		 *  sql 문의 id => insert
		 *  resultType => X
		 *  parameterType => BoardDto
		 */
		session.insert("board.insert", dto);
		session.close();
	}
	//게시글 정보를 수정하는 메소드
	public void update(BoardDto dto){
		//수동 commit 하는 SqlSession 객체 얻어오기
		SqlSession session=factory.openSession();
		session.update("board.update", dto);
		//commit 해서 DB 에 실제 반영하기 
		session.commit();
		session.close();
	}
	//게시글 정보를 삭제하는 메소드
	public void delete(int num){
		SqlSession session=factory.openSession(true);
		session.delete("board.delete", num);
		session.close();
	}
	//DB 에 저장된 게시글 전체의 갯수를 리턴해주는 메소드
	public int getCount(){
		SqlSession session=factory.openSession();
		int count=session.selectOne("board.getCount");
		session.close();
		return count;
	}
}



















