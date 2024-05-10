public class Animal {
    String nombre;
    int edad;
    static int countAnimales;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        countAnimales++;
    }

    public String hacerSonido() {
        return "Hace sonido Grrrr";
    }

}
