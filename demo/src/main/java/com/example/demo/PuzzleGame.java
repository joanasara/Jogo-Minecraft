package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lombok.Getter;

@Getter
public class PuzzleGame extends Application {
    private ScoreBoard scoreBoard;
    private GameBoard gameBoard;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Puzzle Game");

        // Configuração do layout
        BorderPane root = new BorderPane();
        gameBoard = new GameBoard(this); // Inicializa o GameBoard
        scoreBoard = new ScoreBoard();

        // Layout vertical para placar e leaderboard
        VBox vbox = new VBox();
        vbox.getChildren().add(scoreBoard.getScoreLabel());
        vbox.getChildren().add(new Label("Leaderboard:")); // Placeholder para leaderboard

        // Adicionando a área de jogo e placar ao layout
        root.setCenter(gameBoard);
        root.setRight(vbox);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

        gameBoard.startGame(); // Iniciar o jogo
    }

    public static void main(String[] args) {
        launch(args);
    }
}
