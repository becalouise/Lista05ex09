package Lista05ex09;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite um número inteiro para ser revertido: ");
        int n =sc.nextInt();
        reverso(n);
        sc.close();
    }

    public static void reverso(int n1){
        int n2 = 0;

		while (n1 > 0) {
		n2 *= 10;
		n2 += (n1 % 10);
		n1 /= 10;
		} 

        System.out.println("O numero invertido é: "+n2);
        
    }

}
    
