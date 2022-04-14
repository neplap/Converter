import java.io.IOException;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args)  {

        double tempF;
        double tempC;
        double scanNumber;


        System.out.println("Выберите что нужно конвертировать введя цифру");
        System.out.println("1 - Перевести температуру из °F в °С");
        System.out.println("2 - Перевести температуру из °С в °F");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            scanNumber = scanner.nextDouble();
            if(!(scanNumber < 3 && scanNumber > 0 && scanNumber == (int)scanNumber)) {  //нужно пояснить за scanNumber == (int)scanNumber
                System.out.println("Введены неверные данные, попробуйте еще");
            }else{
                break;
            }
        }

        if (scanNumber == 1) {
            System.out.println("Введите градусы по °F");
            double scanF = scanner.nextDouble();
            tempC = ((scanF - 32) / 1.8) + ((scanF - 32) % 1.8);
            System.out.println(scanF + " градусов по °F = " + tempC + " градусов по °C");
        } else if (scanNumber == 2) {
            System.out.println("Введите градусы по °C");
            double scanC = scanner.nextDouble();
            tempF = (scanC * 1.8 + 32);
            System.out.println(scanC + " градусов по °C = " + tempF + " градусов по °F");
        }
    }
}

