public class Main {
    public static void main(String[] args) {
        printSorted(5, 2, 3);
        printSorted(5, 2, 1);
        printSorted(5, 2, 4);
        printSorted(5, 2, 2);
    }

public static void printSorted(int a, int b, int c){
        if(a > b){

        int temp = a;
        a = b;
        b = temp;
        }

        if(b > c){
        int temp = b;
        b = c;
        c = temp;
        }

        if(a > b){

        int temp = a;
        a = b;
        b = temp;
        }
        System.out.println(a + ", " + b + ", " + c);
        }

        }