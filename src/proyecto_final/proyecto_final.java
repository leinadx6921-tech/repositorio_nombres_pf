package proyecto_final;
// Paquete de datos e/s datos por consola
import java.util.Scanner;
public class proyecto_final {
    // Método principal
    public static void main(String args[]) {
        // Declaración de variables
        String cliente;
        double compra1, compra2, compra3;
        double tc, pc;
        // Creando el objeto lectura
        Scanner lectura = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Nombre del cliente: ");
        cliente = lectura.next();
        System.out.print("Compra 1: ");
        compra1 = lectura.nextDouble();
        System.out.print("Compra 2: ");
        compra2 = lectura.nextDouble();
        System.out.print("Compra 3: ");
        compra3 = lectura.nextDouble();
        // Proceso de datos
        tc = compra1 + compra2 + compra3;
        pc = tc / 3;
        // Salida de datos
        System.out.println("Total compras     : " + tc);
        System.out.println("Promedio compras  : " + pc);
        // comentario
        System.out.println("Actualizacion de proyecto");
    } // Fin del método
} // Fin del programa