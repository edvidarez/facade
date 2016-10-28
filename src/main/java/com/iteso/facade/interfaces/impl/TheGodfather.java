package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movie;

/**
 * Created by Edmundo on 27/10/2016.
 */
public class TheGodfather implements Movie {
    public int play() {
        System.out.println("The Godfather has started");
        return 1;
    }

    public int stop() {
        System.out.println("The Godfather has stopped");
        return 1;
    }
}
