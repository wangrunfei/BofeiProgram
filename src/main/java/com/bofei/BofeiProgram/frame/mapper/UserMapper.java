package com.bofei.BofeiProgram.frame.mapper;

import com.bofei.BofeiProgram.frame.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from sys_user")
    public List<User> findUserInfo();

    public int addUserInfo(User user);

    public int delUserInfo(int id);

}
