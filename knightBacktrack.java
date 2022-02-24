import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] chess=new int[n][n];
        KnightPlace(chess,row,col,1);
    }

    public static void KnightPlace(int[][] chess, int r, int c, int count) {
        
        if(r<0 || c<0 || r>=chess.length || c>=chess.length || chess[r][c]!=0){
            return;
        }else if(count == chess.length*chess.length){
            chess[r][c]=count;
            displayBoard(chess);
            chess[r][c]=0;
            return;
        }
        
        chess[r][c]=count;
        KnightPlace(chess, r - 2, c + 1, count+1);
        KnightPlace(chess, r - 1, c + 2, count+1);
        KnightPlace(chess, r + 1, c + 2, count+1);
        KnightPlace(chess, r + 2, c + 1, count+1);
        KnightPlace(chess, r + 2, c - 1, count+1);
        KnightPlace(chess, r + 1, c - 2, count+1);
        KnightPlace(chess, r - 1, c - 2, count+1);
        KnightPlace(chess, r - 2, c - 1, count+1);
        chess[r][c]=0;
    }
    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}