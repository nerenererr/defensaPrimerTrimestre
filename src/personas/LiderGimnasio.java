package personas;

import pokemon.Pokemon;

public class LiderGimnasio extends Persona {
    private String region;
    private String ciudad;
    private boolean sinDerrotar;

    public LiderGimnasio(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon, String region, String ciudad, boolean sinDerrotar) {
        super(nombre, edad, pokemonFavorito, numPokemon);
        this.region = region;
        this.ciudad = ciudad;
        this.sinDerrotar = sinDerrotar;
    }

    public LiderGimnasio() {
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public boolean isSinDerrotar() {
        return sinDerrotar;
    }

    public void setSinDerrotar(boolean sinDerrotar) {
        this.sinDerrotar = sinDerrotar;
    }

    @Override
    public String toString() {
        return "LIDER " + this.getNombre() + ", de ciudad " + this.ciudad + " (" + this.getEdad() + " años)";
    }
}
