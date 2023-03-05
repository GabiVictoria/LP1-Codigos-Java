import java.util.Scanner;
public class imc {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        double altura, massa, imc = 0.0;
        System.out.println("Insira sua altura em metros");
        altura = ler.nextDouble();
        System.out.println("Insira a sua massa em kilos");
        massa = ler.nextDouble();
        imc = massa/(altura*altura);
        System.out.println(imc);
    }
}
