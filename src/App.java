public class App {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(12);

        persona.setNombre("Paolo Paolo");

        persona.setTelefono("1234567890");

        System.out.println("La persona es: " + persona.getNombre() + " de edad: " + persona.getEdad() + " Y su telegofono es: " + persona.getTelefono());

    }
}
