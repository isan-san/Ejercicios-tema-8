public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setEdad(12);

        cliente.setNombre("Paolo Paolo");

        cliente.setTelefono("1234567890");

        cliente.setCredito(true);

        System.out.println("La persona es: " + cliente.getNombre() + " de edad: " + cliente.getEdad() + " Y su telegofono es: " + cliente.getTelefono()+" y su es estado de credito es: "+cliente.isCredito());

        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(87);

        trabajador.setNombre("Conan Paolo");

        trabajador.setTelefono("0987654321");

        trabajador.setSalario(5000000);

        System.out.println("La persona es: " + trabajador.getNombre() + " de edad: " + trabajador.getEdad() + " Y su telegofono es: " + trabajador.getTelefono()+" y su salario es: "+trabajador.getSalario());


    }
}
