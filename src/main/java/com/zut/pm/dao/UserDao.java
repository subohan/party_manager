package com.zut.pm.dao;

import com.zut.pm.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserDao {

    @Insert("insert into user_info (account, password, name, cardid)value(#{account}, #{password}, #{name}, #{cardId})")
    void addUser(User user);

    @Select("select * from user_info where account = #{account}")
    User queryUserByAcc(String account);


}
