package service;

import model.Aluno;
import model.Turma;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class EscolaService {
    Repositorio<Aluno> alunosLista = new Repositorio<>();
    public void adicionar(Aluno alunoNovo) {
        alunosLista.adicionar(  alunoNovo);
    }
    public List<Aluno> listar() {
        System.out.println(alunosLista.listar());
        return alunosLista.listar();
    }
    public List<Aluno> listarAprovados() {
        return alunosLista.listar().stream()
            .filter(aluno -> aluno.getNota() >= 6)
            .collect(Collectors.toList());
    }
    public List<Aluno> listarReprovados() {
        return alunosLista.listar().stream()
                .filter(aluno -> aluno.getNota() < 6)
                .collect(Collectors.toList());
    }
    public Aluno buscarAluno(String busca) {
        for(Aluno aluno : alunosLista.listar()) {
            if(aluno.getNome().equals(busca)){
                return aluno;
            }
        }
        return null;
    }

    public double exibirMedia() {
        return alunosLista.listar().stream()
                .mapToDouble(aluno -> (double) aluno.getNota())
                .average()
                .orElse(0);
    }

    public List<Aluno> listarPorTurma(Turma turma) {
        return alunosLista.listar().stream()
                .filter(aluno -> aluno.getTurma() == turma)
                .collect(Collectors.toList());
    }
}
