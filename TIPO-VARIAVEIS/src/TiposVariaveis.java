public class App {
    public static void main(String[] args) throws Exception {
        
        //Variável do Tipo Texto
        String nome="Gisele Saldanha";

        //Variáveis Numéricas
        //O tipo long precisa terminar com L, o tipo float precisa terminar com F
        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo, por exemplo string
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo, por exemplo string
		float pi = 3.14F; 
		double salario = 1275.33;

        //Constante deve ser declarada com todas as letras em maiúsculo e deve ser escrito a palavra "final" no início da declaração da variável.
        final double VALOR_DE_PI = 3.14;
		VALOR_DE_PI=3.15;
    }
}
