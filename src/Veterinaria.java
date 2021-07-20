public class Veterinaria {   
    
    Cliente [] clientes;

    int cantClientes = 0;

    public Veterinaria(int cantClientes){
        clientes = new Cliente[cantClientes];
    }
    
    // Almacenar la información de los clientes en un arreglo.
    public void AgregarClientes(Cliente c){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = c;
                break;
            }
        }
    }

    //Se pide: Mostrar la cantidad de clientes.
    public int MostrarCantidadClientes(){
        int contador = 0;
        for (Cliente cliente : clientes) {
            contador ++;
        }
        return contador;
    }

    //Mostrar el promedio de edad de las mascotas.
    public float PromedioEdadMascotas(){
        int contador = 0;
        int edadMascotas = 0;
        for (Cliente cliente : clientes) {
            contador ++;
            //edadMascotas += cliente.getEdadMascota();
            edadMascotas += cliente.getMascota().getEdadMascota();
        }
        float promedio = edadMascotas / contador;
        return promedio;
    }

    //Informar cuántos clientes tienen una antigüedad mayor igual a 5 años.
    public int CantidadAntiguedadMayorACinco(){
        int contador = 0;
        for (Cliente cliente : clientes) {
            if (cliente.getAntiguedadClte() >= 5) {
                contador ++;
            }
        }
        return contador;
    }



}
