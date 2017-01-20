package com.springapp.mapper;

import java.util.List;

import com.springapp.model.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

	@Select("select user_id id,user_name userName from user_t")
	List<User> findAll();
}
