import org.aptechph.Computation;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!\n");

//        for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//        Computation compute = new Computation();
//        System.out.println("Sum= "+ compute.addTwo(5, 36));
//         compute.divideTwo(6,2);
//        compute.greet(6,);
//        var calc = new Calculation();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first mass ");
//        double mass1 = scanner.nextDouble();
//        System.out.println("Enter the second mass ");
//        double mass2  = scanner.nextDouble();
//        System.out.println("Enter the radius ");
//        double radius = scanner.nextDouble();
//        calc.Gravity(mass1,mass2,radius);

//        int[] numbers = new int[4];
//        String[] names = {"Daniel","Peter","Micheal","Restorer"};
//        char[] genders = {'M','F'};
//
//        numbers[0] = 23;
//        numbers[1] = 12;
//        numbers[2] = 9;
//        numbers[3] = 10;

//      int[] data = {2,5,6,1,8,11};
//        System.out.println(ArrayDemo.sumGreater(data));
//      System.out.println(ArrayDemo.sumArray(data));
//      System.out.println(ArrayDemo.sumArray2(data));

//        System.out.println(ArrayDemo.collection);
//         Scanner scanner = new Scanner(System.in);
//         int favNo = scanner.nextInt();
//         String[] favourites = new String[favNo];
//
//         for(int i = 0;i<favourites.length;i++){
//             System.out.println("Favourite:" + (i+1));
//             favourites[i] = scanner.next();
//         }
//          System.out.println("*********YOUR FAV FOODS ARE**********");
//         for(String fav:favourites){
//             System.out.println(fav);
//         }

//        int[] data = {1,2,3,4,5,6};
//        System.out.println(ArrayDemo.reverseArray(data));

//        int[][] matrixA = new int[2][2];
//        for(int i =0;i< matrixA.length;i++){
//            for(int j=0;j<matrixA[i].length;j++){
//                System.out.println(matrixA[i][j]+"");
//            }
//            System.out.println('');
//        }

//        int[][][] matrixA = new int[2][3][3];
//        matrixA[0][0][0] = 3;
//        matrixA[0][0][1] = 1;
//        matrixA[0][0][2] = 6;
//        matrixA[0][1][0] = 2;
//        matrixA[0][1][1] = 4;
//        matrixA[0][1][2] = 10;
//        matrixA[0][2][0] = 5;
//        matrixA[0][2][1] = 12;
//        matrixA[0][2][2] = 9;
//
//        matrixA[1][0][0] = 8;
//        matrixA[1][0][1] = 7;
//        matrixA[1][0][2] = 6;
//        matrixA[1][1][0] = 13;
//        matrixA[1][1][1] = 20;
//        matrixA[1][1][2] = 9;
//        matrixA[1][2][0] = 11;
//        matrixA[1][2][1] = 7;
//        matrixA[1][2][2] = 5;

//        System.out.println(ArrayDemo.multiDim(matrixA));
                int[][] matrixA = new int[3][3];
                matrixA[0][0] = 3;
                matrixA[0][1] = 1;
                matrixA[0][2] = 6;
                matrixA[1][0] = 2;
                matrixA[1][1] = 4;
                matrixA[1][2] = 10;
                matrixA[2][0] = 5;
                matrixA[2][1] = 12;
                matrixA[2][2] = 9;

        int[][] matrixB = new int[3][3];
        matrixB[0][0] = 8;
        matrixB[0][1] = 7;
        matrixB[0][2] = 6;
        matrixB[1][0] = 13;
        matrixB[1][1] = 20;
        matrixB[1][2] = 9;
        matrixB[2][0] = 11;
        matrixB[2][1] = 7;
        matrixB[2][2] = 5;

        System.out.println("MatrixA");
        System.out.println(ArrayDemo.FDim(matrixA));
        System.out.println("MatrixB");
        System.out.println(ArrayDemo.FDim(matrixB));
        System.out.println("The sum of matrixA and matrixB");
        System.out.println(ArrayDemo.Sum(matrixA,matrixB));
        System.out.println("The subtraction of matrixA and matrixB");
        System.out.println(ArrayDemo.Subtract(matrixA,matrixB));

        System.out.println("\nTranspose of matrixB:");
        int[][] transposeB = ArrayDemo.transpose(matrixB);
        printMatrix(transposeB);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" ******A triangle****** ");
        ArrayDemo.Triangle("*");
        System.out.println("The chess board");
        ArrayDemo.Chessboard();

        int size = 3;
        char[][] board = new char[size][size];

        ArrayDemo.initializeBoard(board);

        board[0][0] = 'X';
        board[1][1] = 'O';
        board[2][2] = 'X';
        board[0][2] = 'O';
        board[2][0] = 'X';

         System.out.println("The TicTacToe board");
        ArrayDemo.printBoard(board);

//        JLabel label = new JLabel();
//        label.setText("Bro do you code");

//        JFrame frame = new JFrame();
//        frame.setTitle("JFrame title goes here");
//        frame.setSize(420,420);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//        frame.setVisible(true);
//        frame.add(label);
//
//        ImageIcon image = new ImageIcon("cloud profile.jpg");
//        frame.setIconImage(image.getImage());
//        frame.getContentPane().setBackground(Color.WHITE);

//     Chess chess =  new Chess();

    }
}
