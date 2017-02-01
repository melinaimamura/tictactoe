/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Melina
 */
import java.util.Scanner;
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int row, column, played = -1;
        String [][] tic = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        Location tictactoe = new Location (tic);
        boolean x = true;
        while(x){
            played = played * (-1);
            System.out.println("Enter the row(0-2):");
            row = reader.nextInt();
            while(row != 0 && row != 1 && row != 2){
                System.out.println("Number not valid. Enter the row(0-2).");
                row = reader.nextInt();
            }
            System.out.println("Enter the column(0-2):");
            column = reader.nextInt();
            while(column != 0 && column != 1 && column != 2){
                System.out.println("Number not valid. Enter the column(0-2).");
                column = reader.nextInt();
            }
            tictactoe.setRowLocation(played, row, column);
            tictactoe.print();
            x = tictactoe.test();
        }
    }
    
}
