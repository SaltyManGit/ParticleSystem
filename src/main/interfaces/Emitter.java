package main.interfaces;

import main.impl.ParticlesData;

/**
 * Created by Sonic on 18.07.2017.
 */
public interface Emitter {

    void addGenerator(Generator gen);
    void emit(double dt, ParticlesData p);
}
