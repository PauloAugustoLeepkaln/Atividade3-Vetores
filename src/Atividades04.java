import java.util.Arrays;
import java.util.Scanner;

public class Atividades04 {
    public static void main(String[] args) {

        int[] numeros = new int[3];
        double aux = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<=2; i++){
            System.out.println("Digite um valor");
            numeros[i] = sc.nextInt();
        }
        for(int i = 0; i<=2;i++){
            aux = aux+numeros[i];
        }
        System.out.println("Os valores são: "+ Arrays.toString(numeros));
        System.out.println("A media desses valores são: "+aux/3);
    }

}
