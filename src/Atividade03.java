import java.util.Arrays;

public class Atividade03 {
    public static void main(String[] args) {

        int[] numeros = {5,10};
        int aux = 0;
        System.out.println(Arrays.toString(numeros));
        aux = numeros[0];
        numeros[0] = numeros[1];
        numeros[1] = aux;
        System.out.println(Arrays.toString(numeros));
    }
}
