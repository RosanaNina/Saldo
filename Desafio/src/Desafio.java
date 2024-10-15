import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Rosana";
        String tipoConta = "Corrente";
        double saldo =1599.99;
        int opcao = 0;


        System.out.println("*******************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo do Cliente: " + saldo);
        System.out.println("*******************");

        String menu = """
                ** Digite o nome do cliente que deseja fazer **
                1 - Consulta Saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
               
                
                """;
        Scanner leitura = new Scanner(System.in);


        while (opcao !=4) {
            System.out.print(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor < saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado com sucesso" + saldo);

                }

            } else if (opcao == 3) {
                System.out.println("Qual o valor que deseja receber valor");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado com sucesso" + saldo);

            } else if (opcao != 4) {
                System.out.println("Opção invalida!");
            }


        }


    }
}
