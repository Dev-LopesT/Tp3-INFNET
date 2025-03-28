# Sistema de Gerenciamento de Produtos e Figuras Geométricas

Este repositório contém um sistema simples para o gerenciamento de produtos em um supermercado e para o cálculo de áreas e volumes de figuras geométricas (círculo e esfera). O sistema foi desenvolvido em Java e permite realizar operações básicas de gerenciamento de produtos e cálculos de geometria, como o cálculo de áreas e volumes.

## Objetivo

1. **Gerenciamento de Produtos**:
   - Criação de uma classe `Produto` com atributos como nome, preço e quantidade em estoque.
   - Implementação de métodos para atualizar o preço e a quantidade em estoque, além de exibir as informações do produto.
   - Implementação de métodos getters e setters para facilitar a leitura e atualização dos atributos da classe.

2. **Gerenciamento de Contas Bancárias**:
   - Criação de uma classe `Conta` com métodos para realizar saques, depósitos e calcular rendimentos.

3. **Cálculos de Geometria**:
   - Criação de classes para representar um `Círculo` e uma `Esfera`.
   - Cálculos de área para o círculo e volume para a esfera, usando os respectivos atributos.

## Estrutura do Projeto

O projeto é dividido em várias classes que realizam as operações mencionadas. A seguir, estão as principais classes do sistema:

- **Produto**: Classe que representa um produto em um supermercado.
- **Conta**: Classe que representa uma conta bancária, permitindo operações de saque, depósito e cálculo de rendimento.
- **Circulo**: Classe para calcular a área de um círculo, dado o raio.
- **Esfera**: Classe para calcular o volume de uma esfera, dado o raio.
- **TestaProduto**: Classe de teste para verificar o funcionamento da classe `Produto`.
- **TestaConta**: Classe de teste para verificar o funcionamento da classe `Conta`.
- **TestaFiguras**: Classe de teste para verificar os cálculos das áreas do círculo e volumes da esfera.

## Como Usar

### 1. Compilação e Execução

Para compilar e executar o programa, siga os seguintes passos:

1. **Compilação**:
   Abra o terminal e navegue até a pasta onde os arquivos `.java` estão localizados. Em seguida, compile os arquivos utilizando o comando:

   ```bash
   javac *.java

2. Funcionalidades
Gerenciamento de Produtos
Produto: Cria um produto com nome, preço e quantidade em estoque.

Alteração de Preço: Atualiza o preço de um produto.

Alteração de Quantidade: Atualiza a quantidade disponível de um produto.

Exibição de Informações: Exibe as informações de um produto (nome, preço, quantidade).

Gerenciamento de Contas Bancárias
Conta Bancária: Cria uma conta bancária com titular, número da conta, agência, saldo e data de abertura.

Saque: Realiza um saque de um valor da conta.

Depósito: Realiza um depósito de um valor na conta.

Rendimento: Calcula o rendimento da conta com base no saldo.

Cálculos Geométricos
Círculo: Calcula a área de um círculo dado o raio.

Esfera: Calcula o volume de uma esfera dado o raio.

Considerações Finais
Este sistema foi desenvolvido para realizar as operações básicas de gerenciamento de produtos em um supermercado e cálculos de figuras geométricas simples. A estrutura do código é modular, permitindo fácil expansão e modificações.

Licença
Este projeto é de código aberto e pode ser utilizado para fins educativos ou para construção de sistemas mais complexos baseados nesses conceitos. Direitos Instituto Infnet.
