package com.test.demo.client;

import com.test.demo.beanelements.BeanFirst;
import com.test.demo.beanelements.BeanSecond;
import com.test.demo.beanelements.BeanThird;
import com.test.demo.configbeanelements.ConfigBeanElements;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientBeanElements {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigBeanElements.class);
        BeanFirst beanFirst = context.getBean(BeanFirst.class);
        beanFirst.print("msg for bean first");
        BeanSecond beanSecond = context.getBean(BeanSecond.class);
        beanSecond.print("msg for bean second");
        BeanThird beanThird = context.getBean(BeanThird.class);
        beanThird.print("msg for bean third");
        // by bean name
        BeanFirst beanFirst2 = (BeanFirst) context.getBean("beanFirst-custom-name");
        beanFirst2.print("msg for bean first");
        BeanSecond beanSecond2 = (BeanSecond) context.getBean("bean2");
        beanSecond2.print("msg for bean second");

    }
}
