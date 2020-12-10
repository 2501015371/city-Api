package com.example.city.controller;


import com.example.city.common.Result;
import com.example.city.service.INewsService;
import com.example.city.service.IUserService;
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
@RequestMapping("/api/user/user-info")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private INewsService newsService;

    @GetMapping("/{userId}")
    public Result getUser(@PathVariable() Integer userId){
        return userService.queryById(userId);
    }

    @GetMapping("/{newsId}")
    public Result getNews(@PathVariable() String Id){
        return newsService.newsById(Id);
    }
}
