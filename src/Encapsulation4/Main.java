package Encapsulation4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String brand = scan.nextLine();
        String  manufacturedYear  = scan.nextLine();
        int doorCount = scan.nextInt();
        CarWebSite carWebSite= new CarWebSite();
        carWebSite.brand(brand);
        carWebSite.manufacturedYear(manufacturedYear);
        carWebSite.doorCount(doorCount);

        System.out.println(carWebSite);
    }
}
