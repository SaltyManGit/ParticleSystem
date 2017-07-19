package main.impl.updaters;


import main.impl.ParticlesData;
import main.interfaces.Updater;

import java.awt.*;

/**
 * Created by Sonic on 18.07.2017.
 */
public class BasicColorUpdater implements Updater{


    @Override
    public void update(double dt, ParticlesData p) {

        int endId = p.countAlive;
        for (int i = 0; i < endId; i++)
        {
            p.col[i] = mix(p.startCol[i],p.endCol[i],p.time[i][1]);
        }
    }

    private Color mix(int[] x, int[] y, double a)
    {
       return new Color((int)( x[0] * (1.0 - a) + y[0] * a),
               (int)(x[1] * (1.0 - a) + y[1] * a),
               (int)( x[2] * (1.0 - a) + y[2] * a), 150);
    }
}
