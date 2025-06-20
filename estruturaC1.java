import java.util.Scanner;
//import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int id = leia.nextInt();

        if(id < 16){
            System.out.print("Não vota!");
        } if ((id > 16 && id < 18 ) || (id > 70)){
            System.out.print("Voto opc");
        } if (id >= 18 && id < 70){
            System.out.print("Voto obrigatório");
        }

    }
}
