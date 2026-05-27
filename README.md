# 🏫 Escola Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/status-concluído-green?style=for-the-badge)

Sistema de gerenciamento escolar desenvolvido em **Java puro**, com o objetivo de consolidar os fundamentos da linguagem e os pilares da Orientação a Objetos.

---

## 🎯 Objetivo

Este projeto foi criado após uma série de 7 exercícios progressivos cobrindo os pilares do Java. O objetivo foi aplicar todos os conceitos aprendidos em um projeto real, com estrutura de pacotes organizada e separação de responsabilidades.

---

## 🛠️ Tecnologias

- Java 17+
- IntelliJ IDEA

---

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── Main.java              # Ponto de entrada da aplicação
│   └── model/
│       ├── Aluno.java         # Classe base de aluno
│       └── AlunoBolsista.java # Subclasse com atributo de bolsa
└── service/
    └── EscolaService.java     # Lógica de negócio e operações
```

---

## 🧠 Conceitos Aplicados

- **Encapsulamento** — atributos privados com getters e setters
- **Herança** — `AlunoBolsista` estende `Aluno`
- **Construtores** — inicialização direta de objetos
- **ArrayList** — armazenamento e manipulação de coleções
- **Separação de responsabilidades** — model e service em pacotes distintos

---

## 🚀 Funcionalidades

| Método | Descrição |
|---|---|
| `adicionar(Aluno)` | Adiciona um aluno na lista |
| `listar()` | Retorna todos os alunos cadastrados |
| `listarAprovados()` | Retorna alunos com nota >= 6 |
| `listarReprovados()` | Retorna alunos com nota < 6 |
| `buscarAluno(String)` | Busca um aluno pelo nome |
| `exibirMedia()` | Calcula e retorna a média geral da turma |

---

## 📦 Como rodar

```bash
# Clone o repositório
git clone https://github.com/AndreLopes30/escola-java.git

# Abra no IntelliJ IDEA e execute a classe Main
```

---

## 👨‍💻 Autor

Desenvolvido por **André Ferreira**
GitHub: [AndreLopes30](https://github.com/AndreLopes30)
LinkedIn: [andre-ferreira30](https://www.linkedin.com/in/andre-ferreira30)
