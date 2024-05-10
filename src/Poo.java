public class Poo {
    public static void main(String[] args) throws Exception {

        Animal animal = new Animal("Leon", 15);
        Gato gato = new Gato("Katty", 5);
        Perro perro = new Perro("Firulais", 15);

        System.out.println(
                "El animal de nombre " + animal.nombre + " tiene " + animal.edad + " años. " + animal.hacerSonido());

        System.out
                .println("El animal de nombre " + gato.nombre + " tiene " + gato.edad + " años. " + gato.hacerSonido());

        System.out.println(
                "El animal de nombre " + perro.nombre + " tiene " + perro.edad + " años. " + perro.hacerSonido());

        System.out.println("Se crearon " + Animal.countAnimales + " animales");
    }
}
