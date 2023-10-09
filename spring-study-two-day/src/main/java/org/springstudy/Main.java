package org.springstudy;

import org.springstudy.bean.UserService;
import org.springstudy.factory.config.BeanDefinition;
import org.springstudy.factory.support.DefaultListableBeanFactory;

public class Main {
    public static void main(String[] args) {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);

        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService","zhangsan");
        userService.queryUserInfo();
    }

}