package primeiraAtividade;

public class Main {

  public static void main(String[] args) {
    System.out.println("\n ========== Primeira Operação ========== \n");

    Point p = new Point(10, -10); // Vai emitir mensagem de erro no Y

    System.out.println("\n ========== Segunda Operação ========== \n");

    Point p1 = new Point(10, 10); // Sucesso!

    System.out.println("\n ========== Terceira Operação ========== \n");

    Point p2 = new Point(500, 10); // Vai emitir mensagem de erro no X

    System.out.println("\n ========== Quarta Operação ========== \n");


    p.setX(-100); // Vai emitir mensagem de erro no X
    p.setX(500); // Vai emitir mensagem de erro no X
    p.setX(300); // Sucesso!

    System.out.println("\n ========== Quinta Operação ========== \n");

    p.setY(-100); // Vai emitir mensagem de erro no Y
    p.setY(500); // Vai emitir mensagem de erro no Y
    p.setY(300); // Sucesso!

    System.out.println("\n ========== Sexta Operação ========== \n");

    p.moveBy(100, 100); // Vai emitir dois Sucessos!
    p.moveBy(200, 100); // Vai emitir erro no X e sucesso no Y
    p.moveBy(100, -400); // Vai emitir erro no Y e sucesso no X

  }
  
}
