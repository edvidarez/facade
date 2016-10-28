package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Router;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Linksys implements Router {
    @Override
    public int on() {
        System.out.println("Linksys router is ON");
        return 1;
    }

    @Override
    public int off() {

        System.out.println("Linksys router is OFF");
        return 1;
    }

    @Override
    public int checkInternet() {
        System.out.println("Checking internet connection");
        System.out.println("Internet connection is OK");
        return 1;
    }
}
