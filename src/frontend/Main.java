package frontend;

import backend.Motor;
import backend.MotorComun;
import backend.MotorEconomico;
import backend.MotorElectricoAdapter;

import java.util.Scanner;

public class Main {
    private static Scanner S = new Scanner(System.in);
    private static Motor motor;

    public static void main(String[] args) {

        int opciones;
        do {
            opciones = preguntarOpcion();
            switch (opciones) {
                case 1:
                    motor = new MotorComun();
                    usarMotor();
                    break;
                case 2:
                    motor = new MotorEconomico();
                    usarMotor();
                    break;
                case 3:
                    motor = new MotorElectricoAdapter();
                    usarMotor();
                    break;
                case 4:
                    System.out.println("¡PROGRAMA CERRADO!");
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("\n\n");
        } while (opciones != 4);
    }

    private static int preguntarOpcion() {
        System.out.print(
                "MENÚ DE OPCIONES\n"
                        + "--- --- --- --- ---\n"
                        + "1. Encender motor comun\n"
                        + "2. Encender motor economico\n"
                        + "3.Encender motor electrico adaptado\n"
                        + "4. Cerrar programa\n"
                        + "Seleccione una opción: "
        );
        return Integer.parseInt(S.nextLine());
    }
    private static void usarMotor(){
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}