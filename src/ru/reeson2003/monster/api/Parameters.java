package ru.reeson2003.monster.api;

import java.util.List;

/**
 * Created by reeson on 28.01.17.
 */
public interface Parameters {
    List<Parameter> getParameters();
    void setParameters (List<Parameter> parameters);
    String toString();
}
