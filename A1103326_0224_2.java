import java.util.Scanner;

public class A1103326_0224_2
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("輸入攝氏溫度：");
        
        double c = input.nextDouble();
        double f = (1.8*c+32);

        System.out.printf("轉化結果： %.2f °C = %.2f °F", c, f);
    }
}