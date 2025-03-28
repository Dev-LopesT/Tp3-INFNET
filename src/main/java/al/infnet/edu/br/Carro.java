package al.infnet.edu.br;


public class Carro {
    // Campos (Atributos)
    String modelo;
    int ano;

    // Método
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {
        // Criação do objeto
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fusca";
        meuCarro.ano = 1972;

        // Chamando o método para exibir informações
        meuCarro.exibirInformacoes();
    }
}

/*

Exemplo:

Classe Carro: Define a estrutura de um carro, com dois campos (modelo e ano) que representam suas características.

Campos: modelo e ano são atributos do carro, guardando o nome do modelo e o ano de fabricação.

Método: O método exibirInformacoes() imprime os detalhes do carro.

Objeto: Criamos um objeto meuCarro da classe Carro e atribuímos valores aos seus campos. Em seguida, chamamos o método para exibir essas informações.

 */