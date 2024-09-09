package org.aptechph;

public class Computation {
    public int addTwo (int a, int b){
        return a + b;
    }

    public void greet (String name){
        System.out.println("Hello dear " + name);
    }

    public void divideTwo(int a, int b){
        if(b != 0){
            System.out.println(a/b);
        }
//            System.out.println('Daniel');
    }

    public  static  String register(String str){
      StringBuilder revStr = new StringBuilder();
            if(str.length() == 1){
                return str;
            }
            for(int i=str.length()-1;i>=0;i--){
                char character = str.charAt(i);
                 revStr.append(character);
            }
            return revStr.toString();
    }

    public static Boolean isPalidrom(String str) {
        StringBuilder upperchar = new StringBuilder();
        StringBuilder lowerchar = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
             upperchar.append(str.charAt(i));
        }
        for (int j = str.length() - 1; j >= 0; j--) {
            lowerchar.append(str.charAt(j));
        }
        if (!upperchar.toString().contentEquals(lowerchar)) {
            return false;
        }
        return true;
    }

//    public static int[] Check(String str){
//        String vowels = "aeiouAEIOU";
//        int vcount = 0;
//        int ccount = 0;
//       for(int i=0;i<vowels.length();i++){
//           char charac = str.charAt(i);
//
//           if(str.contains("a")){
//            vcount++;
//           }else{
//               ccount++;
//           }
//       }
//       return new int[]{vcount, ccount};
//    }

    public static String FormAny(String str){

        return "";
    }

}
