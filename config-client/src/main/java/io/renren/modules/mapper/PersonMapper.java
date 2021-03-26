package io.renren.modules.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import io.renren.modules.entity.Person;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface PersonMapper extends BaseMapper<Person> {
    Integer listCount();

}