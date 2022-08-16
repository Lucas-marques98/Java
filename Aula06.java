public class Aula06 {
  public static void main(String[] args) {

    // inicialização de um loop
    // Inicio Condição Incremento
    for (int cont = 0; cont < 10; cont++) {
      System.out.println("Escreve 'Lucas' 10 vezes ");
    } // cria um loop e repete a quantidade de coisa que eu quero que faça pra mim.
    int conta = 0;
    while(conta < 5){
      System.out.println("Escreve 'Lukinhas' 5 vezes");
      conta++;
    }
    System.out.println("Fim do Programa");


  }
}

// sempre que eu precisar repetir um bloco de comando vou precisar usar um comando de Loop.

// comandos Loop

// For - While - DoWhile

// OBS!! Não é obrigado a declarar a váriavel dentro dos parentes do FOR // Mas são boas praticas porque se eu so quero usar dentro do escopo do for não faz sentido eu criar uma váriavel sem uso.

// For os codigos vem dentro da primeira linha, dentro dos (parenteses),
// primeiro eu crio a váriavel, depois a condição (<= menor ou igual ou >= maior ou igual) e depois faço o incremento ou decremento.

// Loop While - Enquanto

// nos parenteses eu não coloco a inicialização e nem o incremento, eu só coloco a Condição.
// eu devo declarar primeiro a váriavel, depois a condição usando WHILE (){e aqui dentro eu coloco o incremento junto com o que eu quero que escreva.}
// o While é recomendado usar quando eu não souber Quantas vezes eu vou executar determinado comando.

// loop Do while

// primeiro ele faz e depois ele testa