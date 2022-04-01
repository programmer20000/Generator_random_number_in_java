import java.util.Random;
import java.util.Scanner;

public class GeneratorRandom_Number {
    private Random random = new Random();
    private int n;


    GeneratorRandom_Number(int number1,int number2){
        this.n = random.nextInt(number1,number2);
        System.out.println(this.n);
    }
}