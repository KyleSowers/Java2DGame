package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    // SCREEN SETTINGS
    final int originialTileSize = 16; // 16 x 16 tile
    final int scale = 3;

    final int tileSize = originialTileSize * scale; // 48 x 48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    final int screenHeight = tileSize * maxScreenRow; // 576 pixel

    Thread gameThread;


    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        // Game Loop (core of game)
        while (gameThread != null) {

            System.out.println("The game loop is running.");

            // 1 UPDATE: update information such as character positions

            // 2 UPDATE: draw the screen with the updated information
        }
    }





}
