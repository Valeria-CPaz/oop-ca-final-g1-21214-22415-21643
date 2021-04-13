package com.company.alexson;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Login login = new Login(); //creates a frame
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        login.setResizable(false); //prevent frame from being resized
        login.setSize(660, 440); //sets the x-dimension, and y-dimension of frame
        login.setVisible(true); //make frame visible

        StudentPage studentPage = new StudentPage(); //creates a frame
        studentPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        studentPage.setResizable(false); //prevent frame from being resized
        studentPage.setSize(800, 533); //sets the x-dimension, and y-dimension of frame
        studentPage.setVisible(true); //make frame visible


        StudentRegistration sr = new StudentRegistration();
        sr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sr.setResizable(false);
        sr.setSize(450,450);
        sr.setVisible(true);

//        Login test = new Login();
//        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        test.setSize(660,440);
//        test.setVisible(true);


    }
}
