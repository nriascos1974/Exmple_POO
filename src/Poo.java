public class Poo {
    public static void main(String[] args) throws Exception {

        Persona persona1 = new Persona("Nestor Jair", "Riasco Mosquera", 49, "Ingenieria de Sistemas", 5, false);

        Persona persona2 = new Persona("Catalina", "Reteria", 24, "Arquitectura", 5, true);

        System.out.println(persona1.nombreCompleto() + ", tiene " + persona1.edad + " de edad y su profesion es "
                + persona1.educacion.programa);
        System.out.println(persona1.enviarSaludo("Cristina Rua"));

        System.out.println(persona2.nombreCompleto() + ", tiene " + persona2.edad + " de edad y su profesion es "
                + persona2.educacion.programa);
        System.out.println(persona2.enviarSaludo("Antonio Penagos"));

    }
}
