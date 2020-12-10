package com.example.city.mapper;

import com.example.city.entity.Service;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.city.entity.User;
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
public interface ServiceMapper {
    /**
     * 根据id查询用户
     * @param serviceId
     * @throws SQLException
     * @return Music
     */
    @Select("SELECT * FROM service WHERE id=#{serviceId} ")
    Service serviceById(String serviceId) throws SQLException;
}
