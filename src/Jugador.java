import java.util.ArrayList;

public class Jugador extends EntidadBase {
    private ArrayList<String> inventario;

    public Jugador(String nombre, int salud) {
        super(nombre, salud);
        this.inventario = new ArrayList<>();
    }

    public void agregarAlInventario(String item) {
        inventario.add(item);
        System.out.println(nombre + " ha agregado " + item + " al inventario.");
    }

    @Override
    public void interactuar() {
        System.out.println(nombre + " está recolectando recursos.");
    }

    @Override
    public String obtenerTipo() {
        return "Jugador";
    }
}
