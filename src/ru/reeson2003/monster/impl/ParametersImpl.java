package ru.reeson2003.monster.impl;

import ru.reeson2003.monster.api.Parameter;
import ru.reeson2003.monster.api.Parameters;

/**
 * Created by reeson on 28.01.17.
 */
public class ParametersImpl implements Parameters{
    private Parameter strength;
    private Parameter intellect;

    @Override
    public Parameter getStrength() {
        return strength;
    }

    @Override
    public Parameter getIntellect() {
        return intellect;
    }

    @Override
    public void setStrength(Parameter strength) {
        this.strength = strength;
    }

    @Override
    public void setIntellect(Parameter intellect) {
        this.intellect = intellect;
    }

    @Override
    public String toString() {
        return "{" + strength.toString() + "; " + intellect.toString() + "}";
    }
}
