package cadastro;

import java.util.ArrayList;

public class Aluno {
    float total, qntNotas,media;
    String nome, codigo, situacao = "reprovado";
    ArrayList<Float> notasAluno = new ArrayList();
    ValidacaoDeDados validarAluno = new ValidacaoDeDados();

    public Aluno(String nome, String codigo, float qntNotas) {
//        if (validarAluno.verificaNome(nome)){
        setNome(nome);
        setcodigo(codigo);
        setQntNotas(qntNotas);
//        }else {
//            System.out.println("Não foi possivel cadastrar");
//        }
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }

    void listar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Codigo: " + this.codigo);
        for (int i = 0; i < notasAluno.size(); i++) {
            System.out.println("Nota  " + (i + 1) + ": " + this.notasAluno.get(i));
        }
    }

    void insereNotas(float nota) {
        notasAluno.add(nota);
    }

    void situacoes() {
        System.out.println("Nome:" + this.nome);
        System.out.println("Media:" + this.media);
        System.out.println("Situação:" + this.situacao);
    }
    void calculaNotas(){
        for(float nota: notasAluno){
            total += nota;
            media = total/qntNotas;
        }
        if (media >= 6) {
            this.situacao = "Aprovado";

        } else {
            this.situacao = "Reprovado";
        }
    }


    public float getQntNotas() {
        return qntNotas;
    }

    public void setQntNotas(float qntNotas) {
        this.qntNotas = qntNotas;
    }
}



