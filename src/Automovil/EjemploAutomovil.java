package Automovil;

import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("subaru", "impreza");
        subaru.setMotor(motorSubaru);
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);


        Rueda[] ruedas = new Rueda[4];
        for (int i = 0; i < ruedas.length; i++) {
            ruedas[i] = new Rueda("Michelin", 16, 2);
        }
        subaru.setRuedas(ruedas);

        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("mazda", "BT-50", Color.ROJO, motorMazda);
        mazda.setTanque(new Tanque(45));
        mazda.setRuedas(ruedas);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL),
                new Tanque(50));

        Automovil nissan2 = new Automovil("nissan", "Navara", Color.GRIS, new Motor(3.5, TipoMotor.DIESEL),
                new Tanque(50));
        nissan.setRuedas(ruedas);

        Automovil auto = new Automovil();
        Date fecha = new Date();
        System.out.println("Son iguales? " + (nissan == nissan2));
        System.out.println("Son iguales con equals? " + (nissan.equals(nissan2)));
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());


        System.out.println(auto.equals(fecha));
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println("KM por litro: " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("kM por litro: " + mazda.calcularConsumo(300, 60));
        System.out.println("kM por litro: " + nissan.calcularConsumo(300, 60));

    }
}
