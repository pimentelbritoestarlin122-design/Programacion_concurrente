class Contador extends Thread {

    private int inicio;
    private int fin;

    public Contador(String nombre, int inicio, int fin) {
        super(nombre);
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public void run() {

        for (int i = inicio; i <= fin; i++) {

            System.out.println(
                getName() + " -> " + i
            );

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido");
            }
        }
    }
}

public class Contadores {

    public static void main(String[] args) {

        Contador hilo1 = new Contador(
            "Contador A",
            1,
            10
        );

        Contador hilo2 = new Contador(
            "Contador B",
            11,
            20
        );

        hilo1.start();
        hilo2.start();
    }
}
