package io.renren.modules.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("person")
public class Person {
    @TableId(value = "id")
    private Integer id;
    private String name;
    private Integer age;
    private String address;

}