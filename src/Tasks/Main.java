package Tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x1 = 0;
        double x2 = 0;
        double x3 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("первое число:");

        if (!scanner.hasNextDouble()) {
            System.out.println("Вы ввели не вещественное число");
            }else{
                x1 = scanner.nextDouble();

                System.out.println("второе число:");
                x2 = scanner.nextDouble();

                System.out.println("третье число:");
                x3 = scanner.nextDouble();

                if (Math.abs(x1) >= Math.abs(x2) && Math.abs(x1) >= Math.abs(x3)){
                    System.out.println(x1 + " is bigger");
                }else if (Math.abs(x2) >= Math.abs(x1) && Math.abs(x2) >= Math.abs(x3)){
                    System.out.println(x2 + " is bigger");
                }else if (Math.abs(x3) >= Math.abs(x1) && Math.abs(x3) >= Math.abs(x2)){
                    System.out.println(x3 + " is bigger");
                }
            }
    }
}
