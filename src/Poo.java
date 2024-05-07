public class Poo {
    public static void main(String[] args) throws Exception {

        Persona persona1 = new Persona();

        persona1.nombre = "Nestor Jair";
        persona1.apellido = "Riasco Mosquera";
        persona1.edad = 49;

        Educacion educacion = new Educacion();
        educacion.programa = "Ingenieria de Sistemas";
        educacion.duracion = 5;
        educacion.enCurso = false;

        persona1.educacion = educacion;

        Persona persona2 = new Persona();
        persona2.nombre = "Catalina";
        persona2.apellido = "Reteria";
        persona2.edad = 24;

        Educacion educacion2 = new Educacion();
        educacion2.programa = "Arquitectura";
        educacion2.duracion = 5;
        educacion2.enCurso = true;

        persona2.educacion = educacion2;

        System.out.println(persona1.nombreCompleto() + ", tiene " + persona1.edad + " de edad y su profesion es "
                + persona1.educacion.programa);
        System.out.println(persona1.enviarSaludo("Cristina Rua"));

        System.out.println(persona2.nombreCompleto() + ", tiene " + persona2.edad + " de edad y su profesion es "
                + persona2.educacion.programa);
        System.out.println(persona2.enviarSaludo("Antonio Penagos"));

    }
}
