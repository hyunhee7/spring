package com.gura.step07.users.dao;

import com.gura.step07.users.dto.UsersDto;

public interface UsersDao {
	public void insert(UsersDto dto);
	public boolean isValid(UsersDto dto);
	public UsersDto getData(String id);
	public void update(UsersDto dto);
	public void delete(String id);
	public boolean canUseId(String id);
}
