package com.example.city.service.impl;

import com.baomidou.mybatisplus.core.mapper.Mapper;
import com.example.city.common.Result;
import com.example.city.common.ResultCode;
import com.example.city.entity.User;
import com.example.city.mapper.UserMapper;
import com.example.city.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2020-12-10
 */
@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Result queryById(Integer userId) {
        User  user = null;
        try{
            user = userMapper.queryById(userId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(user != null){
            return Result.success(user);
        }else {
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }
    }
}
