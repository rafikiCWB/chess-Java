package application;

import application.UI.UI;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException, InterruptedException {

        var sc = new Scanner(System.in);
        var chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc); //Posição de origem

            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
        }


        // Runtime.getRuntime().exec("");
      /*  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("\033[H\033[2J]");
        System.out.flush();*/
/* String nome;
 nome = JOptionPane.showInputDialog(null, "Por favor, digite seu nome", "Atenção",
         JOptionPane.WARNING_MESSAGE);
 JOptionPane.showMessageDialog(null, "Nome " + nome);
 System.exit(0);*/
/* int valor1, valor2;
 valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor digite o primeiro numero",
         "soma entre os numeros", JOptionPane.WARNING_MESSAGE));
 valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor digite o segundo numero",
         "soma entre os numeros", JOptionPane.WARNING_MESSAGE));
 int total = valor1 + valor2;
 JOptionPane.showMessageDialog(null, "Total" + total);*/

    }
}
