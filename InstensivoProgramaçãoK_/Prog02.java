import java.util.Scanner;

public class Prog02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       String nome;
       int n1,n2,n3,s;
       
       System.out.println("Digite seu nome:");
       nome = leitor.nextLine();

       System.out.println("Digite sua primeira nota:");
       n1 = leitor.nextInt();

       System.out.println("coloque a segunda nota");
       n2 = leitor.nextInt();

       System.out.println("terceira nota");
       n3 = leitor.nextInt();

       s = n1 + n2 +n3;
       double media = s / 3.0;

       System.out.print("Sua media foi "+media);
       System.out.println(" boa tarde "+nome+"! Tudo bem?");

    }
}