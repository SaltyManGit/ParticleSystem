package main.impl.generators;


import main.impl.ParticlesData;
import main.interfaces.Generator;

import java.awt.*;
import java.util.Random;

import static java.lang.Math.abs;

/**
 * Created by Sonic on 18.07.2017.
 */
public class BasicColorGenerator implements Generator {

    public static int[] minStartCol = new int[]{255,0,0};
    public static int[] maxStartCol = new int[]{255,100,65};
    public static int[] minEndCol = new int[]{250,255,0};
    public static int[] maxEndCol = new int[]{255,255,153};

    private static Random rand = new Random();

    @Override
    public void generate(double dt, ParticlesData p, int startId, int endId) {

        for (int i = startId; i< endId; i++)
        {

            p.startCol[i][0] = rand.nextInt(maxStartCol[0] - minStartCol[0] + 1) + minStartCol[0];
            p.startCol[i][1] = rand.nextInt(maxStartCol[1] - minStartCol[1] + 1 )+ minStartCol[1];
            p.startCol[i][2] = rand.nextInt(maxStartCol[2] - minStartCol[2] + 1) + minStartCol[2];


            p.endCol[i][0] = rand.nextInt(maxEndCol[0] - minEndCol[0] + 1) + minEndCol[0];
            p.endCol[i][1] = rand.nextInt(maxEndCol[1] - minEndCol[1] + 1) + minEndCol[1];
            p.endCol[i][2] = rand.nextInt(maxEndCol[2] - minEndCol[2] + 1) + minEndCol[2];


        }

    }
}
