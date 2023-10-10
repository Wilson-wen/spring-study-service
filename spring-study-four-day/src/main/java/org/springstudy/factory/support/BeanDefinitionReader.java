package org.springstudy.factory.support;

import org.springstudy.exception.BeansException;
import org.springstudy.factory.core.io.Resource;
import org.springstudy.factory.core.io.ResourceLoader;

public interface BeanDefinitionReader {

    /**
     * 注册方法
     * @return
     */
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    /**
     * 加载bean的方法
     * @param resource
     * @throws BeansException
     */
    void loadBeanDefinitions(Resource resource) throws BeansException;
    void loadBeanDefinitions(Resource... resources) throws BeansException;
    void loadBeanDefinitions(String location) throws BeansException;
}
