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
public class Hospital{

    private String id;

    private String hospitalName;

    private String picture;

    private String desc;

    private String icon;

    private String url;

    private String deptId;

    private String deptName;


}
