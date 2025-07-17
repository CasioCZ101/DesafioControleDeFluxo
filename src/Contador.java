import java.util.Scanner;

public class Contador 
{
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt(); 

            
        
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch(ParametrosInvalidos e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
    }

	static void contar(int parametroUm, int parametroDois )  throws ParametrosInvalidos {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois)
        {
            System.out.print("O segundo parâmetro deve ser maior que o primeiro");
        }
        else{
            System.out.println("Contando de " + parametroUm + " até " + parametroDois);
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Para nova linha após a contagem
        }
		
		//int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}
