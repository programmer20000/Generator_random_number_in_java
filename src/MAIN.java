import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int scan1 = scanner1.nextInt();
        int scan2 = scanner2.nextInt();
        GeneratorRandom_Number generatorRandom_number = new GeneratorRandom_Number(scan1,scan2);
        System.out.println(generatorRandom_number);
    }
}