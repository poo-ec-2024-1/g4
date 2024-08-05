# Relatório de Análise de Código - Anotações de Thales.

## Informações do Projeto
- **Líder do Projeto**: Thales Jaime Nascimento De Paula
- **Projeto**: Aplicativo de Delivery de Supermercado
- **Tecnologias Utilizadas**: Java, JavaFX, SQLite, Scene Builder

## Análise Geral

### MainApp.java
- **Descrição**: Ponto de entrada da aplicação, configura o palco principal e inicializa o banco de dados.
- **Comentários**:
  - Carrega a interface principal (`main.fxml`) e define o título e tamanho da janela.
  - Inicializa o banco de dados antes de iniciar a aplicação JavaFX.
- **Pontos Fortes**:
  - Estrutura bem organizada, separando claramente a inicialização do banco de dados e a configuração da interface.
- **Sugestões**:
  - Adicionar tratamento de exceções ao carregar o arquivo FXML para capturar e lidar com possíveis erros.

### RegisterController.java
- **Descrição**: Controlador responsável pelo registro de novos usuários com validações básicas e navegação para a tela de compras.
- **Comentários**:
  - Inclui validações para campos vazios e exibição de alertas para informar o usuário sobre o status do registro.
  - Permite a navegação para a tela de compras (`shopping.fxml`).
- **Pontos Fortes**:
  - Uso adequado de alertas para feedback ao usuário.
- **Sugestões**:
  - Adicionar validações mais robustas para a senha, como critérios de complexidade.
  - Separar a lógica de navegação (mudança de cena) da lógica de registro para melhorar a modularidade e facilitar testes.

### DatabaseManager.java
- **Descrição**: Gerenciador do banco de dados usando SQLite, com métodos para inicialização e inserção de usuários.
- **Comentários**:
  - Cria uma tabela `users` se ela não existir.
  - Possui um método para inserir novos usuários no banco de dados.
- **Pontos Fortes**:
  - Implementação clara e direta das operações de banco de dados necessárias.
- **Sugestões**:
  - Considerar a adição de métodos para outras operações de CRUD (Create, Read, Update, Delete) para maior flexibilidade no futuro.
  - Adicionar tratamento de exceções mais detalhado para fornecer feedback específico sobre erros e facilitar a depuração.

### MainController.java
- **Descrição**: Controlador principal responsável pela navegação entre diferentes cenas (registro, carrinho, delivery).
- **Comentários**:
  - Permite a navegação para as telas de registro (`register.fxml`), compras (`shopping.fxml`) e delivery (`delivery.fxml`).
- **Pontos Fortes**:
  - Centralização da navegação em um controlador principal.
- **Sugestões**:
  - Melhorar o gerenciamento de estágios para evitar a abertura de múltiplas janelas e manter uma navegação mais fluida e consistente.

### ShoppingController.java
- **Descrição**: Controlador para a tela de compras, permitindo adicionar produtos ao carrinho e prosseguir para a tela de delivery.
- **Comentários**:
  - Inicializa a lista de produtos com itens estáticos.
  - Permite adicionar produtos selecionados ao carrinho e navegar para a tela de delivery (`delivery.fxml`).
- **Pontos Fortes**:
  - Funcionalidade básica de gerenciamento de carrinho implementada.
- **Sugestões**:
  - Adicionar funcionalidade de busca de produtos para melhorar a usabilidade.
  - Implementar remoção de itens do carrinho para oferecer maior controle ao usuário.

### DeliveryController.java
- **Descrição**: Controlador para a tela de delivery, permitindo inserir o endereço de entrega.
- **Comentários**:
  - Captura o endereço inserido e exibe uma mensagem de confirmação no console.
- **Pontos Fortes**:
  - Implementação simples e direta para captura do endereço.
- **Sugestões**:
  - Adicionar validações para o endereço de entrega, como formato e campos obrigatórios.
  - Implementar a lógica de confirmação do pedido e atualização do status no banco de dados para completar o fluxo de pedido.

---

## Conclusão
O código está bem estruturado e segue boas práticas de organização e modularização. As interfaces foram definidas claramente utilizando Scene Builder, facilitando a manutenção e evolução do projeto. Algumas melhorias podem ser feitas, principalmente em termos de validação e tratamento de exceções, para garantir uma aplicação mais robusta e resiliente. Conforme fui desenvolvendo esse aplicativo eu pervebi o quão dificil ia ser cumprir toda a proposta que fizemos no começo do projeto, optando por desenvolver primeiro a parte visual e depois adaptar o codigo para a sua funcionalidade, como lider eu fiquei encarregado de unir o grupo e participei do desenvolvimento do codigo em varias etapas como no desenvolvimento Backend e Frontend.

Com varias adições e refinamentos, visando o mercado de trabalho, o aplicativo de delivery de supermercado estará bem preparado para oferecer uma experiência de usuário intuitiva e eficiente além de inovadora.

---
