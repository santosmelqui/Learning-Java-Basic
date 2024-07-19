package DevDojoMaratonaJava;

public class Aula05EstruturasCondicionais01 {
    public static void main (String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) { // instrução de análise
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{ // else instrução independente
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        // ! operador que indica == false
        if(isAutorizadoComprarBebida == false) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        boolean c = false;
        if (c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        // boolean c = true depois if(c=false) NÃO FAÇA ISSO!! nem linhas parecidas
        }
    }
}
