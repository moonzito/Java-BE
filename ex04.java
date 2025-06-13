import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = leia.nextInt();
        
        System.out.print("Digite outro número: ");
        int num2 = leia.nextInt();
        
        int med = (num1+num2)/2;
        
        boolean res;
        res = (med>=6||med<=6)?true:false;
        System.out.print(res);
    }
    
}