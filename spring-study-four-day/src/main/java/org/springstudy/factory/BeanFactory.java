package org.springstudy.factory;

import org.springstudy.exception.BeansException;


public interface BeanFactory {

    /**
     * 处理bean中默认的构造函数
     * @param name bean名称
     * @return bean 对象
     * @throws BeansException 异常
     */
    Object getBean(String name) throws BeansException;

    /**
     * 处理bean中包含多个实例的构造函数
     * @param name bean 名称
     * @param args 参数
     * @return bean 对象
     * @throws BeansException 异常
     */
    Object getBean(String name, Object... args) throws BeansException;
}
