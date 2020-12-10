package com.example.city.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author astupidcoder
 * @since 2020-12-10
 */
@Data
@Builder
public class User {

    private String userId;

    private String userName;

    private String phone;

    private String avatar;

    private Boolean gender;


}
