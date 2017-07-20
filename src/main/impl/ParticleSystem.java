package main.impl;

import main.interfaces.Emitter;
import main.interfaces.Updater;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Salty Man on 18.07.2077.
 */
public class ParticleSystem {

    private ParticlesData particles;
    private int maxCount;
    private List<Emitter> emitters;
    private List<Updater> updaters;
    private Render render;

    public ParticleSystem(int maxCount)
    {
        this.maxCount = maxCount;
        particles = new ParticlesData(maxCount);
        emitters = new LinkedList<>();
        updaters = new LinkedList<>();
        render = new Render(particles.pos, particles.col);
        render.setVisible(true);
    }

    public void addEmitter(Emitter emitter)
    {
        emitters.add(emitter);
    }

    public void addUpdater(Updater updater)
    {
        updaters.add(updater);
    }

    public void update(double dt)
    {



        for(Emitter em : emitters)
            em.emit(dt, particles);


      /* for(int i = 0; i < maxCount; i++)
        {
            System.out.println("vel: " + particles.vel[i][0]);
       }*/

        for(Updater upd : updaters)
            upd.update(dt, particles);

        render.update(particles.countAlive);

    }

}
