package org.springstudy.factory;

import org.springstudy.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

    // 存放bean
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    // 获取bean
    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    //注册bean
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
