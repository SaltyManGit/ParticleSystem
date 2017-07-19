package main.interfaces;

import main.impl.ParticlesData;

/**
 * Created by Sonic on 18.07.2017.
 */
public interface Generator {

    void generate(double dt, ParticlesData p, int startId, int endId);
}
