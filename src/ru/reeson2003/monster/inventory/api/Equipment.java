package ru.reeson2003.monster.inventory.api;

import ru.reeson2003.monster.api.Parameters;

import java.util.List;

/**
 * Created by reeson on 29.01.17.
 */
public interface Equipment {
    List<Equip> getEquipment();
    Parameters getTotalParameters();
}
