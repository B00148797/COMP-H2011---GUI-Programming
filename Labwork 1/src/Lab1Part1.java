import java.util.Scanner;

public class Lab1Part1 {

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

        //version if-else
        System.out.print("\u001B[34m");
        if (userAge_int >= 0 && userAge_int <= 17){
            System.out.println("Pre-adult");
        }else if(userAge_int >= 18 && userAge_int <= 50){
            System.out.println("Adult");
        }else if(userAge_int >= 50 && userAge_int <= 65){
            System.out.println("Middle aged");
        }else if(userAge_int >= 65 && userAge_int <= 80){
            System.out.println("Senior");
        }else {
            System.out.println("Elderly");
        }

        //version switch-case
        System.out.print("\u001B[35m");
        switch (userAge_int){
            case 0:
                System.out.println("A child is born");
                break;
            case 18:
                System.out.println("You are now an adult");
                break;
            case 50:
                System.out.println("You are now middle aged");
                break;
            case 65:
                System.out.println("You are now a Senior");
                break;
            case 80:
                System.out.println("You are now Elderly");
                break;
            default:
                System.out.println("You are not at a change point");
                break;
        }
    }
}