🔐 Sistema de Login com JOptionPane (Java)

Este projeto é um exercício simples em Java que implementa um sistema de login utilizando a biblioteca JOptionPane para interação gráfica com o usuário.

📌 Descrição

O programa simula um painel de login básico com interface gráfica, permitindo que o usuário:

* Escolha entre entrar ou sair
* Informe login e senha
* Receba mensagens de erro em caso de entrada inválida
* Tenha um limite de tentativas para autenticação

⚙️ Funcionalidades

🧭 Menu Inicial

Exibe uma caixa de diálogo com duas opções:
* Entrar
* Sair

👤 Sistema de Login

Solicita:
* Login (texto)
* Senha (apenas números)

✅ Validações

O sistema realiza diversas verificações:

❌ Campo de login vazio

❌ Cancelamento da operação

❌ Senha contendo letras ou símbolos

❌ Login ou senha incorretos

🔁 Controle de Tentativas

O usuário possui até 3 tentativas e após exceder:

* O programa é encerrado automaticamente

🔒 Credenciais válidas

Para acessar o sistema:

* Login: admin
* Senha: 1313

📢 Mensagens ao usuário

* Mensagens informativas (INFORMATION_MESSAGE)
* Mensagens de erro (ERROR_MESSAGE)
* Confirmações (YES_NO_OPTION)
* Avisos de limite de tentativas

🧠 Lógica Utilizada

* Estrutura de repetição while(true) para controle do fluxo
* Uso de try-catch para validar entrada numérica na senha
* Contador de tentativas (cont)
* Estruturas condicionais (if/else) para validações

🛠️ Tecnologias

* Java
* Biblioteca javax.swing.JOptionPane

▶️ Como Executar

1* Compile o código:

javac Main_LoginJOptionPane.java

2* Execute:

java Main_LoginJOptionPane

📁 Estrutura

Main_LoginJOptionPane.java

README.md

📚 Objetivo

Este projeto tem fins educacionais, com foco em:

* Prática de lógica de programação
* Uso de interface gráfica simples em Java
* Tratamento de exceções
* Validação de dados
