package main.impl;

import main.impl.emitters.ParticleEmitter;
import main.impl.generators.*;
import main.impl.updaters.BasicColorUpdater;
import main.impl.updaters.BasicTimeUpdater;
import main.impl.updaters.EulerUpdater;
import main.impl.updaters.FloorUpdater;
import main.interfaces.Emitter;
import main.interfaces.Generator;
import main.interfaces.Updater;

import java.awt.*;

/**
 * Created by Student on 7/18/2017.
 */
public class Demo {

    public static void main(String[] args) {

        int MAX_COUNT = 500;
        int FPS = 60;



        ParticleSystem system = new ParticleSystem(MAX_COUNT);

        Generator timeGen = new BasicTimeGenerator();
       // Generator posGen = new BoxPositionGenerator();
        Generator posGen = new CirclePosGenerator();
       // Generator posGen = new SectorPositionGenerator();
        Generator velGen = new VelocityGenerator();
        //Generator accGen = new AccelerationGenerator();
        Generator colGen = new BasicColorGenerator();

        Emitter emitter = new ParticleEmitter();
        emitter.addGenerator(timeGen);
        emitter.addGenerator(posGen);
        emitter.addGenerator(velGen);
        //emitter.addGenerator(accGen);
        emitter.addGenerator(colGen);

        Updater timeUpd = new BasicTimeUpdater();
        Updater posUpd = new EulerUpdater();
        //Updater floorUpd = new FloorUpdater();
        Updater colUpd = new BasicColorUpdater();

        system.addEmitter(emitter);

        system.addUpdater(timeUpd);
        system.addUpdater(posUpd);
       // system.addUpdater(floorUpd);
        system.addUpdater(colUpd);

        double dt = 1.0/FPS;
        long dtMillSec = (long)( dt * 1000);
        System.out.println(dtMillSec);


        try {
            while (true) {
                system.update(dt);
                Thread.sleep(dtMillSec);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
