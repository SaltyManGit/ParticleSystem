package main.impl;


import main.Things;

import java.awt.*;

/**
 * Created by Sonic on 18.07.2017.
 */
public class ParticlesData {

    public double[][] pos;
    public double[][] acc;
    public double[][] vel;
    public Color[] col;
    public int[][] startCol;
    public int[][] endCol;
    public double[][] time; // [x,z,w]
    public boolean[] alive;


    public int maxCount;
    public int countAlive;

    public ParticlesData(int maxCount)
    {
        generate(maxCount);

    }


    public void generate(int maxCount)
    {
        this.maxCount = maxCount;
        countAlive = 0;
        pos = new double[maxCount][2];
        acc = new double[maxCount][2];
        vel = new double[maxCount][2];
        col = new Color[maxCount];
        startCol = new int[maxCount][3];
        endCol = new int[maxCount][3];
        time = new double[maxCount][3];
        alive = new boolean[maxCount];

    }

    public void kill(int id)
    {
        if(countAlive > 0)
        {
            alive[id] = false;
            swapData(id, countAlive - 1);
            countAlive--;
        }
    }
    public void wake(int id)
    {
        if (countAlive < maxCount)
        {
            alive[id] = true;
            swapData(id, countAlive);
            countAlive++;
        }
    }
    public void swapData(int a, int b)
    {
        Things.swap(pos,a,b);
        Things.swap(acc,a,b);
        Things.swap(vel,a,b);
        Things.swap(col,a,b);
        Things.swap(startCol,a,b);
        Things.swap(endCol,a,b);
        Things.swap(time,a,b);
        Things.swap(alive,a,b);
    }


}
