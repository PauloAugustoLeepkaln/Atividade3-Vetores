import java.util.Arrays;
import java.util.Scanner;

public class Atividades05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];
        for(int i = 0; i<=2; i++){
            System.out.println("Digite um nome: ");
            nomes[i] = sc.next();
        }
        System.out.println("Os nomes são: "+ Arrays.toString(nomes));
    }
}
