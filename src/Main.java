import java.util.Scanner; // Importa a classe Scanner do pacote java.util para ler entradas do usuário.

public class Main { // Declara a classe principal do programa, que deve ter o mesmo nome do arquivo.
    public static void main(String[] args) { // Método principal onde a execução do programa começa.

        // Declaração das variáveis iniciais do cliente.
        String nome = "Matheus"; // Variável String para armazenar o nome do cliente.
        String tipoDeConta = "Corrente"; // Variável String para o tipo de conta.
        Double saldo = 1000.00; // Variável Double para o saldo da conta, permitindo valores decimais.

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do teclado.
        int opcao = 0; // Declara a variável inteira 'opcao' para guardar a escolha do menu do usuário, inicializada com 0.

        // Exibe os dados iniciais do cliente no console.
        System.out.println("Dados iniciais do cliente");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo em conta: " + saldo);


        do { // Inicia um loop 'do-while', que garante que o bloco de código será executado pelo menos uma vez.

            // Exibe o menu de opções para o usuário.
            System.out.println("\nMENU DE OPÇÕES");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção desejada: ");

            // Lê a entrada inteira do usuário e a armazena na variável 'opcao'.
            opcao = scanner.nextInt();

            // Inicia uma estrutura condicional 'if-else if' para tratar as opções do menu.
            if (opcao == 1) { // Verifica se a opção escolhida foi 1.
                // Exibe o saldo atual, formatado para duas casas decimais.
                System.out.println("Seu saldo atual é: R$ " + String.format("%.2f", saldo));
            } else if (opcao == 2) { // Verifica se a opção escolhida foi 2.
                System.out.print("Digite o valor a ser recebido: R$ ");
                double valorRecebido = scanner.nextDouble(); // Lê um valor decimal e armazena na variável 'valorRecebido'.
                saldo += valorRecebido; // Adiciona o valor recebido ao saldo atual (saldo = saldo + valorRecebido).
                System.out.println("Novo saldo: R$ " + String.format("%.2f", saldo));
            } else if (opcao == 3) { // Verifica se a opção escolhida foi 3.
                System.out.print("Digite o valor a ser transferido: R$ ");
                double valorTransferido = scanner.nextDouble(); // Lê um valor decimal para transferência.
                // Verifica se há saldo suficiente para a transferência.
                if (valorTransferido > saldo) {
                    System.out.println("Saldo insuficiente para realizar a transferência.");
                } else {
                    saldo -= valorTransferido; // Subtrai o valor transferido do saldo (saldo = saldo - valorTransferido).
                    System.out.println("Novo saldo: R$ " + String.format("%.2f", saldo));
                }
            } else if (opcao != 4) { // Verifica se a opção é inválida (diferente de 1, 2, 3 e 4).
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4); // A condição do loop. Ele continua executando enquanto 'opcao' for diferente de 4.

        // Esta mensagem é exibida quando o loop termina (quando o usuário escolhe a opção 4).
        System.out.println("\nObrigado por usar nossos serviços! Programa encerrado.");

        scanner.close(); // Fecha o objeto Scanner para liberar os recursos do sistema.
    }
}