import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano inicial");
        int anoInicial = teclado.nextInt();
        System.out.println("Digite o ano final");
        int anoFinal = teclado.nextInt();
        teclado.close();
        if(anoInicial < anoFinal){
        for(int ano = anoInicial; ano <= anoFinal;ano++ ){
            boolean resultado = eBisexto(ano);
            System.out.println("Ano "+ano +" e bisexto? " + resultado);
        }
    }else{
        System.out.println("Erro tente novamente.");
    }
    }
    static boolean eBisexto(int ano){
        if(ano % 4 == 0 && ano%100 !=0){
            return true;
        }else if(ano % 400 == 0){
            return true;
        } else{
            return false;
        }
    }
}
