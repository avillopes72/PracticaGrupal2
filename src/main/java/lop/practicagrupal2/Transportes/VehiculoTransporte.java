package lop.practicagrupal2.Transportes;

public abstract class VehiculoTransporte {

    private String codigo;
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private float kilometrajeRecorrido;
    private float costoBaseOperacion;

    public String consultar() {
        return "";
    }

    public String revisarHistorialTrabajo() {
        return "-";
    }

    public String informaciónGeneral() {
        return "-";
    }

    public abstract float calcularCostoOperativo();

    private void mostrarInformacion() {

    }
}
