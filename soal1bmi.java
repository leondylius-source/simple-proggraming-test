import java.util.Scanner;

public class soal1bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PoundKeKilo = 0.45359237;
        final double InciKeMeter = 0.0254;

        System.out.println("masukan berat: ");
        double Berat = input.nextDouble();
        System.out.print("masukan tinggi: ");
        double Tinggi = input.nextDouble();
        input.close();

        double beratKilo = Berat * PoundKeKilo;
        double tinggiMeter = Tinggi * InciKeMeter;

        double bmi = beratKilo / (tinggiMeter * tinggiMeter);
        System.out.printf("Your BMI is %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }  
}
