package ru.reeson2003.monster.api;

/**
 * Created by reeson on 28.01.17.
 */
public interface Monster {
    String getName();
    void setName(String name);
    Parameters getParameters();
    void setParameters(Parameters parameters);
    String toString();
}
