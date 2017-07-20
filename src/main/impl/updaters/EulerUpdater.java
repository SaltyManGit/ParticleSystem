package main.impl.updaters;

import main.impl.ParticlesData;
import main.interfaces.Updater;

/**
 * Created by Student on 7/18/2017.
 */
public class EulerUpdater implements Updater {

    //public static double[] acceleration = {0.0, 1.0};

    @Override
    public void update(double dt, ParticlesData p) {

        //double[] globalA = {acceleration[0] * dt, acceleration[1] * dt};
        double localDT = dt;

        int endId = p.countAlive;
        /*for (int i = 0; i < endId; i++)
        {
            p.acc[i][0] += globalA[0];
            p.acc[i][1] += globalA[1];

        }*/
        for (int i = 0; i < endId; i++)
        {
            p.vel[i][0] += localDT * p.acc[i][0];
            p.vel[i][1] += localDT * p.acc[i][1];

        }
        for (int i = 0; i < endId; i++)
        {
            p.pos[i][0] += localDT * p.vel[i][0];
            p.pos[i][1] += localDT * p.vel[i][1];
        }
    }
    }
