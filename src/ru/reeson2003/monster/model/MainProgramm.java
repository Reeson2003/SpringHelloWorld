package ru.reeson2003.monster.model;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.reeson2003.monster.api.Monster;

/**
 * Created by reeson on 28.01.17.
 */
public class MainProgramm {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config/Beans.xml");
        Monster monster = (Monster) context.getBean("AntQueen");
        System.out.println(monster);
    }
}
