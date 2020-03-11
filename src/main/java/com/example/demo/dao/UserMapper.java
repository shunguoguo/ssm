package com.example.demo.dao;




import java.util.List;



import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;






@Mapper //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可

@Repository

public interface UserMapper{

List<User> getAll();
User logincheck(User user);
void register(User user);
boolean update(User user);

User findUserById(int id);
boolean delete(int id);
boolean updateUser(User user);
}
