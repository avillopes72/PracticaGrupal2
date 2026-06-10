package lop.practicagrupal2.Transportes;

public abstract class VehiculoTransporte {

    

    public String consultarDatos() {
        return "";
    }

    public String revisarHistorialTrabajo() {
        return "-";
    }

    public String informaciónGeneral() {
        return "-";
    }
    public void mostrarInformacion(){
        
    }
    public abstract float calcularCostoOperativo();

   
}
