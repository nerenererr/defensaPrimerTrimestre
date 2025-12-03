package pokemon;

public class Pokemon {
    private String nombre;
    private  int nivel;
    private int puntosSalud;
    private int ataque;
    public enum Tipo {NORMAL, FUEGO, AGUA, PLANTA, SINIESTRO, PSIQUICO};
    private Tipo tipo;

    public Pokemon(String nombre, int nivel, int puntosSalud, int ataque, Tipo tipo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosSalud = puntosSalud;
        this.ataque = ataque;
        this.tipo = tipo;
    }

    public Pokemon() {
    }

    public Pokemon(String nombre, int nivel, int puntosSalud, int ataque) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosSalud = puntosSalud;
        this.ataque = ataque;
        this.tipo = Tipo.NORMAL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean debilitado() {
        return this.puntosSalud <= 0;
    }

    // Tipo void porque no devuelve nada, cambia los puntos de salud. A los puntos de salud del pokemon del parámetro le restamos el ataque del pokemon que ataca (this)
    public void atacar(Pokemon pokemon) {
        pokemon.puntosSalud = pokemon.puntosSalud - this.ataque;
    }

    @Override
    public String toString() {
        return this.nombre + " (nivel " + this.nivel + ")";
    }
}
