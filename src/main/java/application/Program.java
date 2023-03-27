package application;

import entites.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com as medidas do Triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com as medidas do Triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p *(p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p *(p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangulo X: %.4f%n", areaX);
        System.out.printf("Triangulo Y: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Area maior: X");
        }else{
            System.out.println("Area maior: Y");
        }

        sc.close();
    }
}
