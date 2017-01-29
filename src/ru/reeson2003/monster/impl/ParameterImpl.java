package ru.reeson2003.monster.impl;

import org.springframework.beans.factory.annotation.Required;
import ru.reeson2003.monster.api.Parameter;

/**
 * Created by reeson on 28.01.17.
 */
public class ParameterImpl implements Parameter {
    private String info;
    private int value;

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Required
    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return info + " = " + value;
    }
}
