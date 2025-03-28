package al.infnet.edu.br;

public class TestaConta {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Conta com valores iniciais
        Conta conta = new Conta("João Silva", 12345, "Agência 001", 1500.00, "15/03/2022");

        // Exibindo as informações iniciais da conta
        System.out.println("Informações iniciais da Conta:");
        conta.exibirInformacoes();

        // Realizando um depósito de R$ 500,00
        System.out.println("\nRealizando um depósito de R$ 500,00");
        conta.depositar(500.00);
        System.out.println("Saldo após o depósito: R$ " + conta.getSaldo());

        // Realizando um saque de R$ 300,00
        System.out.println("\nRealizando um saque de R$ 300,00");
        conta.sacar(300.00);
        System.out.println("Saldo após o saque: R$ " + conta.getSaldo());

        // Calculando o rendimento
        double rendimento = conta.calculaRendimento();
        System.out.println("\nRendimento (10% sobre o saldo atual): R$ " + rendimento);

        // Exibindo as informações após as operações
        System.out.println("\nInformações após as operações:");
        conta.exibirInformacoes();
    }
}
