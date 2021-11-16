package cadastro;

public class ValidacaoDeDados {
        String nome;


    public ValidacaoDeDados() {
    }

    public boolean verificaNome (String nome){
        boolean valido = false;

        if(nome.length() <= 25){
            if(nome.substring(0).matches("[a,A-zZ]*")){
                valido = true;
            }
        }else{
            return valido;
        }
        return valido;
    }public void setNome(String nome) {
        this.nome = nome;
    }public String getNome() {
        return nome;
    }

}
