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
public class Location {
    private String [][] toe;
    public Location(String [][] tac){
        toe = tac;
    }
    public void setRowLocation(int play, int r, int c){
        if(play > 0)
            toe [r][c] = "X";
        else
            toe [r][c] = "O";
    }
    public boolean test(){
        if(((toe[0][0].contains("X") && toe[0][1].contains("X") && toe[0][2].contains("X")) || 
                (toe[1][0].contains("X") && toe[1][1].contains("X") && toe[1][2].contains("X")) || 
                (toe[2][0].contains("X") && toe[2][1].contains("X") && toe[2][2].contains("X"))) ||
               ((toe[0][0].contains("O") && toe[0][1].contains("O") && toe[0][2].contains("O")) || 
                (toe[1][0].contains("O") && toe[1][1].contains("O") && toe[1][2].contains("O")) || 
                (toe[2][0].contains("O") && toe[2][1].contains("O") && toe[2][2].contains("O")))){
            return false;
            //horizontal lines
        }
        else if(((toe[0][0].contains("X") && toe[1][0].contains("X") && toe[2][0].contains("X")) || 
                (toe[0][1].contains("X") && toe[1][1].contains("X") && toe[2][1].contains("X")) || 
                (toe[0][2].contains("X") && toe[1][2].contains("X") && toe[2][2].contains("X"))) || 
               ((toe[0][0].contains("O") && toe[1][0].contains("O") && toe[2][0].contains("O")) || 
                (toe[0][1].contains("O") && toe[1][1].contains("O") && toe[2][1].contains("O")) || 
                (toe[0][2].contains("O") && toe[1][2].contains("O") && toe[2][2].contains("O")))){
            return false;
            //vertical lines
        }
        else if(((toe[0][0].contains("X") && toe[1][1].contains("X") && toe[2][2].contains("X")) || 
                (toe[2][0].contains("X") && toe[1][1].contains("X") && toe[0][2].contains("X"))) ||
                ((toe[0][0].contains("O") && toe[1][1].contains("O") && toe[2][2].contains("O")) || 
                (toe[2][0].contains("O") && toe[1][1].contains("O") && toe[0][2].contains("O")))){
            return false;
            //diagonal lines
        }
        else
            return true;
        }
    public void print(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                System.out.print(toe[i][j] + " ");
            System.out.println();
        }
    }
}
