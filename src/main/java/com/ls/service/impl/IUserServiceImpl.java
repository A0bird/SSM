package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.IUserDao;
import com.ls.service.IUserService;
import com.ls.vo.Role;
import com.ls.vo.User;

@Service
public class IUserServiceImpl implements IUserService{

	@Autowired
	private IUserDao dao;
	
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		dao.add(user);
	}

	@Override
	public List<User> list(User user) {
		// TODO Auto-generated method stub
		return dao.list(user);
		
	}

	@Override
	public User findById(int Id) {
		// TODO Auto-generated method stub
		return dao.findById(Id);
	}

	@Override
	public void update(User user) throws Exception {
		// TODO Auto-generated method stub
		dao.update(user);
	}

	public void delete(Integer[] userId) {
		
		for(Integer id:userId) {
			
			User info=new User();
			
			info.setUserId(id);
			info.setUserMark("1");
			
			try {
				dao.update(info);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	@Override
	public List<User> findByName(User user) {
		// TODO Auto-generated method stub
		return dao.findByName(user);
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return dao.login(user);
	}

	@Override
	public User find(String userAccount) {
		// TODO Auto-generated method stub
		return dao.find(userAccount);
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return dao.getUser(user);
	}




}
