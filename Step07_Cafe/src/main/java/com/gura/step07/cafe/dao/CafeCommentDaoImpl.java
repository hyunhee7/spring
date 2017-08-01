package com.gura.step07.cafe.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.step07.cafe.dto.CafeCommentDto;

@Repository
public class CafeCommentDaoImpl implements CafeCommentDao{

	@Autowired
	private SqlSession session;
	
	@Override
	public void insert(CafeCommentDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CafeCommentDto> getList(int ref_group) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSequence() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
