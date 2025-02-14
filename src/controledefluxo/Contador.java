package controledefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        //Entradas do usuário para a realização da comparação
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        //Local onde o método será utilizado
        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException e){
            e.printStackTrace();
        }
    }

    //Método que irá validar as entradas do usuário
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else if(parametroUm < parametroDois){
            int contagem = parametroDois - parametroUm;
            for(int i = 0; i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
