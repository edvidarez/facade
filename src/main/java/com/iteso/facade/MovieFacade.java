package com.iteso.facade;

import com.iteso.facade.interfaces.*;

/**
 * Created by Edmundo on 27/10/2016.
 */
public class MovieFacade {
    TV tv;
    SoundSystem soundSystem;
    Router router;
    Lights lights;
    Movie movie;
    public MovieFacade(TV tv,
            SoundSystem soundSystem,
            Router router,
            Lights lights)
    {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.router = router;
        this.lights = lights;
    }
    public int playMovie(Movie movie)
    {
        this.movie = movie;
        System.out.println("Turning the system ON, this may take some time");
        System.out.println();
    int sum=0;
        sum+=tv.on();
        sum+=tv.toHDMI();


        sum+= soundSystem.on();
        sum+= soundSystem.toOpticalEntry();

        sum+= router.on(); //pal netflix
        sum+= router.checkInternet();

        sum+= lights.off();

        sum+= movie.play();

        System.out.println();
        return sum;
    }
    public int stopPlayingMovie(){
    int sum=0;
        System.out.println();
        System.out.println("Turning the system OFF, this may take some time");
        System.out.println();
        sum+= lights.on();
        sum+= tv.off();
        sum+= soundSystem.off();
        sum+= movie.stop();
        sum+= router.off();
        return sum;

    }
}
