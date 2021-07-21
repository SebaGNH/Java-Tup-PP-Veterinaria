import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenidos al sistema de la la Veterinaria");
        System.out.println("Ingrese la cantidad de clientes que va a cargar");
        int cantClientes = sc.nextInt();
        Veterinaria v = new Veterinaria(cantClientes);


        for (int i = 0; i < cantClientes; i++) {
            
            System.out.println("Ingrese el número de cliente");
            int numeroClte = sc.nextInt();
    
            System.out.println("Ingrese el Nombre del cliente");
            String nombreClte = sc.next();
    
            System.out.println("Ingrese la antiguedad que tiene como cliente");
            int antiguedadClte = sc.nextInt();
    
            System.out.println("Ingrese el nombre de la mascota");
            String nombreMascota = sc.next();
    
            System.out.println("ingrese la edad de la mascota");
            int edadMascota = sc.nextInt();
    
            Mascota m = new Mascota(nombreMascota, edadMascota);
            Cliente c = new Cliente(numeroClte, nombreClte, antiguedadClte, m);
    
            v.AgregarClientes(c);
        }

        System.out.println("La cantidad de clientes es: " + v.MostrarCantidadClientes());

        System.out.println("El promedio de edad en mascotas es: "+ v.PromedioEdadMascotas());

        System.out.println("Los clientes con antiguedad mayor a 5 años son: "+ v.CantidadAntiguedadMayorACinco());

        
    }
}
