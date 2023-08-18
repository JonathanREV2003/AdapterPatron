package backend;

public class MotorElectrico {
    private Boolean conectado = false;
    public MotorElectrico(){
        System.out.println(">>Creando motor electrico...");
        this.conectado = false;
    }
    public void conectar(){
        System.out.println("Conectando motor electrico.");
        this.conectado = true;
    }
    public void activar(){
        if(!this.conectado){
            System.out.println("No se puede activar, porfavor conecte el motor.");
        }else { System.out.println("Esta conectado, Activando motor electrico.");}
    }
    public void acelerarMasRapido(){
        if(!this.conectado){
            System.out.println("No se puede acelerar mas rapido, porfavor conecte el motor.");
        }else { System.out.println("Esta acelerando mas rapido, Aumento de consumo electrico.");}
    }
    public void detener (){
        if(!this.conectado){
            System.out.println("No se puede detener, el motor sigue conectado.");
        }else { System.out.println("Deteniedo el motor electrico.");}
    }
    public void desconectar(){
        System.out.println("Desconectando el motor electrico.");
        this.conectado = false;
    }
}
