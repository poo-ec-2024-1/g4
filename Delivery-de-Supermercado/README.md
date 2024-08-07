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


# Relatório de Análise de Código - Anotações de Yuri.

## Informações do Projeto
- **Desenvolvedor Geral (Backend e Frontend)**: Yuri Cassiano Matsuoka
- **Projeto**: Aplicativo de Delivery de Supermercado
- **Tecnologias Utilizadas**: Java, JavaFX, SQLite, Scene Builder

## 1. Atribuição de Cargo e Tarefas

**Tarefas Atribuídas:**
- Desenvolvimento e manutenção do código backend e frontend.
- Implementação de funcionalidades nos seguintes arquivos:
  - `Main.java`
  - `RegisterController.java`
  - `DatabaseManager.java`
  - `MainController.java`
  - `ShoppingController.java`
  - `DeliveryController.java`
- Criação e gerenciamento do banco de dados usando SQLite.
- Design de interfaces de usuário utilizando SceneBuilder.

**Responsabilidades:**
- Garantir a integração entre frontend e backend.
- Manter a consistência e eficiência do código.
- Colaborar com a equipe para definir e implementar funcionalidades.

**O que foi exercido na prática:**
- Implementação de funcionalidades-chave e integração com o banco de dados.
- Criação de interfaces para o usuário.
- Colaboração com a equipe para resolver problemas e discutir melhorias, com grande apoio e orientação do líder do projeto.

## 2. Contribuição de Acordo com a Atribuição

**O que foi cumprido:**
- Implementação completa das funcionalidades básicas e avançadas nos controladores mencionados.
- Estruturação e manutenção do banco de dados SQLite.
- Design e construção de interfaces de usuário usando SceneBuilder.

**Principais Commits/Posts/Documentos:**
1. **Commit:** Implementação da funcionalidade de registro de usuários e integração com o banco de dados.
2. **Commit:** Criação da interface de gerenciamento de compras.

**O que não deu para cumprir:**
- Integração de algumas funcionalidades avançadas planejadas inicialmente, devido a limitações de tempo.
- Otimização de algumas partes do código para melhor desempenho.

**Principais Dificuldades:**
- Sincronização de tarefas entre frontend e backend.
- Resolução de bugs relacionados à integração com o banco de dados.
- Adaptação às mudanças de requisitos durante o desenvolvimento.

## 3. Contribuição Além do Atribuído

**Como Ajudei a Equipe:**
- Colaboração na resolução de problemas de integração e otimização.
- Suporte aos colegas em questões técnicas e dúvidas sobre o código.

**Principais Commits/Posts/Documentos Relevantes:**
1. **Commit:** Correção de bugs críticos na integração do banco de dados.
2. **Post:** Discussão sobre melhores práticas para design de interfaces.

**Ajuda a Outros:**
- Auxílio na compreensão e utilização do SQLite.
- Suporte na implementação de funcionalidades de frontend.
- Orientação na utilização do SceneBuilder.

## 4. Considerações Gerais

**O que Aprendi:**
- Aprimoramento de habilidades em desenvolvimento full-stack com JavaFX.
- Melhor compreensão e prática de design de banco de dados com SQLite.
- Experiência em colaboração e trabalho em equipe em um ambiente de desenvolvimento de software.

**Trabalhos Futuros Pendentes:**
- Implementação de funcionalidades adicionais como notificações e sistema de recompensas.
- Adicionar validações para o endereço de entrega.

**Conclusões:**
- O projeto foi uma experiência que proporcionou crescimento técnico e pessoal.
- A colaboração eficaz e o esforço coletivo foram fundamentais para o progresso alcançado, com destaque para o suporte e orientação do líder do projeto.
- Há um bom potencial para melhorias e expansão do aplicativo, o que pode ser explorado em trabalhos futuros.

---

# Relatório de Análise de Código - Anotações de Daniel Kenji.

## Informações do Projeto
- **Testador do Projeto**: Daniel Kenji Tomo Watanabe
- **Projeto**: Aplicativo de Delivery de Supermercado
- **Tecnologias Utilizadas**: Java, JavaFX, SQLite, Scene Builder

## 1. Atribuição de Cargo e Tarefas

**Tarefas Atribuídas:**
- Testagem dos controllers;
- Implementação de novas bibliotecas para o teste de unidade:
  - `testfx-junit5-4.0.16-alpha.jar`
  - `testfx-junit5-4.0.16-alpha.jar`
- Análise da lógica e estrutura.

**Responsabilidades:**
- Garantir a funcionalidade do programa;
- Resolver erros dentro do código.

**O que foi exercido na prática:**
- Implementação e pesquisa de bibliotecas JAVA;
- Criação de testes de unidade no BlueJ;
- Manuseio com Handlers.

## 2. Contribuição de Acordo com a Atribuição

**O que foi cumprido:**
- Testagem dos controllers;
- Commit das mudanças;
- Correção de bugs.

**Principais Commits/Posts/Documentos:**
1. **Commit:** DK/AddTestes - Adicionar as classes "teste" dentro do programa.

**O que não deu para cumprir:**
- Auxílio na parte de front-end;
- Revisão e simplificação do código.

**Principais Dificuldades:**
- Trabalhar em cima de uma estrutura complexa;
- A linguagem JAVA;
- Manuseio com Handlers.

## 3. Contribuição Além do Atribuído

**Como Ajudei a Equipe:**
- Ideias para a implementação do projeto;
- Cumprir a parte designada;
- Ajudar na finalização e entrega do projeto.

**Principais Commits/Posts/Documentos Relevantes:**
1. **Post:** Discussão sobre a experiência do projeto.

**Ajuda a Outros:**
- Auxílio no planejamento para a finalização das tarefas;
- Discussão de ideias.

## 4. Considerações Gerais

**O que Aprendi:**
- Aprimoramento na habilidade com JAVA;
- Descobrimento de novas funcionalidades;
- Utilização de novas bibliotecas e testes com handlers.

**Trabalhos Futuros Pendentes:**
- Melhor adaptação do front-end;
- Feedback mais eficaz do "Register", "Delivery" e "Shopping".

**Conclusões:**
- O projeto foi desafiador, já que mesmo trabalhando com programação, senti dificuldade na implementação de métodos, classes, testes, etc;
- Aprimorei meus conhecimentos na arquitetura MVC em geral;
- Mais proximidade com meus colegas de equipe.
