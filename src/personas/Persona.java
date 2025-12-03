package personas;

import pokemon.Pokemon;

public class Persona {
    private String nombre;
    private int edad;
    private Pokemon pokemonFavorito;
    private int numPokemon;

    public Persona(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon) {
        this.nombre = nombre;
        this.edad = edad;
        this.pokemonFavorito = pokemonFavorito;
        this.numPokemon = numPokemon;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pokemon getPokemonFavorito() {
        return pokemonFavorito;
    }

    public void setPokemonFavorito(Pokemon pokemonFavorito) {
        this.pokemonFavorito = pokemonFavorito;
    }

    public int getNumPokemon() {
        return numPokemon;
    }

    public void setNumPokemon(int numPokemon) {
        this.numPokemon = numPokemon;
    }

    public void saludo() {
        System.out.println("Hola, soy " + this.nombre + " y mi Pokémon favorito es " + this.pokemonFavorito);
    }

    @Override
    public String toString() {
        return this.nombre + "(" + this.edad + " años)";
    }
}
