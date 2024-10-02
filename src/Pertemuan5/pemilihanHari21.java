package Pertemuan5;

import java.util.Scanner;

public class pemilihanHari21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayName;
        String dayType;

        System.out.println("input day name");
        dayName = sc.nextInt();

        switch (dayName) {
            case 1 :
            case 2:
            case 3:
            case 4:
            case 5:
            dayType = "weekday";
                break;
            case 6:
            case 7:
            dayType = "weekend";
                break;
                default :
            dayType = "Invalid number";
                return;
        }
        System.out.println("day type : " + dayType);
    }
}
