package com.xing.shardingjdbc.mapper;

import com.xing.shardingjdbc.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description: TODO
 * @Author DXX
 * @Date 2021/9/10
 **/
public interface UserMapper {

    /**
     * @author
     * @description 保存用户
     * @params [user]
     * @date 2021/3/10 17:14
     */
    @Insert("insert into ksd_user(nickname,password,sex,birthday) values(#{nickname},#{password},#{sex},#{birthday})")
    void addUser(User user);
    /**
     * @author
     * @description 查询用户
     * @params [user]
     * @date 2021/3/10 17:14
     */
    @Select("select * from ksd_user")
    List<User> findUsers();
}
