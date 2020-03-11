package com.example.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.dao.UserMapper;
import com.example.demo.domain.User;


@Service

public class UserService implements UserMapper{



@Autowired

UserMapper userMapper;



@Override

public List<User> getAll() {

return userMapper.getAll();

}



@Override
public User logincheck(User user) {

	User u = userMapper.logincheck(user);

	return u;

}


@Override
public void register(User user) {

	userMapper.register(user);

	

}



@Override
public boolean update(User user){
    return userMapper.update(user);
}



@Override
public User findUserById(int id) {
	// TODO Auto-generated method stub
	User user = userMapper.findUserById(id);
    return user;
}



@Override
public boolean delete(int id) {
	// TODO Auto-generated method stub
	return userMapper.delete(id);
}



@Override
public boolean updateUser(User user) {
	// TODO Auto-generated method stub
	return userMapper.updateUser(user);
}





}
