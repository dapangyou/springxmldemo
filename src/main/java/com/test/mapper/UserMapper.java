package com.test.mapper;

import com.test.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * UserMapper接口  实现crud小demo
 */
public interface UserMapper {

	/**
	 * 添加用户
	 */
	int addUser(@Param("user") User user);
}
