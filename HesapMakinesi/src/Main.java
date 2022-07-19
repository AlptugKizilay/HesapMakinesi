import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     /*   double num1, num2, result;
        String isaret;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz. ");
        num1 = input.nextDouble();

        System.out.println(" + , - , *, / \nisareti seciniz ");

        isaret = input.next();

        System.out.print("Sayı giriniz. ");
        num2 = input.nextDouble();

        if (Objects.equals(isaret, "+")){
            result = num1 + num2;
            System.out.println("Result = " + result);
        } else if (Objects.equals(isaret, "-")) {
            result = num1 - num2;
            System.out.println("Result = " + result);

        } else if (Objects.equals(isaret, "*")) {
            result = num1 * num2;
            System.out.println("Result = " + result);

        } else if (Objects.equals(isaret, "/")) {
            if (num2 == 0){
                System.out.println("Sıfır olmaz :D");
            }else{
                result = num1 / num2;
                System.out.println("Result = " + result);
            }
        }else{
            System.out.println("Geçerli işaret giriniz.");
        } */

        double num1, num2, result;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        num1 = input.nextDouble();
        System.out.print("Sayı giriniz: ");
        num2 = input.nextDouble();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçiminiz? ");
        select = input.nextInt();


        switch (select) {
            case 1:
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
            case 4:
                if (num2 == 0){
                    System.out.println("Sıfır olmaz :D");
                }else {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                }
            default:
                System.out.println("Hatali Secim Yaptiniz,Lutfen Tekrar Deneyiniz");

        }


    }
}