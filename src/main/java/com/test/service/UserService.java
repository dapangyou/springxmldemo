package com.test.service;

import com.test.entity.User;

/**
 * service接口 应该不会有什么逻辑 ,扫描包是针对于注解的 所以还是需要自己手动配置bean
 */
public interface UserService {

	/**
	 * 添加用户
	 */
	boolean addUrserInfo(User user);
}
