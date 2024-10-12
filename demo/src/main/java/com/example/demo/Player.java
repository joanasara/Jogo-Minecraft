package com.example.demo;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Player {
    private Rectangle player;

    public Player() {
        player = new Rectangle(50, 50, Color.BLUE); // Representa o jogador
        player.setX(375); // Posição inicial
        player.setY(275);
    }

    public Rectangle getPlayer() {
        return player;
    }

    public void move(double dx, double dy) {
        player.setX(player.getX() + dx);
        player.setY(player.getY() + dy);
    }

    public void constrainMovement(double minX, double maxX, double minY, double maxY) {
        if (player.getX() < minX) player.setX(minX);
        if (player.getX() > maxX) player.setX(maxX);
        if (player.getY() < minY) player.setY(minY);
        if (player.getY() > maxY) player.setY(maxY);
    }
}
