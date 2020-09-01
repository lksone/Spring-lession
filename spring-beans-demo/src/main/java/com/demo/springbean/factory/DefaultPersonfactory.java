package com.demo.springbean.factory;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * @author lks
 */
public class DefaultPersonfactory implements PersonFactory, InitializingBean {


    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct的创建的初始化方式");
    }

    public void initSelf() {
        System.out.println("自定义方式初始话");
    }

    /**
     * Invoked by the containing {@code BeanFactory} after it has set all bean properties
     * and satisfied {@link BeanFactoryAware}, {@code ApplicationContextAware} etc.
     * <p>This method allows the bean instance to perform validation of its overall
     * configuration and final initialization when all bean properties have been set.
     *
     * @throws Exception in the event of misconfiguration (such as failure to set an
     *                   essential property) or if initialization fails for any other reason
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("实现init接口实现的方式获取");
    }
}
