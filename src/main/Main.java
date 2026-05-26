package main;

import model.Aluno;
import service.EscolaService;

public class Main {
    public static void main(String[] args) {
        model.Aluno aluno1 = new Aluno("André", 10, 20, 'A');
        model.Aluno aluno2 = new Aluno("João", 4, 37, 'B');
        model.Aluno aluno3 = new Aluno("Roger", 8, 12, 'K');
        model.Aluno aluno4 = new Aluno("Luiz", 6, 50, 'T');

        EscolaService escolaService = new EscolaService();
        escolaService.adicionar(aluno1);
        escolaService.adicionar(aluno2);
        escolaService.adicionar(aluno3);
        escolaService.adicionar(aluno4);
        escolaService.listar();
        escolaService.listarAprovados();
        escolaService.listarReprovados();
        escolaService.buscarAluno("André");
        escolaService.exibirMedia();
    }
    }
