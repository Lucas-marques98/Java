public class OlaMundo3 {
  public static void main(String[] args) {
    int nota = 50; // valor da nota
    int media = 60; // valor da média
    int faltas = 10; // quantidade de faltas
    int maxFaltas = 8; // máximo de faltas

    //operação ternária - operação mais simples que só tem um teste;

    String res;
    res=(nota >= media ? "Aprovado" : "Reprovado"); //exemplo de operação ternária.

    System.out.printf("Resultado",res);

    if ((nota >= media) && (faltas <= maxFaltas)) {
      System.out.println("Aprovado"); // se o Aluno for aprovado.
    } else if (nota >= 40) {
      System.out.println("Recuperação"); // nota maior ou igual a 40 recuperação.
    } else {
      System.out.println("Reprovado"); // senão reprovado.
    }
    System.out.println("Fim do Programa"); // final do programa.
  }
}

//tabela verdade AND / O AND && só vai retornar verdadeiro quando todos os testes forem verdadeiros.
/*
  V V = V
  V F = F
  F V = F
  F F = F
 */

 //Tabela do OR || / só vai retornar falso quando todos os testes retornarem falsos.
 /*
  V V = V
  V F = V
  F V = V
  F F = F
 */

// Comandos de decisões condicionais - IF , ELSE ,operador ternario, SWITCH

// Operadores Lógicos == > < >= <= != ! (o retorno é sempre, true / false)
// if - Se
// else - Senão

// devo usar ponto e virgula em finais de Váriaveis e tambem em final de
// condições.