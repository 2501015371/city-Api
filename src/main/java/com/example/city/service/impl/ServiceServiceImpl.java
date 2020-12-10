package com.example.city.service.impl;

import com.example.city.common.Result;
import com.example.city.common.ResultCode;
import com.example.city.mapper.ServiceMapper;
import com.example.city.service.IServiceService;
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
public class ServiceServiceImpl implements IServiceService {

    @Resource
    private ServiceMapper serviceMapper;

    @Override
    public Result serviceById(String serviceId) {
        com.example.city.entity.Service service = null;
        try{
            service =  serviceMapper.serviceById(serviceId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(service != null){
            return Result.success(service);
        }else {
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }
    }
}
