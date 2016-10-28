package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Lights;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class EcoLights implements Lights {
    @Override
    public int on() {

        System.out.println("EcoLights are ON");
        return 1;
    }

    @Override
    public int off() {

        System.out.println("EcoLights are OFF");
        return 1;
    }
}
