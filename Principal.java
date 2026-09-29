class MiHilo extends Thread {

    private String nombre;

    public MiHilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(nombre + " - Número: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpido.");
            }
        }
    }
}

public class Principal {

    public static void main(String[] args) {

        MiHilo hilo1 = new MiHilo("Hilo 1");
        MiHilo hilo2 = new MiHilo("Hilo 2");
        MiHilo hilo3 = new MiHilo("Hilo 3");

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
