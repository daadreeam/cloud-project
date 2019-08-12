package com.lsw.userservice.mapper;

import com.lsw.userservice.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
}
