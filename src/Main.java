import pokemon.Pokemon;
import pokemon.Pocion;
import personas.Persona;
import personas.Entrenador;
import personas.LiderGimnasio;


public class Main {
    public static void main(String[] args) {

        //pokémon
        Pokemon gardevoir = new Pokemon("Gardevoir", 30, 102,82, Pokemon.Tipo.PSIQUICO);
        System.out.println(gardevoir);
        Pokemon oshawott = new Pokemon("Oshawott", 12, 55, 55, Pokemon.Tipo.AGUA);
        System.out.println(oshawott);
        Pokemon gothitelle = new Pokemon("Gothitelle", 50, 70, 95, Pokemon.Tipo.PSIQUICO);
        System.out.println(gothitelle);
        Pokemon darkrai = new Pokemon("Darkrai", 35, 214, 161, Pokemon.Tipo.SINIESTRO);
        System.out.println(darkrai);

        //ataques
        oshawott.atacar(darkrai);
        System.out.println(darkrai.getPuntosSalud() + " PS");
        gardevoir.atacar(gothitelle);
        System.out.println(gothitelle.getPuntosSalud() + " PS");
        System.out.println("Debilitado: " + gothitelle.debilitado());

        //poción y cura
        Pocion superPocion = new Pocion(50, 700);
        System.out.println(superPocion);
        System.out.println(superPocion.getPrecioConImpuesto(10) + " Pokédólares");
        superPocion.curar(gothitelle);
        System.out.println(gothitelle.getPuntosSalud() + " PS");
        System.out.println("Debilitado: " + gothitelle.debilitado());

        //entrenadores
        Entrenador entrenador = new Entrenador("Maya", 21, gardevoir, 444,9, Entrenador.Clase.CAZABICHOS);
        System.out.println(entrenador);
        Entrenador entrenador2 = new Entrenador("Bruno", 15, darkrai, 222, 6, Entrenador.Clase.ORNITOLOGO);
        System.out.println(entrenador2);

        //lider
        LiderGimnasio liderGimnasio = new LiderGimnasio("Erika", 22, gothitelle, 500, "Kanto", "Azulona", true);
        System.out.println(liderGimnasio);
    }
}