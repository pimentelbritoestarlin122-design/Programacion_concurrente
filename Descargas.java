class DescargaHilo extends Thread {

    private String archivo;

    public DescargaHilo(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public void run() {
        for (int i = 20; i <= 100; i += 20) {
            System.out.println("Descargando " + archivo + " - Progreso: " + i + "%");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("La descarga de " + archivo + " fue interrumpida.");
            }
        }
        System.out.println("¡" + archivo + " se descargó por completo!");
    }
}

public class Descargas {

    public static void main(String[] args) {

        DescargaHilo hilo1 = new DescargaHilo("Juego.iso");
        DescargaHilo hilo2 = new DescargaHilo("Actualizacion.zip");
        DescargaHilo hilo3 = new DescargaHilo("Modpack.rar");

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}