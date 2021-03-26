package com.macro.cloud;

import io.renren.modules.entity.Person;
import io.renren.modules.mapper.PersonMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersonMapperTest.class)
public class PersonMapperTest {
    @Autowired
    private PersonMapper personMapper;
    @Test
    public void addUser() {
        Person person = new Person();
        person.setId(10001);
        person.setName("盖伦");
        person.setAge(25);
        person.setAddress("德玛西亚");
        personMapper.insert(person);
    }
    @Test
    public void listCountTest() {
        System.out.println(personMapper.listCount());
    }


}