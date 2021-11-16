package cadastro;

public class Funcionarios {
    String nome, registro, funcao;

    public Funcionarios(String nome, String registro, String funcao) {
        setNome(nome);
        setRegistro(registro);
        setFuncao(funcao);
    }
    public Funcionarios() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    void listar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Registro: " + this.registro);
        System.out.println("Função:" + this.funcao);
    }

}
