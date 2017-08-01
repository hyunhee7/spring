package com.gura.step07.cafe.dao;

import java.util.List;

import com.gura.step07.cafe.dto.CafeCommentDto;

public interface CafeCommentDao {
	public void insert(CafeCommentDto dto);
	public List<CafeCommentDto> getList(int ref_group);
	public int getSequence();
}
