package ru.reeson2003.monster.impl;

import ru.reeson2003.monster.api.Monster;
import ru.reeson2003.monster.api.Parameters;

/**
 * Created by reeson on 28.01.17.
 */
public class MonsterImpl implements Monster {
    private String name;
    private Parameters parameters;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Parameters getParameters() {
        return parameters;
    }

    @Override
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "Monster: " + name + " " + parameters.toString();
    }
}
