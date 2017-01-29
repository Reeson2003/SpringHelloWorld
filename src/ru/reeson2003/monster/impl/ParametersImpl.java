package ru.reeson2003.monster.impl;

import ru.reeson2003.monster.api.Parameter;
import ru.reeson2003.monster.api.Parameters;

import java.util.List;

/**
 * Created by reeson on 28.01.17.
 */
public class ParametersImpl implements Parameters{
    private List<Parameter> parameters;

    @Override
    public List<Parameter> getParameters() {
        return parameters;
    }

    @Override
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return parameters.toString();
    }
}
