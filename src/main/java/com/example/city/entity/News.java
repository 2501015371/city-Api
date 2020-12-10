package com.example.city.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("news")
public class News{

    private String id;

    private String title;

    @TableField(value = "abstract")
    private String mAbstract;

    private String picture;

    private String newsType;

    private String url;

    private String tag;


}
