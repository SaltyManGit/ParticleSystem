package main.interfaces;

import main.impl.ParticlesData;

/**
 * Created by Sonic on 18.07.2017.
 */
public interface Updater {

    void update(double dt, ParticlesData p);
}
