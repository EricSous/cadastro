package cadastro;

import java.util.ArrayList;

public class Sala {
    ArrayList<Aluno> listaAlunos;
    ArrayList<Professor> listaProfessor;
    ArrayList<Funcionarios> listaFuncionarios;

    public Sala() {
        this.listaAlunos = new ArrayList();
        this.listaProfessor = new ArrayList();
        this.listaFuncionarios = new ArrayList();

    }

    void insereAluno(Aluno novoAluno) {
        listaAlunos.add(novoAluno);
        novoAluno.calculaNotas();
    }

    void listarAlunos() {
        System.out.println("\nLista de alunos: ");
        for (Aluno alunoNaLista : listaAlunos) {
            alunoNaLista.listar();
        }
    }

    void listarSituacoes() {
        System.out.println("\nSituações:");
        for (Aluno alunoNaLista : listaAlunos) {
            alunoNaLista.situacoes();
        }
    }

    void insereProfessor(Professor novoProfessor) {
        listaProfessor.add(novoProfessor);
    }

    void ListaProfessor() {
        System.out.println("\nLista de Professores: ");
        for (Professor novoProfessor : listaProfessor) {
            novoProfessor.listar();
        }
    }

    void listaFuncionarios() {
        System.out.println("\n Lista de Funcionarios:");
        for (Funcionarios novoFuncionario : listaFuncionarios) {
            novoFuncionario.listar();
        }

    }

    public void insereFuncionarios(Funcionarios novoFuncionario) {
        listaFuncionarios.add(novoFuncionario);
    }

}
