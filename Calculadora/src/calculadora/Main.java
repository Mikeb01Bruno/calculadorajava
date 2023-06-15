package calculadora;

public class Main {

    public static void main(String[] args) {
        Multiplicacao multi = new Multiplicacao();
        Soma som = new Soma();
        Subtracao sub = new Subtracao();
        Divisao div = new Divisao();
        
        System.out.println("\n " + som.calcular(4, 5));
        System.out.println("\n " + sub.calcular(10, 3));
        System.out.println("\n " + multi.calcular(2, 9));
        System.out.println("\n " + div.calcular(2666, 4));
    }
    
}
