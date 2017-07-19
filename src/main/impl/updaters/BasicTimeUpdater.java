package main.impl.updaters;

import main.impl.ParticlesData;
import main.interfaces.Updater;

/**
 * Created by Student on 7/18/2017.
 */
public class BasicTimeUpdater implements Updater {

    @Override
    public void update(double dt, ParticlesData p) {

        int endId = p.countAlive;
        double localDT = dt;

        for (int i = 0; i < endId; i++)
        {
            p.time[i][0] -= localDT;
            p.time[i][1] = 1.0 - (p.time[i][0] * p.time[i][2]);

            if(p.time[i][0] < 0.0)
            {
                p.kill(i);
                endId = p.countAlive < p.maxCount ? p.countAlive : p.maxCount;

            }
        }

    }
}
