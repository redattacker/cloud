package io.renren.modules;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper extends BaseMapper<Person> {
    Integer listCount();

    Person findPersonById(Integer id);
}