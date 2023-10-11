package org.springstudy.test;

import cn.hutool.core.io.IoUtil;
import org.springstudy.bean.PropertyValue;
import org.springstudy.bean.PropertyValues;
import org.springstudy.factory.config.BeanDefinition;
import org.springstudy.factory.config.BeanReference;
import org.springstudy.factory.core.io.DefaultResourceLoader;
import org.springstudy.factory.core.io.Resource;
import org.springstudy.factory.support.DefaultListableBeanFactory;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
//        // 1.初始化 BeanFactory
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//
//        // 2. 注入bean
//        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
//
//        beanFactory.registerBeanDefinition("userService", beanDefinition);
//
//        // 3.获取bean
//        UserService userService = (UserService) beanFactory.getBean("userService","zhangsan");
//        userService.queryUserInfo();
        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
//        test_BeanFactory();
        test_file(resourceLoader);
    }


    public static void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("userId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        // 4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

    public static void test_classpath(DefaultResourceLoader resourceLoader) throws IOException {
        Resource resource = resourceLoader.getResource("classpath:important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    public static void test_file(DefaultResourceLoader resourceLoader) throws IOException {
        Resource resource = resourceLoader.getResource("spring-study-four-day/src/main/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    public static void test_url(DefaultResourceLoader resourceLoader) throws IOException {
        Resource resource = resourceLoader.getResource("jetbrains://idea/navigate/reference?project=spring-study-service&path=important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }


}