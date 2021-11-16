package cadastro;

public class ValidacaoDeDados {
    String nome;


    public ValidacaoDeDados() {
    }

    public boolean verificaNome(String nome) {
        boolean valido = false;
        if (nome.length() <= 25) {
            if (nome.substring(0).matches("[a,A-zZ]*")) {
                valido = true;
            }
        } else {
            return valido;
        }
        return valido;
    }
    public boolean verificaCodigos(String codigo) {
        boolean valida = false;
        if (codigo.substring(0).matches("[0-9]*")) {
            valida = true;
        }
        return valida;
    }
}
