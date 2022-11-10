package paketic;
import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int k = scanner.nextInt();
        if(x!=0){

            Taylor taylor=new Taylor();
            Standart standart=new Standart();
            System.out.println(taylor.counter(x,k));
            System.out.print(standart.counter(x,k));

        }
        else {
            System.out.print("deltnie na 0");
        }

    }
}
