package com.example.city.service;

import com.example.city.common.Result;
import com.example.city.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author astupidcoder
 * @since 2020-12-10
 */
public interface IUserService{
    /**
     * 根据查询id查音乐
     * @param userId
     * @return Result
     */
    Result queryById(Integer userId);

}
