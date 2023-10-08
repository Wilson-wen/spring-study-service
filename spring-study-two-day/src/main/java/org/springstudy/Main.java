package org.springstudy;

import org.springstudy.bean.UserService;
import org.springstudy.factory.config.BeanDefinition;
import org.springstudy.factory.support.DefaultListableBeanFactory;

public class Main {
    public static void main(String[] args) {
        // 初始化bean
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
}