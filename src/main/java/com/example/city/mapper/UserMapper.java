package com.example.city.mapper;

import com.example.city.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author astupidcoder
 * @since 2020-12-10
 */
public interface UserMapper {
    /**
     * 根据id查询用户
     * @param userId
     * @throws SQLException
     * @return Music
     */
    @Select("SELECT * FROM user WHERE user_id=#{userId} ")
    User queryById(Integer userId) throws SQLException;
}
