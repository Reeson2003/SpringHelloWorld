package ru.reeson2003.monster.inventory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.reeson2003.monster.inventory.api.Equip;
import ru.reeson2003.monster.inventory.api.Equipment;

/**
 * Created by reeson on 29.01.17.
 */
public class MainItem {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EquipmentConfig.class);
        Equipment equipment = context.getBean(Equipment.class);
        System.out.println(equipment.toString());
        Equip equip = context.getBean(Equip.class);
        System.out.println(equip.getInfo() + equip.getParameters());
    }
}
