/**
 * @author bruno
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       System.out.println("Deseja calcular a média de seu aluno?");
       System.out.println("Digite S para sim e N para não");
       String resposta = s.next();

       while(resposta.equalsIgnoreCase("S")) {

        //Coleta de notas.

            System.out.println("Digite a primeira nota.");
            int num1 = s.nextInt();
            System.out.println("Digite a segunda nota.");
            int num2 = s.nextInt();
            System.out.println("Digite a terceira nota.");
            int num3 = s.nextInt();
            System.out.println("Digite a quarta nota.");
            int num4 = s.nextInt();

       // Calculo da média

            int media = (num1+num2+num3+num4) / 4;
            System.out.println("A média de seu aluno é: " + media);

       // Análise de status de aprovação


           if(media >=7) {
               System.out.println("Aluno aprovado!");
           } else if (media >=5) {
               System.out.println("Aluno em recuperação!");
           } else {
               System.out.println("Aluno reprovado!");
           }

           System.out.println("Deseja calcular a média de mais algum aluno?");
           resposta = s.next();
       }

       System.out.println("Obrigado!");

   }
}
