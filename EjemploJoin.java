class HiloJoin extends Thread {

    private String nombre;

    public HiloJoin(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(nombre + ": " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class EjemploJoin {

    public static void main(String[] args) throws InterruptedException {

        HiloJoin hilo1 = new HiloJoin("Hilo 1");
        HiloJoin hilo2 = new HiloJoin("Hilo 2");

        hilo1.start();
        hilo2.start();

        // Esperamos a que terminen los dos hilos
        hilo1.join();
        hilo2.join();

        System.out.println("Los dos hilos terminaron.");
    }
}
