import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = scanner.nextInt();

        try {
            int contador = contar(primeiroParametro, segundoParametro);
            for(int i = 1; (i <=contador); i++){
                System.out.println("Imprimindo o número: " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        scanner.close();
    }

    static int contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            return contagem;
        }
    }
}
