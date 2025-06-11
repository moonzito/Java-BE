import java.util.Scanner;

public class HelloWorldl {
    public static void main(String[] args){

        System.out.println("Qual a operação algébrica que você quer usar?");
        System.out.println("1- Adição, 2- Subtração, 3- Multipicação, 4- Divisão, 5- Raíz, 6- Potenciação");
        int esc = teclado.nextByte();

        if(esc == 1){
            System.out.print("Okay, agora digite um número qualquer: ");
            float n1 = teclado.nextFloat();

            System.out.printf("Você digitou o número %.2f. Agora digite mais um número: ",n1);
            float n2 = teclado.nextFloat();

            float adc = (n1+n2);

            System.out.printf("O primeiro valor é %.2f, e o segundo valor é %.2f e as suas somas é igual a %.2f",n1,n2,adc);

        } if(esc == 2){
            System.out.print("Okay, agora digite um número qualquer: ");
            float n1 = teclado.nextFloat();

            System.out.printf("Você digitou o número %.2f. Agora digite mais um número: ",n1);
            float n2 = teclado.nextFloat();

            float sub = (n1-n2);

            System.out.printf("O primeiro valor é %.2f, e o segundo valor é %.2f e a subtração é igual a %.2f",n1,n2,sub);
        } else {
            System.out.print("Você digitou um valor que não está inserido, considere tentar de novo.");
        }

    }
}
