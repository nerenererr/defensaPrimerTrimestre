package pokemon;

public class Pocion {
    private int puntosRestaurados;
    private double precio;

    public Pocion(int puntosRestaurados, double precio) {
        this.puntosRestaurados = puntosRestaurados;
        this.precio = precio;
    }

    public Pocion() {
    }

    public int getPuntosRestaurados() {
        return puntosRestaurados;
    }

    public void setPuntosRestaurados(int puntosRestaurados) {
        this.puntosRestaurados = puntosRestaurados;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Tipo void porque no devuelve nada. Utilizamos un set para cambiar los puntos de salud(porque es un atributo privado de pokemon) del pokemon del parámetro a los puntos que tiene más los puntos que restaura la poción
    public void curar(Pokemon pokemon) {
        pokemon.setPuntosSalud(pokemon.getPuntosSalud() + this.puntosRestaurados);
    }

    public double getPrecioConImpuesto(int impuesto) {
        return this.precio + (this.precio * impuesto / 100);
    }

    @Override
    public String toString() {
        return "Poción: " + this.precio + " Pokédólares";
    }
}
