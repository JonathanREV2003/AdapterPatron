package backend;

public class MotorComun extends Motor {
    public MotorComun(){
        super();
        System.out.println(">>Creando motor común...");
    }

    @Override
    public void encender() {
        System.out.println("Encendido motor comun.");
    }
    @Override
    public void acelerar() {
        System.out.println("Acelerando motor comun.");
    }
    @Override
    public void apagar() {
        System.out.println("Apagando motor comun.");
    }
}
