import java.util.Scanner;

public class BMIcalculator{
    public static double method(double tinggi, double berat){
        tinggi = tinggi / 100;
        return berat / Math.pow(tinggi, 2);
    }

    public static String getCategory(double bmi) {
        if (bmi > 40) return "Extreme Obese";
        else if (bmi >= 30) return "Obese";
        else if (bmi >= 25) return "Overweight";
        else if (bmi >= 18.5) return "Normal";
        else return "Underweight";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tinggi badan(cm): ");
        double tinggi = input.nextDouble();
        System.out.println("Masukkan berat badan(kg): ");
        double berat = input.nextDouble();
        input.close();
        double bmi = method(tinggi, berat);
        System.out.printf("Nilai BMI Anda adalah: %.2f\n", bmi);
        String category = getCategory(bmi);
        System.out.println(category);
    }
}