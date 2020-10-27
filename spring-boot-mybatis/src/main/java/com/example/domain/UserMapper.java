package com.example.domain;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM test2 WHERE name =#{name}")
    User findByName(@Param("name") String name);



    @Results({
            @Result(property = "name",column="name"),
            @Result(property = "age",column = "age")

    })
    @Select("SELECT name, age FROM test2")
    List<User> findAll();

    @Insert("INSERT INTO test2(name, age) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name,@Param("age") int age);


    @Update("UPDATE test2 SET age=#{age} WHERE name=#{name}")
    void update(User user);


    @Delete("DELETE FROM test2 WHERE id =#{id}")
    void delete(int id);

    @Insert("INSERT INTO test2(name, age) VALUES(#{name}, #{age})")
    int insertByUser(User user);

    @Insert("INSERT INTO test1(name, age) VALUES(#{name,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER})")
    int insertByMap(Map<String, Object> map);
}
