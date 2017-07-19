package main.impl.generators;

import main.impl.ParticlesData;
import main.interfaces.Generator;

import java.util.Random;

/**
 * Created by Student on 7/18/2017.
 */
public class BoxPositionGenerator implements Generator {

    public static double[] pos = new double[]{640,360};
    public static double[] maxStartPosOffset = new double[]{10, 10};

    private static Random  rand = new Random();

    @Override
    public void generate(double dt, ParticlesData p, int startId, int endId) {

        double[] minPos = new double[]{pos[0] - maxStartPosOffset[0], pos[1] - maxStartPosOffset[1]};
        double[] maxPos = new double[]{pos[0] + maxStartPosOffset[0], pos[1] + maxStartPosOffset[1]};


        for(int i = startId; i < endId; i++)
        {
            p.pos[i][0] = minPos[0] + (maxPos[0] - minPos[0])*rand.nextDouble();
            p.pos[i][1] = minPos[1] + (maxPos[1] - minPos[1])*rand.nextDouble();
        }
    }
}
