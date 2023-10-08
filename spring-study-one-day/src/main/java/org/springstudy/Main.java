package org.springstudy;

import org.springstudy.bean.UserService;
import org.springstudy.factory.BeanFactory;

public class Main {
    public static void main(String[] args) {
        // 初始化工厂方法
        BeanFactory beanFactory = new BeanFactory();

        // 初始化bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());

        // 注册bean
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取bean
        UserService userService =  (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}