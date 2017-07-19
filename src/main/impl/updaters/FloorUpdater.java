package main.impl.updaters;

import main.impl.ParticlesData;
import main.interfaces.Updater;

/**
 * Created by Student on 7/18/2017.
 */
public class FloorUpdater implements Updater {

    public static double floorY = 640.0;
    public static double bounceFactor = 0.5;

    @Override
    public void update(double dt, ParticlesData p) {

        double localDT = dt;
        int endId = p.countAlive;
        for(int i = 0; i < endId; i++)
        {
            if(p.pos[i][1] > floorY)
            {
                double[] force = p.acc[i];
                double normalFactor = dot(force, new double[]{0,1});
                if(normalFactor < 0.0)
                {
                    double[] tmp = new double[]{0,1};
                    tmp[0] *= normalFactor;
                    tmp[1] *= normalFactor;
                    force[0] -= tmp[0];
                    force[1] -= tmp[1];
                }

                double velFactor = dot(p.vel[i], new double[]{0,1});
                p.vel[i][1] -= (1 + bounceFactor)*velFactor;
                p.acc[i][0] = force[0];
                p.acc[i][1] = force[1];

            }


        }
    }

    private double dot(double[] a, double[] b)
    {
        return a[0]*b[0] + a[1]*b[1];
    }
}
