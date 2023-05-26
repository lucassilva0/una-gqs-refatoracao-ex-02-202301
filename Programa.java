import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a idade do cliente: ");
    int idade = scanner.nextInt();

    System.out.print("Informe o sexo do cliente (M/F): ");
    String sexo = scanner.next();

    Cliente cliente = new Cliente(idade, sexo);
    double mensalidade = cliente.calcularMensalidade();

    scanner.close();
  }
}    