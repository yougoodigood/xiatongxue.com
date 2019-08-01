package com.xiayu.module.user.service.iocdemo;

public interface BeanDefinitionRegistry {

    /**
     * 注册bean
     * @param beanName
     * @param beanDefinition
     * @throws Exception
     */
    void registerBeanDefinition(String beanName,BeanDefinition beanDefinition) throws Exception;

    /**
     * 获取bean
     * @param beanName
     * @return
     */
    BeanDefinition getBeanDefinition(String beanName);

    /**
     * 判断bean是否已经被注册
     * @param beanName
     * @return
     */
    Boolean containsBeanDefinition(String beanName);
}
