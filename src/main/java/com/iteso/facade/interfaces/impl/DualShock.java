package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.GameController;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 11/14/13
 * Time: 11:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class DualShock implements GameController {
    @Override
    public int on() {

        System.out.println("DualShock wireless controller is ON");
        return 1;
    }

    @Override
    public int off() {
        System.out.println("DualShock wireless controller is OFF");
        return 1;
    }
}
