import java.util.Scanner; //importando o scanner

// Programa que faz soma com o que o usuário digitou na tela.


public class Aula05 {
  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in); // cria um scanner para guardar o que o usuario digitar na tela.

    int n1 = 0, n2 = 0, res = 0; // criando variaveis na mesma linha
    String nome = ""; // inicializando uma String vázia

    System.out.println("Digite seu Nome:");
    nome = leitor.nextLine(); // vai guardar o valor de uma string digitada na tela.
    System.out.println("Digite um numeral:");
    n1 = leitor.nextInt(); // Recebe o valor do scanner digitado na tela e guarda na variavel n1
    System.out.println("Digite outro numeral:");
    n2 = leitor.nextInt(); // recebe o valor da soma e guarda na variavel n2

    res = n1 + n2; // recebe a soma de n1 + n2

    System.out.printf(" %s a Soma de %d com %d e igual a %d", nome, n1, n2, res); // mostra o resultado das somas junto como Resultado
  }
}

// Scanner / tipo de leitor.

// New cria um objeto da class.

// System in para ler o que o usuario digitar no programa.

// Como usar o %d no Java?
// Esta matéria é importante para todo desenvolvedor Java que precisa obter
// dados do usuário por meio do teclado e exibir mensagens na tela.
// Método printf()

// para rodar manualmente // abra o terminal, certifique de que está na pasta do
// arquivo

// digite javac e o nome do arquivo / para compilar para class.

// e digite java e o nome do arquivo para imprimir na tela.

// %d mostra o valor de uma váriavel INT
// %s mostra o valor de uma váriavel STRING