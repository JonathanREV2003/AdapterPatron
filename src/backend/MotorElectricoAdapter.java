package backend;

public class MotorElectricoAdapter extends Motor {
 private MotorElectrico motorElectrico;
 public MotorElectricoAdapter(){
     super();
     System.out.println(">>Creando motor electrico adapter...");
     this.motorElectrico = new MotorElectrico();
 }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor electrico adapter.");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor electrico adapter.");
        this.motorElectrico.acelerarMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor electrico adapter.");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}
