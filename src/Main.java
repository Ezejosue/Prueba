import Automovil.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona persona = new Persona();
        Motor motor = new Motor();
        Rueda rueda = new Rueda("Nissan", 20, 40.00);
        Tanque tanque = new Tanque();

        String clientName = "";
        String clientLastName = "";
        System.out.println("Buenos dias, ingrese su nombre: ");
        clientName = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        clientLastName = sc.nextLine();

        persona.setNombre(clientName);
        persona.setApellido(clientLastName);

        String tipoMotor = "";
        double cilindrada = 0.0;

        System.out.println("1-DIESEL");
        System.out.println("2-BENCINA");
        System.out.println("Seleccione un tipo de motor [1-2]: ");
        String opcion = sc.nextLine();
        tipoMotor = String.valueOf((opcion.equals("1")) ? TipoMotor.DIESEL : TipoMotor.BENCINA);
        System.out.println("Ingrese la cilindrada: ");
        cilindrada = sc.nextDouble();
        motor.setTipoMotor(TipoMotor.valueOf(tipoMotor));
        motor.setCilindrada(cilindrada);
        sc.nextLine();


        System.out.println(" 1-Sedan ");
        System.out.println(" 2-Station Wagon ");
        System.out.println(" 3-Hatchback ");
        System.out.println(" 4-Pickup");
        System.out.println(" 5-Coupé ");
        System.out.println(" 6-Convertible");
        System.out.println(" 7-Furgón");
        System.out.println(" 8-SUV");
        System.out.println("Ingrese el tipo de automovil que desea [1-8]: ");
        String tipo = sc.nextLine();
        String name = "";
        String description = "";
        int doors = 0;


        switch (tipo) {
            case "1":
                name = TipoAutomovil.SEDAN.getNombre();
                description = TipoAutomovil.SEDAN.getDescripcion();
                doors = TipoAutomovil.SEDAN.getNumeroPuerta();
                System.out.println(persona);
                System.out.println("El auto seleccionado es " + name + " " + description + " de " + doors + " puertas");
                System.out.println("El motor es " + motor.getTipoMotor() + " y la cilindrada " + motor.getCilindrada());
                System.out.println("El tanque del vehiculo tiene capacidad de: " + tanque.getCapacidad());
                System.out.println("Las ruedas tienen un ancho de " + rueda.getAncho() + " un aro de " + rueda.getAro() + " y son de la marca "
                        + rueda.getFabricante());
                break;

            case "2":
                name = TipoAutomovil.STATION_WAGON.getNombre();
                description = TipoAutomovil.STATION_WAGON.getDescripcion();
                doors = TipoAutomovil.STATION_WAGON.getNumeroPuerta();
                System.out.println(persona);
                System.out.println("El auto seleccionado es " + name + " " + description + " de " + doors + " puertas");
                System.out.println("El motor es " + motor.getTipoMotor() + " y la cilindrada " + motor.getCilindrada());
                System.out.println("El tanque del vehiculo tiene capacidad de: " + tanque.getCapacidad());
                break;

            default:
                System.out.println("No existe un tipo de automovil");


        }

    }
}