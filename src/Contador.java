import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = input.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois =input.nextInt();
        try{
        contar(parametroUm,parametroDois);
        }catch (ParametrosInvalidosException Exception){
            System.out.println("ERRO: " + Exception + "\nO segundo parâmetro deve ser maior que o primeiro.");
        }

    }
    static void contar(int parametroUm,int parametroDois)throws ParametrosInvalidosException{
        if(!(parametroUm < parametroDois)) {
            int contagem = parametroUm - parametroDois;
            for (int indice = 1; indice <= contagem; indice++) {
                System.out.println("Imprimindo o número " + indice + ".");
            }
        }else{
            throw new ParametrosInvalidosException();
        }
    }
}