package ru.reeson2003.monster.inventory.impl;

import ru.reeson2003.monster.api.Parameters;
import ru.reeson2003.monster.inventory.api.Equip;


public class EquipImpl implements Equip {
    private String info;
    private Parameters parameters;

    public EquipImpl(String info, Parameters parameters) {
        this.info = info;
        this.parameters = parameters;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public Parameters getParameters() {
        return parameters;
    }
}
