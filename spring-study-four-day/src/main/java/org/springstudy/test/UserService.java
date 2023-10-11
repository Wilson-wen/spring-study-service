package org.springstudy.test;


import lombok.Data;

@Data
public class UserService {

    private String userId;

    private String name;

    private String company;

    private String location;

    private UserDao userDao;

    public void queryUserInfo(){
        System.out.println("查询用户信息 " +  userDao.queryUserName(userId) + "!");
    }

    public UserService(){
    }

    public UserService (String name){
        this.name = name;
    }

}
