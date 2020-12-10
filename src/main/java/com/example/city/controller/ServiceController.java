package com.example.city.controller;


import com.example.city.common.Result;
import com.example.city.service.INewsService;
import com.example.city.service.IServiceService;
import com.example.city.service.impl.ServiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2020-12-10
 */
@RestController
@RequestMapping("/api/service/service-info")
public class ServiceController {

    @Autowired
    private IServiceService serviceService;

    @GetMapping("/{serviceId}")
    public Result getService(@PathVariable String serviceId){
        return serviceService.serviceById(serviceId);
    }
}
