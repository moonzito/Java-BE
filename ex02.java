import java.util.Scanner;

public class HelloWorldl {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Olá, qual é o seu nome? ");
        String nome = teclado.nextLine();
        
        System.out.format("Olá, %s \n",nome);

                          
        System.out.print("Digite a sua primeira nota: ");
        float n1 = teclado.nextFloat();

        System.out.print("Ok, agora digite a sua segunda nota: ");
        float n2 = teclado.nextFloat();

        float media = (n1+n2)/2;
        System.out.format("A sua média é %f \n", media);

        if((n1 > 10) || (n2 > 10)){
        System.out.println("Você é o djabo mermo");
        }

    }
}
