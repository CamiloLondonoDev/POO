package Package;

import Package.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PersonaService {
    private Persona[] personas = new Persona[5];
    private Scanner scanner = new Scanner(System.in);

    public void capturarPersonas() {

        //TODO: Cambiar luego a  una lista dinamica 
        for (int i = 0; i < 2; i++) {
            System.out.println("\nPersona #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Género (Masculino/Femenino): ");
            String genero = scanner.nextLine();

            System.out.print("Año de nacimiento (YYYY): ");
            int anio = scanner.nextInt();
            System.out.print("Mes de nacimiento (1-12): ");
            int mes = scanner.nextInt();
            System.out.print("Día de nacimiento (1-31): ");
            int dia = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            LocalDate nacimiento = LocalDate.of(anio, mes, dia);
            LocalDate hoy = LocalDate.now();
            int edad = Period.between(nacimiento, hoy).getYears();

            personas[i] = new Persona(nombre, apellido, genero, edad);
        }
    }

    public void mostrarNombreYGenero() {
        for (Persona p : personas) {
            // TODO: Crear validacion de si esta vacio envia mensaje y cambiar a que se itere for (persona p : personas) {SOUT(p)}
            if (p != null) {
                System.out.println("Nombre: " + p.getNombre() + ", Género: " + p.getGenero());
            }
        }
    }

    public double calcularPromedioEdad() {
        int suma = 0;
        int contador = 0;
        for (Persona p : personas) {
            if (p != null) {
                suma += p.getEdad();
                contador++;
            }
        }
        return contador > 0 ? (double) suma / contador : 0;
    }

    public int contarGenero(String generoBuscado) {
        int count = 0;
        for (Persona p : personas) {
            if (p != null && p.getGenero().equalsIgnoreCase(generoBuscado)) {
                count++;
            }
        }
        return count;
    }
}
