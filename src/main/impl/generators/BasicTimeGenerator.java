package main.impl.generators;

import main.impl.ParticlesData;
import main.interfaces.Generator;

import java.util.Random;

/**
 * Created by Student on 7/18/2017.
 */
public class BasicTimeGenerator implements Generator {

    public static double minTime = 1;
    public static double maxTime = 2;

    private static Random rand = new Random();

    @Override
    public void generate(double dt, ParticlesData p, int startId, int endId) {

        for(int i = startId; i < endId; i++)
        {
            p.time[i][0] = minTime + (maxTime - minTime)*rand.nextDouble();
            p.time[i][1] = 0.0;
            p.time[i][2] = 1.0/p.time[i][0];
        }

    }
}
