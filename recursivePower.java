import java.util.Scanner;

public class recursivePower {
    static int power (int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("Üst olacak sayıyı giriniz: ");
        int b = input.nextInt();
        System.out.print("Sonuç: "+power(a,b));

    }
}
