package main.impl.generators;

import main.impl.ParticlesData;
import main.interfaces.Generator;

import java.util.Random;

/**
 * Created by Student on 7/18/2017.
 */
public class VelocityGenerator implements Generator {

    public static double[] minVel = new double[]{-10.0,30.0};
    public static double[] maxVel = new double[]{10.0,40.0};

    private static Random rand = new Random();

    @Override
    public void generate(double dt, ParticlesData p, int startId, int endId) {

        for(int i = startId; i < endId; i++)
        {
            p.vel[i][0] = minVel[0] + (maxVel[0] - minVel[0])*rand.nextDouble();
            p.vel[i][1] = minVel[1] + (maxVel[1] - minVel[1])*rand.nextDouble();
        }

    }
}
