package com.elisa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yammer.metrics.core.Counter;
/**
 * Created by elisa on 18/08/15.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-context.xml");


        NamePrinter elisaNamePrint = (NamePrinter) context.getBean("elisaNamePrint");
        Counter nameCounter = (Counter) context.getBean("nameCounter");
        elisaNamePrint.printName();
        nameCounter.inc();
        System.out.println(nameCounter.count());
        //te.spellCheck();
        //Writer te = (Writer) context.getBean("writer");

    }
}
