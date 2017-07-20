package main.impl.emitters;

import main.interfaces.Emitter;
import main.interfaces.Generator;
import main.impl.ParticlesData;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Student on 7/18/2017.
 */
public class ParticleEmitter implements Emitter {

    public  static double emitRate = 6000;
    public List<Generator> generators;


    public ParticleEmitter()
    {
        generators = new LinkedList<>();
    }

    public void addGenerator(Generator gen)
    {
        generators.add(gen);
    }


    public void emit(double dt, ParticlesData p)
    {
        double maxNewParticles = dt * emitRate;
        int startId = p.countAlive;
        int endId = (int) Math.min(startId + maxNewParticles, p.maxCount - 1);
        for(Generator gen : generators)
            gen.generate(dt,p,startId,endId);

        for(int i = startId; i < endId; i++)
            p.wake(i);

    }

}
