package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.PS3Game;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 8:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class VideoGameFacade {
    TV tv;
    GameConsole console;
    GameController controller;
    SoundSystem soundSystem;
    Router router;
    Lights lights;
    VideoGame game;

    public VideoGameFacade(TV tv,
                           GameConsole console,
                           GameController controller,
                           SoundSystem soundSystem,
                           Router router,
                           Lights lights){
        this.tv = tv;
        this.console = console;
        this.controller = controller;
        this.soundSystem = soundSystem;
        this.router = router;
        this.lights = lights;
    }


    public int playOnlineGame(String gameName){

        System.out.println("Turning the system ON, this may take some time");
        System.out.println();
    int sum=0;
        sum+=tv.on();
        sum+=tv.toHDMI();

       sum+= console.on();
       sum+= controller.on();
        game = new PS3Game(gameName);
       sum+= console.insertGame(game);

      sum+=  soundSystem.on();
      sum+=  soundSystem.toOpticalEntry();

      sum+=  router.on();
      sum+=  router.checkInternet();

        sum+=  lights.off();

      sum+=  game.setOnlineMode();
      sum+=  game.play();
        System.out.println();
    return sum;

    }

    public int stopPlayingGame(){
    int sum=0;
        System.out.println();
        System.out.println("Turning the system OFF, this may take some time");
        System.out.println();
       sum+= lights.on();
       sum+= tv.off();
       sum+= controller.off();
       sum+= console.off();
       sum+= soundSystem.off();
       sum+= router.off();
        return sum;

    }


}
