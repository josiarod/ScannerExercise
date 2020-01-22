import java.util.Scanner;

public class ScannerExercise {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        String firstInitial = keyboard.next();

        Scanner keyboard1 = new Scanner(System.in);
        String lastName = keyboard1.next();

        Scanner keyboard2 = new Scanner(System.in);
        String houseNumber = keyboard2.next();

        Scanner keyboard3 = new Scanner(System.in);
        String streetName = keyboard3.next();

        Scanner keyboard4 = new Scanner(System.in);
        String streetType = keyboard4.next();

        Scanner keyboard5 = new Scanner(System.in);
        String city = keyboard5.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
