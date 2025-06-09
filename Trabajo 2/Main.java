//package app;

import Package.PersonaService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonaService personaService = new PersonaService();

        int opcion;
        do {
            System.out.println("\n----- MENÚ -----");
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Capturar datos de 5 personas");
            System.out.println("2. Mostrar nombre y género de las personas");
            System.out.println("3. Calcular promedio de edad");
            System.out.println("4. Contar personas de género Masculino");
            System.out.println("5. Contar personas de género Femenino");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    personaService.capturarPersonas();
                    break;
                case 2:
                    personaService.mostrarNombreYGenero();
                    break;
                case 3:
                    System.out.println("Promedio de edad: " + personaService.calcularPromedioEdad());
                    break;
                case 4:
                    System.out.println("Cantidad de hombres: " + personaService.contarGenero("Masculino"));
                    break;
                case 5:
                    System.out.println("Cantidad de mujeres: " + personaService.contarGenero("Femenino"));
                    break;
                case 6:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }
}
