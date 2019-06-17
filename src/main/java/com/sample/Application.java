package com.sample;

import com.sample.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author <a href="mailto:ference.zeng@gmail.com">Ference</a>
 * @since 2019-06-06
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Person person = (Person)context.getBean("woman");
        person.setAge(18);

        System.out.println(person.getAge());


    }
}
