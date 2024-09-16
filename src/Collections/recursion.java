package Collections;

public class recursion {
    public static void main(String[] args) {

//        System.out.println(factorial(5));
//        System.out.println(bunnyears(5));
//        System.out.println(triangle(4));

        System.out.println(sumDigits1(717));
        System.out.println(powerN(3,2));
        System.out.println(count7(717));
        System.out.println(countX("xxhix"));
        System.out.println(countHi("abc hi abhi"));
        System.out.println(count8Where88isDouble(8808));
        System.out.println(changeXY("codex"));
    }

    public static int factorial(int n){
        if(n <= 2){
            return  n;
        }
        return n * factorial(n-1);
    }

    public static int bunnyears(int numbers){
        if(numbers == 0){
            return 0;
        }
        return numbers * 2;
    }

    public static int triangle(int rows){
        if(rows <= 1) return rows;

        return rows + triangle(rows-1);
    }

    public static int sumDigits1(int n){
        if(n <= 1){
         return n;
        }
        return sumDigits1((int) Math.floor((double) n /10)) + (n%10);
    }

    public static int powerN(int base, int n){
       if(n == 1){
           return base;
       }
       return (int) Math.pow(powerN(base,1),n);
    }

    public static int countX(String str){
        char x = 'x';
        int count = 0;
        if(str.contains("x")){
          return 0;
        }
        if(str.charAt(0) == x){
          count = 1;
        }
     return count + countX(str.substring(1));
    }

    public static int count7(int n){
        if(n == 0){
           return 0;
        }
        int count = 0;
        if(n%10 == 7){
            count = 1;
        }
       return count + count7((int) (double) (n / 10));
    }

    public static int count8Where88isDouble(int n){
        if(n == 0){
            return 0;
        }
        int count = 0;
        if(n % 10 == 8){
          count = 1;
        }
        if(n % 10 == 8 && (double) (n / 10) % 10 == 8){
          count = 2 * count;
        }
        return count + count8Where88isDouble((int) (double) (n / 10));
    }

    public static int countHi(String str){
          str.trim();
          if(!str.contains("hi")){
             return 0;
          }
          int count = 0;
          if(str.charAt(0) == 'h' && str.charAt(1) == 'i'){
           count = 1;
          }
          return count + countHi(str.substring(1));
    }

    public static String changeXY(String str){
        char c = 'x';
        if(!str.contains("x")){
           return str;
        }
        String firstChar;
        if(str.charAt(0) == c){
           firstChar = String.valueOf('y');
        }else{
            firstChar = String.valueOf(str.charAt(0));
        }
        return firstChar + changeXY(str.substring(1));
    }




}
