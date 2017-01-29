package ru.reeson2003.monster.inventory.impl;

import ru.reeson2003.monster.api.Parameter;
import ru.reeson2003.monster.api.Parameters;
import ru.reeson2003.monster.impl.ParametersImpl;
import ru.reeson2003.monster.inventory.api.Equip;
import ru.reeson2003.monster.inventory.api.Equipment;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by reeson on 29.01.17.
 */
public class EquipmentImpl implements Equipment {
    private List<Equip> equipment;

    public EquipmentImpl(List<Equip> equipment) {
        this.equipment = equipment;
    }

    @Override
    public List<Equip> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equip> equipment) {
        this.equipment = equipment;
    }

    @Override
    public Parameters getTotalParameters() {
        Parameters total = new ParametersImpl();
        List<Parameter> parameters = new LinkedList<>();
        for (Equip e: equipment) {
            List<Parameter> p = e.getParameters().getParameters();
            parameters.addAll(p);
        }
        total.setParameters(parameters);
        return total;
    }

    @Override
    public String toString() {
        String result = "Equipment: {";
        for (Equip e: equipment) {
            result += e.getInfo();
            result += " ";
        }
        result += "}";
        return result;
    }
}
