class MiTarea implements Runnable {

    private String nombre;

    public MiTarea(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                nombre + " - Paso " + i
            );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido");
            }
        }
    }
}

public class EjemploRunnable {

    public static void main(String[] args) {

        MiTarea tarea1 = new MiTarea("Descargando");
        MiTarea tarea2 = new MiTarea("Procesando");
        MiTarea tarea3 = new MiTarea("Guardando");

        Thread hilo1 = new Thread(tarea1);
        Thread hilo2 = new Thread(tarea2);
        Thread hilo3 = new Thread(tarea3);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
