package org.springstudy.test;

public class UserService {

    private String userId;

    private String name;

    private UserDao userDao;

    public void queryUserInfo(){
        System.out.println("查询用户信息 " +  userDao.queryUserName(userId) + "!");
    }

    public UserService(){
    }

    public UserService (String name){
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
