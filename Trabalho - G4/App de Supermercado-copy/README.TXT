Claro! Aqui está o texto formatado para o GitHub:

# Aplicativo de Supermercado

## Objetivo do Projeto
Criar uma interface amigável e intuitiva, que permita aos usuários navegar facilmente pelo aplicativo e encontrar os produtos desejados com rapidez.

## Versão ou Data
08/07/2024

## Como Iniciar o Projeto

### Autores
- **Asaphe N. R. O. Braz** - Desenvolvedor Geral (Backend e Frontend)
- **Daniel Kenji Tomo Watanabe** - Testador
- **Thales Jaime Nascimento De Paula** - Líder - RT
- **Yuri Cassiano Matsuoka** - Analista de Sistemas

## Instruções para o Usuário

### 1. Criar um Usuário
Primeiro, você precisa criar um usuário com nome, email e senha. Este usuário terá seu próprio carrinho de compras.

```java
Usuario usuario = new Usuario("João", "joao@email.com", "senha123");
```

### 2. Adicionar Produtos ao Carrinho
Adicione os produtos criados ao carrinho do usuário.

```java
Produto produto1 = new Produto("Arroz", 10.0);
Produto produto2 = new Produto("Feijão", 8.0);

usuario.adicionarProdutoAoCarrinho(produto1);
usuario.adicionarProdutoAoCarrinho(produto2);
```

### 3. Finalizar Compra
Após adicionar todos os produtos desejados ao carrinho, finalize a compra para criar um pedido. Este pedido conterá todos os produtos do carrinho e estará associado ao usuário.

```java
Pedido pedido = usuario.finalizarCompra();
```

### 4. Simular uma Entrega
Depois de criar um pedido, defina o endereço e o horário da entrega.

```java
Entrega entrega = new Entrega(pedido, "Rua A, 123", "14:00");
```

### 5. Exibir Informações do Pedido e Entrega
Você pode exibir as informações do pedido e da entrega, como o nome do usuário, os produtos no pedido, o endereço e o horário da entrega.

```java
System.out.println("Pedido realizado por: " + usuario.getNome());
System.out.println("Produtos do pedido:");
for (Produto produto : pedido.getProdutos()) {
    System.out.println("- " + produto.getNome());
}
System.out.println("Endereço de entrega: " + entrega.getEndereco());
System.out.println("Horário de entrega: " + entrega.getHorario());
```

---

### Resumo do Código

- **Usuario**: Representa um usuário com métodos para adicionar produtos ao carrinho e finalizar compras.
- **Carrinho**: Representa um carrinho de compras contendo uma lista de produtos.
- **Produto**: Representa um produto com nome e preço.
- **Entrega**: Representa uma entrega associada a um pedido com endereço, horário e status.
- **Pedido**: Representa um pedido realizado por um usuário contendo uma lista de produtos e status.
- **Main**: Ponto de entrada do programa que simula um cenário de compra e entrega.
