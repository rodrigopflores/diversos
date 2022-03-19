public class Main {
    public static void main(String[] args) {

        Teste teste = new Teste(0);
        System.out.println("Main começou");
        System.out.println("Main chamou metodo");
        metodo(teste);
        System.out.println("Voltou para o main");


    }

    public static void metodo(Teste teste){
        System.out.println("Metodo começou");
        if(teste.getNumero() < 3) {
            teste.setNumero(teste.getNumero()+1);
            System.out.println("Metodo chamou metodo2");
            metodo2(teste);
        }
        System.out.println("Voltou para o metodo");
        System.out.println("Meodo terminou");
    }

    public static void metodo2(Teste teste){
        System.out.println("Metodo 2 começou");
        if(teste.getNumero() < 3){
            teste.setNumero(teste.getNumero()+1);
            System.out.println("Metodo 2 chamou metodo 1");
            metodo(teste);
        }
        System.out.println("Metodo 2 terminou");
    }
}
