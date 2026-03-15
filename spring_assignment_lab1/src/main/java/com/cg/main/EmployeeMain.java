package com.cg.bean.L1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cg.bean.SBU;

public class EmpMain {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("bean.xml");

        SBU sbu = ctx.getBean(SBU.class);

        sbu.display();
    }
}