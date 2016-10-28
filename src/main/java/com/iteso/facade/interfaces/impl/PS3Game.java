package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.VideoGame;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class PS3Game implements VideoGame {
    String name;
    public PS3Game(String name){
        this.name = name;
    }

    @Override
    public int setOnlineMode() {

        System.out.println("Setting Online mode on " + name);
        return 1;
    }

    @Override
    public int play() {

        System.out.println("Playing " + name);
        return 1;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
