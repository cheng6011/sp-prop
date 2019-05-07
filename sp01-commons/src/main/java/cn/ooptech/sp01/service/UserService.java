package cn.ooptech.sp01.service;

import cn.ooptech.sp01.pojo.User;

public interface UserService {

	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}
