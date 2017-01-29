package ru.reeson2003.monster.inventory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.reeson2003.monster.api.Parameters;
import ru.reeson2003.monster.impl.ParametersImpl;
import ru.reeson2003.monster.inventory.api.Equip;
import ru.reeson2003.monster.inventory.api.Equipment;
import ru.reeson2003.monster.inventory.impl.EquipImpl;
import ru.reeson2003.monster.inventory.impl.EquipmentImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reeson on 29.01.17.
 */
@Configuration
public class EquipmentConfig {

    @Bean
    @Scope("prototype")
    public Equipment equipment() {
        return new EquipmentImpl(createEquipList());
    }

    private List<Equip> createEquipList() {
        List<Equip> result = new ArrayList<>();
        Equip sword = new EquipImpl("Sword", new ParametersImpl());
        Equip armor = new EquipImpl("Armor", new ParametersImpl());
        result.add(sword);
        result.add(armor);
        return result;
    }

    @Bean
    public Equip equip() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/Beans.xml");
        Parameters parameters = (Parameters) context.getBean("Parameters");
        EquipImpl bfg = new EquipImpl("BFG", parameters);
        return bfg;
    }
}
