public class Lab1Part2 {

    public static void main(String[] args) {
        Character[] tableCharacter = {'T', 'U', '-', 'D', 'u', 'b', 'l', 'i', 'n',};

        System.out.println("There are " + "\u001B[33m" + tableCharacter.length + "\u001B[0m" + " characters in the table.");

        for (int i = 0 ; i < tableCharacter.length ; i++){
            System.out.print(tableCharacter[i]);
        }

        System.out.println("");
        System.out.println("Now here is the conversion to hexadecimal:");

        for (int i = 0 ; i < tableCharacter.length ; i++){
            System.out.println("\u001B[34m" + (i + 1) + "\u001B[0m" + "\t" + tableCharacter[i] + " -> " + Integer.toHexString(tableCharacter[i]));
        }
    }
}