import Collections.Contact;
import Collections.ContactImplementation;
import Collections.PracticeQuestions;
import Collections.PracticeNew;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.*;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!\n");
//
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
//                int[][] matrixA = new int[3][3];
//                matrixA[0][0] = 3;
//                matrixA[0][1] = 1;
//                matrixA[0][2] = 6;
//                matrixA[1][0] = 2;
//                matrixA[1][1] = 4;
//                matrixA[1][2] = 10;
//                matrixA[2][0] = 5;
//                matrixA[2][1] = 12;
//                matrixA[2][2] = 9;
//
//        int[][] matrixB = new int[3][3];
//        matrixB[0][0] = 8;
//        matrixB[0][1] = 7;
//        matrixB[0][2] = 6;
//        matrixB[1][0] = 13;
//        matrixB[1][1] = 20;
//        matrixB[1][2] = 9;
//        matrixB[2][0] = 11;
//        matrixB[2][1] = 7;
//        matrixB[2][2] = 5;
//
//        System.out.println("MatrixA");
//        System.out.println(ArrayDemo.FDim(matrixA));
//        System.out.println("MatrixB");
//        System.out.println(ArrayDemo.FDim(matrixB));
//        System.out.println("The sum of matrixA and matrixB");
//        System.out.println(ArrayDemo.Sum(matrixA,matrixB));
//        System.out.println("The subtraction of matrixA and matrixB");
//        System.out.println(ArrayDemo.Subtract(matrixA,matrixB));
//
//        System.out.println("\nTranspose of matrixB:");
//        int[][] transposeB = ArrayDemo.transpose(matrixB);
//        printMatrix(transposeB);
//    }
//
//    public static void printMatrix(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(" ******A triangle****** ");
//        ArrayDemo.Triangle("*");
//        System.out.println("The chess board");
//        ArrayDemo.Chessboard();
//
//        int size = 3;
//        char[][] board = new char[size][size];
//
//        ArrayDemo.initializeBoard(board);
//
//        board[0][0] = 'X';
//        board[1][1] = 'O';
//        board[2][2] = 'X';
//        board[0][2] = 'O';
//        board[2][0] = 'X';
//
//         System.out.println("The TicTacToe board");
//        ArrayDemo.printBoard(board);
//

//        MyFrame frame = new MyFrame();

//        ImageIcon image = new ImageIcon("cloud profile.jpg");
//        Border border = BorderFactory.createLineBorder(Color.green,3);
//
//        JLabel label = new JLabel();
//        label.setText("Bro do you code");
//        label.setIcon(image);
//        label.setHorizontalTextPosition(JLabel.CENTER);
//        label.setVerticalTextPosition(JLabel.TOP);
//        label.setForeground(Color.blue);
//        label.setFont(new Font("MV Boli",Font.PLAIN,20));
//        label.setIconTextGap(25);
//        label.setBackground(Color.black);
//        label.setOpaque(true);
//        label.setBorder(border);
//        label.setVerticalAlignment(JLabel.CENTER);
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(100,100,250,250);
//        label.setBounds(100,100,75,75);

//        JPanel redPanel = new JPanel();
//        redPanel.setBackground(Color.red);
//        redPanel.setBounds(0,0,250,250);

//        JPanel bluePanel = new JPanel();
//        bluePanel.setBackground(Color.blue);
//        bluePanel.setBounds(250,0,250,250);
//
//        JPanel greenPanel = new JPanel();
//        greenPanel.setBackground(Color.green);
//        greenPanel.setBounds(0,250,500,250);
//        greenPanel.setLayout(new BorderLayout());
//
//        JFrame frame = new JFrame();
//        frame.setTitle("JFrame title goes here");
//        frame.setSize(750,750);
//        frame.setLayout(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.setResizable(false);
//        frame.setVisible(true);
//        frame.add(redPanel);
//        frame.add(bluePanel);
//        frame.add(greenPanel);
//        greenPanel.add(label);
//        frame.add(label);
//        frame.pack();

//        ImageIcon image = new ImageIcon("cloud profile.jpg");
//        frame.setIconImage(image.getImage());
//        frame.getContentPane().setBackground(Color.blue);

//     var chess =  new Chess();

//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter the value of a");
//        double a = scanner.nextDouble();
//        System.out.println("Enter the value of b");
//        double b = scanner.nextDouble();
//        System.out.println("Enter the value of c");
//        double c = scanner.nextDouble();
//        Calculation.Quadratic(a,b,c);

//        System.out.println(Computation.isPalidrom("racecar"));
//        System.out.println(Arrays.toString(Computation.Check("daniel")));
//        var people = new People(2,"Daniel","Igwe");
//        people.setId(2);
//        people.setSurname("Igwe");
//        people.setFirstName("Daniel");


//        var mth = new Arithmetic();
//        System.out.println("id: " + people.getId() + " FullName: " +  people.getSurname() +   people.getFirstName());
//         System.out.println(mth.add(5,5,5.2,3.4));
//        var contact = new Contact("08033099680","Daniel","daniel");

        var contact = new Contact("08071721093", "daniel", "igwe@gmail.com", 2);
        Contact contact2 = new Contact("08033099680", "Igwe", "daniel@gmail.com", 1);

        var contactImp = new ContactImplementation();
//         contactImp.add(contact2);
//         contactImp.displayList();
//         contact.ContactList();
//     int[] list1 = {1,3,6,9,5};
//        int[] list2 = {0,1,3,2,5};
//        String list1 = "1,3,6,9,5";
//        String list2 = "1,4,7,9,2";
//        System.out.println(PracticeQuestions.intersection(list1,list2));
//        System.out.println(PracticeQuestions.isPrime(2));

