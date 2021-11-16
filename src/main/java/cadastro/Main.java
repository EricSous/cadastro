package cadastro;

import bd.Alunobd;
import bd.Funcionariosbd;
import bd.Professorbd;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
        float qntNotas, nota = 0;
        String nome, codigo, materia, registro, funcao;
        Sala sala = new Sala();
        Aluno situacoes = new Aluno();
        Aluno novoAluno = new Aluno();
        Professor novoProfessor = new Professor();
        Funcionarios novoFuncionario = new Funcionarios();
        ValidacaoDeDados validarAluno = new ValidacaoDeDados();


        do {
            System.out.println("\n===============        MENU        ===============\n");
            System.out.println("Escolha opção: \n");
            System.out.println("1 - Inserir aluno \n");
            System.out.println("2 - Listar alunos \n");
            System.out.println("3 - Situação do aluno\n");
            System.out.println("4 - Inserir Professor\n");
            System.out.println("5 - Listar Professor\n");
            System.out.println("6 - Inserir Funcionarios\n");
            System.out.println("7 - Listar Funcionarios\n");
            System.out.println("0 - Sair");

            opc = scan.nextInt();
            scan.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("\nNome:");
                    nome = scan.nextLine();
                    if (validarAluno.verificaNome(nome)){
                }else {
                    System.out.println("Não foi possivel cadastrar");
                    break;
                }
                    System.out.println("\nCodigo do estudante:");
                    codigo = scan.nextLine();
                    System.out.println("\nQuantas notas você quer adicionar?\n");
                    qntNotas = scan.nextInt();

                    novoAluno = new Aluno(nome, codigo);

                    Alunobd alunobd = new Alunobd();
//                    alunobd.addAluno(novoAluno.nome);

                    for (int i = 0; i < qntNotas; i++) {
                        System.out.println("\nNota" + (i + 1));
                        nota = scan.nextFloat();
                        novoAluno.insereNotas(nota);
                    }
                    sala.insereAluno(novoAluno);
                    break;

                case 2:
                    sala.listarAlunos();
                    break;

                case 3:
                    sala.listarSituacoes();
                    break;

                case 4:
                    System.out.println("\nNome:");
                    nome = scan.nextLine();
                    System.out.println("\nRegistro do professor:");
                    codigo = scan.nextLine();
                    System.out.println("\nMateria Responsavel:");
                    materia = scan.next();

                    novoProfessor = new Professor(nome, codigo, materia);
                    sala.insereProfessor(novoProfessor);
                    Professorbd professor = new Professorbd();
                    professor.addProfessor(novoProfessor.nome, novoProfessor.materia);
                    break;

                case 5:
                    sala.ListaProfessor();
                    break;

                case 6:
                    System.out.println("\nNome:");
                    nome = scan.nextLine();
                    System.out.println("\nRegistro do Funcionario:");
                    registro = scan.nextLine();
                    System.out.println("\nFunção:");
                    funcao = scan.next();

                    novoFuncionario = new Funcionarios(nome, registro, funcao);
                    sala.insereFuncionarios(novoFuncionario);
                    Funcionariosbd funcionario = new Funcionariosbd();
                    funcionario.addFuncionario(novoFuncionario.nome, novoFuncionario.funcao);
                    break;

                case 7:
                    sala.listaFuncionarios();
                    break;

                case 0:
                    System.out.println("\nSaindo.....");
                    break;

                default:
                    System.out.println("\nOpção Invalida!");
            }
        } while (opc != 0);
    }
}
