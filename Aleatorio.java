class ProcesoHilo extends Thread {

    private String componente;

    public ProcesoHilo(String componente) {
        this.componente = componente;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cargando " + componente + " - Fase: " + i);

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("El proceso de " + componente + " fue interrumpido.");
            }
        }
        System.out.println("-> " + componente + " inicializado con éxito.");
    }
}

public class Aleatorio {

    public static void main(String[] args) {

        ProcesoHilo hilo1 = new ProcesoHilo("Motor Gráfico");
        ProcesoHilo hilo2 = new ProcesoHilo("Servidor de Red");
        ProcesoHilo hilo3 = new ProcesoHilo("Base de Datos");

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}