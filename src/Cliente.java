public class Cliente {
    private int numeroClte;
    private String nombreClte;
    private int antiguedadClte;
    private Mascota mascota;


    public Cliente(int numeroClte, String nombreClte, int antiguedadClte, Mascota mascota){
        this.numeroClte = numeroClte;
        this.nombreClte = nombreClte;
        this.antiguedadClte = antiguedadClte;
        this.mascota = mascota;
    }

    public void setNumeroClte(int numeroClte){
        this.numeroClte = numeroClte;
    }
    public int getNumeroCliente(){
        return this.numeroClte;
    }

    public void setNombreClte(String nombreClte){
        this.nombreClte = nombreClte;
    }
    public String getNombreClte(){
        return this.nombreClte;
    }

    public void setAntiguedadClte(int antiguedadClte){
        this.antiguedadClte = antiguedadClte;
    }
    public int getAntiguedadClte(){
        return this.antiguedadClte;
    }

    public void setMascota(Mascota mascota){
        this.mascota = mascota;
    }
    public Mascota getMascota(){
        return this.mascota;
    }

}