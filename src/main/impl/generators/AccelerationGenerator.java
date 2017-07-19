package main.impl.generators;

import main.impl.ParticlesData;
import main.interfaces.Generator;

import java.util.Random;

/**
 * Created by Student on 7/18/2017.
 */
public class AccelerationGenerator implements Generator {

    public static double[] minAcc = new double[]{0.0,0};
    public static double[] maxAcc = new double[]{0.0,50.0};

    private static Random rand = new Random();

    @Override
    public void generate(double dt, ParticlesData p, int startId, int endId) {

        for(int i = startId; i < endId; i++)
        {
            p.acc[i][0] = minAcc[0] + (maxAcc[0] - minAcc[0])*rand.nextDouble();
            p.acc[i][1] = minAcc[1] + (maxAcc[1] - minAcc[1])*rand.nextDouble();
        }

    }
}
