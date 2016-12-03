package CS2011.Lecture19.TicTacToe;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Ellipse;

public class TicTacToe extends Application {

    private boolean gameOver = false;
    private int nFilled = 0;
    private char whoseTurn = 'X'; // 'X' or 'O'
    private Cell[][] cell =  new Cell[3][3];
    private Label statusLabel = new Label("X's turn to play");

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane(); 
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                pane.add(cell[i][j] = new Cell(), j, i);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(statusLabel);
    
        Scene scene = new Scene(borderPane, 300.0f, 300.0f);
        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public boolean isFull() {
        return nFilled >= 9; // > should never happen
    }
    
    public boolean hasWon(char tkn) {
        for (int i = 0; i < 3; i++)
            if (cell[i][0].getToken() == tkn &&
                cell[i][1].getToken() == tkn &&
                cell[i][2].getToken() == tkn)
                return true;
        for (int j = 0; j < 3; j++)
            if (cell[0][j].getToken() == tkn &&
                cell[1][j].getToken() == tkn &&
                cell[2][j].getToken() == tkn)
                return true;
        if (cell[0][0].getToken() == tkn &&
            cell[1][1].getToken() == tkn &&
            cell[2][2].getToken() == tkn)
            return true;
        if (cell[0][2].getToken() == tkn &&
            cell[1][1].getToken() == tkn &&
            cell[2][0].getToken() == tkn)
            return true;
        return false;
    }

    public class Cell extends Pane {

        private char token = ' ';   // one of blank, X, or O

        public Cell() {
            setStyle("-fx-border-color: black"); 
            setPrefSize(100.0f, 100.0f);
            setOnMouseClicked(e -> handleMouseClick());
        }

        public char getToken() {
            return token;
        }

        public void drawX() {
            double w = getWidth(), h = getHeight();
            Line line1 = new Line(10.0f, 10.0f, w - 10.0f, h - 10.0f);
            Line line2 = new Line(10.0f, h - 10.0f, w - 10.0f, 10.0f);
            getChildren().addAll(line1, line2); 
        }

        public void drawO() {
            double w = getWidth(), h = getHeight();
            Ellipse ellipse = new Ellipse(w/2, h/2, w/2 - 10.0f, h/2 - 10.0f);
            ellipse.setStroke(Color.BLACK);
            ellipse.setFill(Color.WHITE);
            getChildren().add(ellipse);
        }

        public void setToken(char c) {
            if (c == 'X')
                drawX();
            else 
                drawO();
            token = c;
            nFilled ++;
        }

        private void handleMouseClick() {
            String s = "";
            if (!gameOver) {
                setToken(whoseTurn);
                if (hasWon(whoseTurn)) {
                    gameOver = true;
                    s = whoseTurn + " won! The game is over";
                }
                else if (isFull()) {
                    gameOver = true;
                    s = "Draw! The game is over";
                }
                else {
                    whoseTurn = (whoseTurn == 'X') ? 'O' : 'X';
                    s = whoseTurn + "'s turn";
                }
                statusLabel.setText(s);
            }
        }
    }
  
    public static void main(String[] args) {
        launch(args);
    }
}