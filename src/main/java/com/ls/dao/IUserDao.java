package com.ls.dao;

import java.util.List;

import com.ls.vo.User;

public interface IUserDao {
		public void add(User user);
		public List<User> list(User user);
		public User findById(int Id);
		public void update(User user)throws Exception;
		public void delete(Integer[] userId)throws Exception;
		public List<User> findByName(User user);
		
		public User login(User user);
		
		public User find(String userAccount);

		public User getUser(User user);
}
