package com.example.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="用户信息",description="用户信息")
public class User {

    @ApiModelProperty(value="用户id",name="id",example="xxx",required=true)
    private String id;

    @ApiModelProperty(value="用户age",name="age",example="16",required=true)
    private int age;

    @ApiModelProperty(value="用户name",name="name",example="张三",required=true)
    private String name;

    public User(String id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
