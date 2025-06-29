public class Main {
    public static void main(String[] args) {
        EntidadMinecraft jugador = new Jugador("Steve", 20);
        EntidadMinecraft zombi = new Zombi("Zombi1", 15, 8);
        EntidadMinecraft aldeano = new Aldeano("Aldeano1", 10, "herrero");

        jugador.aparecer();
        jugador.interactuar();
        System.out.println("Tipo: " + jugador.obtenerTipo());

        zombi.aparecer();
        zombi.interactuar();
        System.out.println("Tipo: " + zombi.obtenerTipo());

        aldeano.aparecer();
        aldeano.interactuar();
        System.out.println("Tipo: " + aldeano.obtenerTipo());

        // Demostración de funcionalidad propia del Jugador
        if (jugador instanceof Jugador) {
            ((Jugador) jugador).agregarAlInventario("Espada de diamante");
        }
    }
}
