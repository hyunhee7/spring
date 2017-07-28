package com.test.step06.users.dao;

import java.util.List;

import com.test.step06.users.dto.UsersDto;

public interface UsersDao {
	public void insert(UsersDto dto);
	public boolean isValid(UsersDto dto);
	public UsersDto getData(String id);
	public void update(UsersDto dto);
	public void delete(String id);
	public List<UsersDto> getList();
	public boolean canUseId(String id);
}
