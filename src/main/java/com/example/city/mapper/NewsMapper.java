package com.example.city.mapper;

import com.example.city.entity.News;
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
public interface NewsMapper {

    /**
     * 根据id查询用户
     * @param Id
     * @throws SQLException
     * @return Music
     */
    @Select("SELECT * FROM news WHERE id=#{Id} ")
    News newsById(String Id) throws SQLException;
}
