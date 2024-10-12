package com.example.demo;


import javafx.scene.paint.Color;

public class Piece {
    private final int[][] blocks; // Coordenadas dos blocos
    private final Color color;

    public Piece(int type) {
        switch (type) {
            case 0:
                blocks = new int[][]{{0, 4}, {1, 4}, {0, 5}, {1, 5}}; // Exemplo: bloco 2x2
                color = Color.RED; // Cor da peça
                break;
            // Adicione mais tipos de peças
            default:
                blocks = new int[][]{{0, 4}};
                color = Color.BLUE;
        }
    }

    public int[][] getBlocks() {
        return blocks;
    }

    public Color getColor() {
        return color;
    }
}
