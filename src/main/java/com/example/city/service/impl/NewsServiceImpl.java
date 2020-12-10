package com.example.city.service.impl;

import com.example.city.common.Result;
import com.example.city.common.ResultCode;
import com.example.city.entity.News;
import com.example.city.entity.User;
import com.example.city.mapper.NewsMapper;
import com.example.city.mapper.UserMapper;
import com.example.city.service.INewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class NewsServiceImpl implements INewsService {

    @Resource
    private NewsMapper newsMapper;


    @Override
    public Result newsById(String newsId) {
        News news = null;
        try{
            news = newsMapper.newsById(newsId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(news != null){
            return Result.success(news);
        }else {
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }
    }
}
