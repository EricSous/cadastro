package cadastro;

public class Professor {
    String nome, registro, materia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return registro;
    }

    public void setCodigo(String registro) {
        this.registro = registro;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Professor(String nome, String registro, String materia){
        setNome(nome);
        setCodigo(registro);
        setMateria(materia);
    }

    public Professor() {

           }
    void listar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Registro: " + this.registro);
        System.out.println("Materia:" + this.materia);
        }
        }
