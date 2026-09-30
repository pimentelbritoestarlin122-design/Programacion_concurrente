class Tarea extends Thread {

    private String tarea;

    public Tarea(String tarea) {
        this.tarea = tarea;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println(
                Thread.currentThread().getName() +
                " está haciendo: " + tarea +
                " (" + i + ")"
            );

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido");
            }
        }
    }
}

public class TareasThread {

    public static void main(String[] args) {

        Tarea hilo1 = new Tarea("Descargar archivo");
        Tarea hilo2 = new Tarea("Reproducir música");
        Tarea hilo3 = new Tarea("Guardar información");

        hilo1.setName("Hilo-Descarga");
        hilo2.setName("Hilo-Música");
        hilo3.setName("Hilo-Guardado");

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
