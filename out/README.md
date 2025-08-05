# Sistema de Conta Bancária Simples

Este é um projeto simples em Java que simula um sistema de conta bancária por meio de um menu interativo no console. O programa permite ao usuário consultar o saldo, depositar valores, transferir dinheiro para outra conta e sair do sistema.

## Funcionalidades

O programa oferece as seguintes opções ao usuário:

* **Consultar saldo:** Exibe o saldo atual da conta.
* **Receber valor:** Permite adicionar um valor ao saldo.
* **Transferir valor:** Permite subtrair um valor do saldo, com uma verificação para garantir que o saldo não seja negativo.
* **Sair:** Encerra o programa.

## Como Executar o Projeto

Para executar este projeto, você precisa ter o **Java Development Kit (JDK)** instalado na sua máquina.

1.  **Compile o código:** Abra o terminal ou prompt de comando na pasta do projeto e execute o seguinte comando:
    ```sh
    javac Main.java
    ```

2.  **Execute o programa:** Após a compilação, execute o programa com este comando:
    ```sh
    java Main
    ```

O menu interativo aparecerá no console, e você poderá interagir com as opções digitando os números correspondentes.

## Estrutura do Código

O código-fonte está contido no arquivo `Main.java` e utiliza as seguintes estruturas:

* **`Scanner`**: Para ler a entrada do usuário.
* **`do-while` loop**: Para manter o menu de opções em exibição até que o usuário escolha sair.
* **`if-else`**: Para verificar a opção escolhida pelo usuário e executar a funcionalidade correta.

## Autor

Este projeto foi desenvolvido por **Matheus**.