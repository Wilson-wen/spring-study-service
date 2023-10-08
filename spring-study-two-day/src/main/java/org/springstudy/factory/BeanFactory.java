package org.springstudy.factory;

import org.springstudy.BeansException;


public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
