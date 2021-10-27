import java.util.Scanner;

public class Lab1Part4 {

    private static Integer ageMinimal = 0;
    private static Integer ageMaximal = 122;

    public static void main(String[] args) {

        Scanner myAge = new Scanner(System.in);
        System.out.print("Enter you age: ");

        String userAge = myAge.nextLine();
        Integer userAge_int = Integer.parseInt(userAge);
        if (userAge_int >= ageMinimal && userAge_int <= ageMaximal){
            System.out.println("You are " + "\u001B[33m" + userAge + "\u001B[0m" + " years old.");
        }
        else
        {
            System.out.println("\u001B[31m" + "Your age is not valid!" + "\u001B[0m");
        }

        System.out.println("Half your age is: " + "\u001B[33m" + halfMyAge(userAge_int) + "\u001B[0m");

        Scanner myName = new Scanner(System.in);
        System.out.print("Enter you name: ");

        String userName = myName.nextLine();
        System.out.println("You name is " + "\u001B[33m" + userName + "\u001B[0m");

        System.out.println("You reversed name is " + "\u001B[33m" + printMyNameInReverse(userName) + "\u001B[0m");
    }

    public static double halfMyAge(double age){
        return (age / 2);
    }

    public static String printMyNameInReverse(String name){
        String nameReverse = "";

        for (int i = name.length()-1 ; i > 0 ; i--){
            nameReverse += name.charAt(i - 1);
        }

        return nameReverse;
    }
}