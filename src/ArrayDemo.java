import java.util.Arrays;

public class ArrayDemo {
//    public static  int sumArray(int[] numbers){
//        int sum = 0;
//        for(int num: numbers){
//            sum += num;
//        }
//        return  sum;
//    }
//
//    public static int sumArray2(int[] numbers){
//        return Arrays.stream(numbers).sum();
//    }

//    public static int sumGreater(int[] numbers){
//        int sums = 0;
//        for(int num: numbers){
//            if(num > 10){
//                sums += num;
//            }
//        }
//        return sums;
//    }

//     public static String listMenu(int[] numbers){
//
//        Arrays.sort(numbers);
//        return Arrays.toString(numbers);
//     }

//       static final String  collection = "How many favourite food do you have";

//       public static String reverseArray(int[] numbers){
//              int[] newArr = new int[numbers.length];
//              for(int i=0; i<numbers.length;i++){
//                     newArr[i] = numbers[numbers.length-1-i];
//              }
//              return Arrays.toString(newArr);
//       }

//       public static String multiDim(int[][][] matrixA){
//              for(int i=0;i< matrixA.length;i++){
//
//                   for(int j=0;j< matrixA[i].length;j++){
//
//                          for(int k=0;k< matrixA[i][j].length;k++){
//                                 System.out.print(matrixA[i][j][k]+" ");
////                                 System.out.print("Sum:"+matrixA[i][j][k]+matrixA[i+1][j][k]);
//                          }
//                          System.out.println(' ');
//                   }
//                   System.out.println(' ');
//              }
//              return Arrays.toString(matrixA);
//       }

     public static String FDim(int[][] matrixA){
              for(int i=0;i< matrixA.length;i++){
                     for (int j=0;j< matrixA[i].length;j++){
                            System.out.print(matrixA[i][j]+" ");
                     }
                     System.out.println(" ");
              }
             return Arrays.toString(matrixA);
     }

     public static  String Sum(int[][] matrixA,int[][] matrixB) {
         int[][] sum = new int[3][3];

//         int[][] comp = new int[3][3];
         for (int i = 0; i < matrixA.length; i++) {
             for ( int j = 0; j < matrixA[i].length; j++) {
                 sum[i][j] = matrixA[i][j] + matrixB[i][j];
             }
             System.out.print(" ");
         }


         return Arrays.deepToString(sum);
     }

    public static  String Subtract(int[][] matrixA,int[][] matrixB) {
        int[][] subtract = new int[3][3];

//         int[][] comp = new int[3][3];
        for (int i = 0; i < matrixA.length; i++) {
            for ( int j = 0; j < matrixA[i].length; j++) {
                subtract[i][j] = matrixA[i][j] - matrixB[i][j];
            }
            System.out.print(" ");
        }


        return Arrays.deepToString(subtract);
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows]; // Resultant matrix will have dimensions cols x rows

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }



     public static void Triangle(String x){

         int n = 5; // rows


         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n - i; j++) {
                 System.out.print(" ");
             }

             for (int k = 1; k <= 2 * i - 1; k++) {
                 System.out.print(x);
             }

             System.out.println();
         }
     }

    public static void Chessboard(){
        int size = 8;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }

    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Method to print the board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("-------------"); // For 3x3 grid formatting
        }
    }
}


