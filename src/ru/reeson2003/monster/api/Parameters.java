package ru.reeson2003.monster.api;

/**
 * Created by reeson on 28.01.17.
 */
public interface Parameters {
    Parameter getStrength();
    Parameter getIntellect();
    void setStrength(Parameter strength);
    void setIntellect(Parameter intellect);
    String toString();
}
