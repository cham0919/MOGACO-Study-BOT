package com.flat.mogaco.common.util;

import com.flat.mogaco.common.spring.ApplicationContextProvider;
import org.springframework.context.ApplicationContext;

public class BeanUtils {

    public static Object getBean(Class<?> beanId) {

        ApplicationContext applicationContext = ApplicationContextProvider.getApplicationContext();

        if (applicationContext == null) {
            throw new NullPointerException("Spring의 ApplicationContext초기화 안됨");
        }

        /*
        String[] names = applicationContext.getBeanDefinitionNames();
        for (int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
        */

        return applicationContext.getBean(beanId);
    }
}


