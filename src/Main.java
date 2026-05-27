import model.Aluno;
import model.Turma;
import service.EscolaService;

public class Main {
    public static void main(String[] args) {
        model.Aluno aluno1 = new Aluno("André", 10, 20, Turma.A);
        model.Aluno aluno2 = new Aluno("João", 4, 37, Turma.B);
        model.Aluno aluno3 = new Aluno("Roger", 8, 12, Turma.A);
        model.Aluno aluno4 = new Aluno("Luiz", 6, 50, Turma.B);

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
