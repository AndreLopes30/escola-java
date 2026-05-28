import model.Aluno;
import model.Turma;
import service.EscolaService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        model.Aluno aluno1 = new Aluno("André", 10, 20, Turma.A, LocalDate.of(2025,02,10));
        model.Aluno aluno2 = new Aluno("João", 4, 37, Turma.B, LocalDate.of(2023,05,12)) ;
        model.Aluno aluno3 = new Aluno("Roger", 8, 12, Turma.A, LocalDate.of(2018,10,23));
        model.Aluno aluno4 = new Aluno("Luiz", 6, 50, Turma.B, LocalDate.of(2020,12,24));

        EscolaService escolaService = new EscolaService();
        escolaService.adicionar(aluno1);
        escolaService.adicionar(aluno2);
        escolaService.adicionar(aluno3);
        escolaService.adicionar(aluno4);
        escolaService.listar();
        System.out.println(escolaService.listarAprovados());
        System.out.println(escolaService.exibirMedia());
        System.out.println(escolaService.listarReprovados());
        escolaService.buscarAluno("André");
    }
    }
