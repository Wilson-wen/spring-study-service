package org.springstudy.factory.support;

import org.springstudy.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName       bean名称
     * @param beanDefinition bean对象
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
