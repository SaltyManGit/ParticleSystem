package main.impl.generators;

import main.impl.ParticlesData;
import main.interfaces.Generator;

import java.util.Random;

/**
 * Created by Student on 7/19/2017.
 */
public class CirclePosGenerator implements Generator {

    public static double[] center = new double[]{640,360};
    public static double radius = 10;

    private static Random rand = new Random();

    @Override
    public void generate(double dt, ParticlesData p, int startId, int endId) {

        double[] minPos = new double[]{center[0] - radius, center[1] - radius};
        double[] maxPos = new double[]{center[0] + radius, center[1] + radius};
        double[] point = new double[2];

        for(int i = startId; i < endId; i++)
        {

            while(true)
            {

                point[0] =  minPos[0] + (maxPos[0] - minPos[0])*rand.nextDouble();
                point[1] =  minPos[1] + (maxPos[1] - minPos[1])*rand.nextDouble();
                //System.out.println(point[0] + " , " + point[1] +'\n');
                if (isWithinRadius(point,radius))
                {
                    p.pos[i][0] = point[0];
                    p.pos[i][1] = point[1];
                    break;
                }
            }


        }

    }


    private  boolean isWithinRadius(double[] v, double radius)
    {
        return (center[0] -v[0])*(center[0]-v[0]) + (center[1] -v[1])*(center[1]-v[1]) <= radius * radius;
    }
}
