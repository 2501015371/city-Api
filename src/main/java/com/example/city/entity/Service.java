package com.example.city.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("Service")
public class Service {


    private String id;

    private String serviceName;

    private String serviceType;

    private String icon;

    private String uri;

    private String desc;


}
