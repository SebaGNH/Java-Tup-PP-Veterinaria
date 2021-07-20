public class Mascota {
    private String nombreMascota;
    private int edadMascota;

    public Mascota(String nombreMascota, int edadMascota){
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }

    public String toString(){
        return "Nombre Mascota: "+ this.nombreMascota + ", Edad de la mascota: " + this.edadMascota;
    }

    public void setNombreMascota(String nombreMascota){
        this.nombreMascota = nombreMascota;
    }
    public String getNombreMascota(){
        return this.nombreMascota;
    }

    public void setEdadMascota(int edadMascota){
        this.edadMascota = edadMascota;
    }
    public int getEdadMascota(){
        return this.edadMascota;
    }

}
