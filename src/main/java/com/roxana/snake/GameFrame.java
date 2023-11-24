package com.roxana.snake;

import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame(){

        //GamePanel panel = new GamePanel();
        this.add(new GamePanel());// this behaves just like using the line above and inserting panel in the this.add()
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();//if we add components to the JFrame this function takes out JFrame snugly around the components
        this.setVisible(true);
        this.setLocationRelativeTo(null);//this makes the screen appear in the middle of the screen
    }
}
