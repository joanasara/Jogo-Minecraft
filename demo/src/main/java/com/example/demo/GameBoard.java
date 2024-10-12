package com.example.demo;

import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GameBoard extends Pane {
    private Player player;

    public GameBoard(PuzzleGame puzzleGame) {
        this.player = new Player();
        getChildren().add(player.getPlayer()); // Adiciona o jogador ao painel

        // Configura os controles de movimentação
        setOnKeyPressed(event -> {
            double dx = 0;
            double dy = 0;

            if (event.getCode() == KeyCode.UP) {
                dy = -10; // Mover para cima
            } else if (event.getCode() == KeyCode.DOWN) {
                dy = 10; // Mover para baixo
            } else if (event.getCode() == KeyCode.LEFT) {
                dx = -10; // Mover para a esquerda
            } else if (event.getCode() == KeyCode.RIGHT) {
                dx = 10; // Mover para a direita
            }

            player.move(dx, dy);
            player.constrainMovement(0, getWidth() - player.getPlayer().getWidth(), 0, getHeight() - player.getPlayer().getHeight()); // Restringe o movimento dentro dos limites
        });

        // Para que os eventos de tecla sejam detectados, o foco deve ser no GameBoard
        setFocusTraversable(true);
    }

    public void startGame() {
        // Lógica para iniciar o jogo (se necessário)
        requestFocus(); // Solicita foco para garantir que os eventos de tecla sejam capturados
    }
}
