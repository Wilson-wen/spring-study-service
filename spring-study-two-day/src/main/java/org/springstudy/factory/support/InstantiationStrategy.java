package org.springstudy.factory.support;

import org.springstudy.BeansException;
import org.springstudy.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 定义实例化策略接口
 */
public interface InstantiationStrategy {
    /**
     * @param beanDefinition bean 实例
     * @param beanName       bean名称
     * @param ctor           java.lang.reflect 包下的 Constructor 类，里面包含了一些必要的类信息，有这个参数的目的就是为了拿到符合入参信息相对应的构造函数。
     * @param args           具体的入参信息了，最终实例化时候会用到
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
