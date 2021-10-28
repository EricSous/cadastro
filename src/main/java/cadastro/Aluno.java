package cadastro;

import java.util.ArrayList;

public class Aluno {
    float total;
    String nome, codigo, situacao = "reprovado";
    ArrayList<Float> notasAluno = new ArrayList();

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

    public Aluno(String nome, String codigo) {
        setNome(nome);
        setcodigo(codigo);
    }
    public Aluno() {

    }
    void listar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Codigo: " + this.codigo);
        for (int i = 0; i < notasAluno.size(); i++) {
            System.out.println("Nota  " + (i+1) + ": "+ this.notasAluno.get(i));
        }
    }
    void insereNotas(float nota){
        notasAluno.add(nota);
    }
     void situacoes(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Total:" + this.total);
        System.out.println("Situação:" + this.situacao);
    }
    void calculaNotas(){
        for(float nota: notasAluno){
            total = nota;
        }
        if(total >= 20){
            this.situacao = "Aprovado";

        }else {
            this.situacao = "Reprovado";
        }
    }
}
