package cadastro;

public class ValidacaoDeDados {
   Aluno aluno = new Aluno();


    public static boolean validarAluno(String aluno){
        boolean valido = true;

        if(aluno.length() < 25){
            if(!aluno.substring(0).matches("[a,A-z,Z]*")){
                valido = false;
            }
        }else{
            valido = false;
        }
        return valido;

    }
}
