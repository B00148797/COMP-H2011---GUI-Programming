public class Lab1Part3 {

    public static double[][] rainfallAndTemperature = {
            {10.1, 10.5},
            {0.5, 12.5},
            {0.6, 10.1},
            {3.1, 11.9},
            {6.2, 9.2}
    };

    public static void main(String[] args) {

        for (int c = 0 ; c < rainfallAndTemperature.length ; c++){
            System.out.print("\u001B[33m" + "Day " + (c + 1) + ": " + "\u001B[0m");
            for (int l = 0 ; l < 1 ; l++){
                System.out.println(rainfallAndTemperature[c][l] + "mm" + "\t" + rainfallAndTemperature[c][l] + "°C");
            }
        }

    }
}