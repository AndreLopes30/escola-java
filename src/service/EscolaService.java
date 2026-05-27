package service;

import model.Aluno;
import model.Turma;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class EscolaService {
    ArrayList<Aluno> alunosLista = new ArrayList<>();
    public void adicionar(Aluno alunoNovo) {
        alunosLista.add(alunoNovo);
    }
    public ArrayList<Aluno> listar() {
        System.out.println(alunosLista);
        return alunosLista;
    }
    public ArrayList<Aluno> listarAprovados() {
        return alunosLista.stream()
            .filter(aluno -> aluno.getNota() >= 6)
            .collect(Collectors.toList());
    }
    public ArrayList<Aluno> listarReprovados() {
        return alunosLista.stream()
                .filter(aluno -> aluno.getNota() < 6)
                .collect(Collectors.toList());
    }
    public Aluno buscarAluno(String busca) {
        for(Aluno aluno : alunosLista) {
            if(aluno.getNome().equals(busca)){
                return aluno;
            }
        }
        return null;
    }

    public double exibirMedia() {
        return alunosLista.stream()
                .mapToDouble(aluno -> (double) aluno.getNota())
                .average()
                .orElse(0);
    }

    public ArrayList<Aluno> listarPorTurma(Turma turma) {
        return alunosLista.stream()
                .filter(aluno -> aluno.getTurma() == turma)
                .collect(Collectors.toList());
    }
}
