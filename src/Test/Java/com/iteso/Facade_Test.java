package com.iteso;

import com.iteso.facade.MovieFacade;
import com.iteso.facade.VideoGameFacade;
import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 27/10/2016.
 */
public class Facade_Test {
    GameConsole ps3 = new PS3();
    GameConsole xbox = new XBOX();
    GameController dualShock = new DualShock();
    Lights lights = new EcoLights();
    Router linksys = new Linksys();
    SoundSystem bose = new Bose();
    TV tv = new SonyBravia();
    VideoGameFacade Test_console;
    MovieFacade netflix;
    Movie movie = new TheGodfather();
    @Before
    public void setUp()
    {
        Test_console = new VideoGameFacade(tv, ps3,dualShock,bose,linksys,lights);
        netflix = new MovieFacade(tv,bose,linksys,lights);
    }
       @Test
    public void testFasadConsola()
    {


        assertEquals (Test_console.playOnlineGame("Halo"),12);
        assertEquals (Test_console.stopPlayingGame(),6);
        Test_console = new VideoGameFacade(tv, xbox,dualShock,bose,linksys,lights);
        assertEquals (Test_console.playOnlineGame("Halo"),12);
        assertEquals (Test_console.stopPlayingGame(),6);
    }
    @Test
    public void testFasadNetflix()
    {


        assertEquals (netflix.playMovie(movie),8);
        assertEquals (netflix.stopPlayingMovie(),5);
    }

}