//       System.out.println(PracticeQuestions.checkFactorial(5));
//        System.out.println(PracticeQuestions.ficobulliSequence(6));
//        System.out.println(PracticeQuestions.checkPalidrom("dad"));
//        System.out.println(PracticeQuestions.sumOfDigits(1234));
//        System.out.println(PracticeQuestions.GCD(5000,2345));
//        int[] arr1 = {5,1,3,4,4,5};
//        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
//        int[] arr2 = {2,6,8,7};
//        System.out.println(Arrays.toString(PracticeQuestions.mergeTwoSortedArrays(arr1, arr2)));
//        int length = PracticeQuestions.removeDuplicates(arr);
//        for (int i = 0; i < length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        int[] arr = { 1,2,3,4,5,6,7,8};
//        System.out.println(Arrays.toString(PracticeQuestions.rotateAr(arr, 3)));
//         PracticeQuestions.rotateRight(arr,3);
//        PracticeQuestions.rotateLeft(arr,3);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//        System.out.println(PracticeQuestions.checkIfTwoStringsAnagram("race","care"));
        //        System.out.println(PracticeQuestions.removeDuplicates(arr));
//        System.out.println(PracticeQuestions.firstCharOfNonRepeatingString(new StringBuilder("eghejidik")));
//        System.out.println(PracticeQuestions.lengthOfSubstringWithoutDuplicates("abcabcbb"));
//        System.out.println(PracticeQuestions.firstNonRepeatingCharWithMap("swiss"));
//        System.out.println(PracticeQuestions.lengthOfLongestSubStringWithSet("freecodecamp"));
//        int[] num = {9,9,9,9};
//        System.out.println(Arrays.toString(PracticeNew.ArrPlusOne(num)));
//        int[] sortedArray = {1,3,5,7,9,11,15};
        int[]  nums1 = {1,2,3,0,0,0};
        int[]  nums2 = {2,5,6};

//        System.out.println(Arrays.toString(PracticeNew.mergeSort(nums1, nums2, 3, 3)));
//        System.out.println(num[(int) 1.5]);
//        int[] num = {1,3,5,6};
//        System.out.println(PracticeNew.SearchInsert(num,6));
//        int[] num = {3,7,2,2,13,2};
//        System.out.println(Arrays.toString(PracticeNew.twoSum(num, 9)));
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(0);
        nums.add(4);
        nums.add(2);

//        System.out.println(PracticeNew.removeElement(nums, 2));
        //          String str = "daniel";
//        System.out.println(Math.max(5,5));
//        StringBuilder str = new StringBuilder("daniel");
//        StringBuilder newStr = new StringBuilder("d");
//        System.out.println(newStr.append(str.charAt(0)));
//        System.out.println(str.substring(3));
//        System.out.println(str.substring(0,3));
//        System.out.println(str);

//        Iterator<Integer> number = contact.iterator();
////        while(number.hasNext()){
////            System.out.println(number.next());
////        }
//        details.add(contact.phone);
//        details.add(contact.name);
//        details.add(contact.email);
//        String str = "Daenaieile";
//        Map<Character,Integer> countMap = new LinkedHashMap<>();
//        for(char c: str.toCharArray()){
//            countMap.put(c,countMap.getOrDefault(c,0)+1);
//        }
//        System.out.println(countMap);

//        Map<String, Integer> fruits = new HashMap<>();
//        fruits.put("Mango", 20);
//        fruits.put("Banana", 10);
//        fruits.put("Orange", 5);
//        fruits.put("Lemon", 7);
//        fruits.put("Apple", 15);
//
//        for (Map.Entry<String, Integer> fruit : fruits.entrySet()) {
//            System.out.print(fruit.getKey() + ":");
//            System.out.println(fruit.getValue());
//        }

//        fruits.remove("Mango");
//        int size = fruits.size();
//        System.out.println("size:" + size);
//        System.out.println(fruits.get("Banana"));

//        check if key exist
//        String key = "Banana";
//
//        if (fruits.containsKey(key)) {
//            System.out.println(key + "found");
//        } else {
//            System.out.println("There is no such key as" + key);
//        }
//         System.out.println(key);
//        fruits.putIfAbsent("Mango", 2);
//        System.out.println(fruits);

        Map<String, String> myCars = new LinkedHashMap<>();
        myCars.put("Benz", "gold");
        myCars.put("Toyota", "white");
        myCars.put("Honda", "Black");
        myCars.put("Tesla", "Black");

//        Map<String,String> myCars = new Hashtable<>();
//        Map<String,String> myCars = new TreeMap<>();

//        for (Map.Entry<String, String> car : myCars.entrySet()) {
//            if (car.getKey().equalsIgnoreCase("toyota")) {
//                myCars.put("Toyota", "Red");
//            }
//            System.out.print(car.getKey() + ":");
//            System.out.println(car.getValue());
//        }


//    int[] numbers = {23,74,13,19,45,47};
//    List<int[]> list = Arrays.asList(numbers);
//    items.addAll(C)
//    for(int[] lt : list ){
//        System.out.println(lt[0]);
//    }
//
//        Map<Integer,Student> student = new HashMap<>();
//        student.put(1, new Student(101, "Daniel Igwe", 3.5));
//        student.put(2, new Student(102, "King Jacob", 3.9));
//        student.put(3, new Student(103, "David Okola", 2.9));
//        student.put(4, new Student(104, "Daniel Ima", 1.5));
//
//        for(Map.Entry<Integer,Student> stud : student.entrySet()){
//            System.out.println(stud);
//        }
//
//        Set<Integer> key = student.keySet();
//        for(int ky: key){
//            System.out.println(student.get(ky));
//        }

    }

}
