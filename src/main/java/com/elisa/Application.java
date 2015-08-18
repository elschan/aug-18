package com.elisa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yammer.metrics.core.Counter;
import com.yammer.metrics.core.Timer;
/**
 * Created by elisa on 18/08/15.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-context.xml");
        Timer processTimer = (Timer) context.getBean("processTimer");



        NamePrinter elisaNamePrint = (NamePrinter) context.getBean("elisaNamePrint");
        Counter nameCounter = (Counter) context.getBean("nameCounter");
        processTimer.time();
        elisaNamePrint.printName();
        nameCounter.inc();
        System.out.println(nameCounter.count());
        //te.spellCheck();
        //Writer te = (Writer) context.getBean("writer");
        Counter anotherCounter = (Counter) context.getBean("nameCounter");
        processTimer.stop();
        System.out.println(anotherCounter.count() + "in" + processTimer.time());

    }
}
