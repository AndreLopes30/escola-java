# 🏫 Escola Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Status](https://img.shields.io/badge/status-concluído-green?style=for-the-badge)

Sistema de gerenciamento escolar desenvolvido em **Java puro**, cobrindo desde os fundamentos da Orientação a Objetos até conceitos avançados como Streams, Generics e testes automatizados com JUnit.

---

## 🎯 Objetivo

Este projeto foi construído progressivamente após uma série de exercícios cobrindo os pilares do Java. O objetivo foi aplicar todos os conceitos em um projeto real, com estrutura de pacotes organizada, separação de responsabilidades e testes automatizados.

---

## 🛠️ Tecnologias

- Java 17+
- JUnit Jupiter 5.10
- IntelliJ IDEA

---

## 📁 Estrutura do Projeto

```
escola-java/
├── src/
│   ├── Main.java                  # Ponto de entrada da aplicação
│   ├── model/
│   │   ├── Pessoa.java            # Classe abstrata base
│   │   ├── Aluno.java             # Herda de Pessoa
│   │   ├── AlunoBolsista.java     # Herda de Aluno
│   │   └── Turma.java             # Enum de turmas (A, B, C, D)
│   └── service/
│       ├── EscolaService.java     # Lógica de negócio e operações
│       └── Repositorio.java       # Classe genérica de repositório
└── test/
    └── EscolaServiceTest.java     # Testes automatizados com JUnit
```

---

## 🧠 Conceitos Aplicados

- **Encapsulamento** — atributos privados com getters e setters
- **Herança** — `Aluno` estende `Pessoa`, `AlunoBolsista` estende `Aluno`
- **Classe Abstrata** — `Pessoa` com método abstrato `exibirInfo()`
- **Polimorfismo** — `exibirInfo()` implementado diferente em cada subclasse
- **Enum** — `Turma` com valores fixos A, B, C e D
- **Generics** — `Repositorio<T>` reutilizável para qualquer tipo
- **Streams e Lambda** — manipulação moderna de coleções
- **Datas** — `LocalDate` e `ChronoUnit` para data de matrícula
- **Exceções** — validação de nota com `IllegalArgumentException`
- **Testes** — cobertura com JUnit 5

---

## 🚀 Funcionalidades

| Método | Descrição |
|---|---|
| `adicionar(Aluno)` | Adiciona um aluno no repositório |
| `listar()` | Retorna todos os alunos cadastrados |
| `listarAprovados()` | Retorna alunos com nota >= 6 |
| `listarReprovados()` | Retorna alunos com nota < 6 |
| `listarPorTurma(Turma)` | Retorna alunos de uma turma específica |
| `buscarAluno(String)` | Busca um aluno pelo nome |
| `exibirMedia()` | Calcula e retorna a média geral da turma |
| `diasMatriculado()` | Calcula há quantos dias o aluno está matriculado |

---

## 🧪 Testes

| Teste | Descrição |
|---|---|
| `deveListarSomenteAprovados` | Verifica se apenas alunos com nota >= 6 são retornados |
| `deveLancarExcecaoParaNotaInvalida` | Verifica se nota fora do intervalo 0-10 lança exceção |
| `deveCalcularMediaCorretamente` | Verifica se a média é calculada corretamente |

---

## 📦 Como rodar

```bash
# Clone o repositório
git clone https://github.com/AndreLopes30/escola-java.git

# Abra no IntelliJ IDEA e execute a classe Main
```

Para rodar os testes, clique com botão direito em `EscolaServiceTest.java` e selecione **Run**.

---

## 👨‍💻 Autor

Desenvolvido por **André Ferreira**
GitHub: [AndreLopes30](https://github.com/AndreLopes30)
LinkedIn: [andre-ferreira30](https://www.linkedin.com/in/andre-ferreira30)