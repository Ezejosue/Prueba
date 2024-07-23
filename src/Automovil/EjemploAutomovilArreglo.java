package Automovil;

import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {
        Persona conductor = new Persona("Luci", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setTanque(new Tanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipoAutomovil(TipoAutomovil.HATCHBACK);
        subaru.setPersona(conductor);

        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.BENCINA));
        mazda.setTipoAutomovil(TipoAutomovil.PICKUP);
        mazda.setTanque(new Tanque());
        mazda.setPersona(pato);

        Persona bea = new Persona("Bea", "Gonzales");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Tanque(50));
        nissan.setTipoAutomovil(TipoAutomovil.PICKUP);
        nissan.setPersona(bea);

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS, new Motor(1.6, TipoMotor.BENCINA), new Tanque(50));
        suzuki.setPersona(lalo);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipoAutomovil(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setPersona(new Persona("Jano", "Perez"));

        Automovil[] automoviles = new Automovil[5];
        automoviles[0] = subaru;
        automoviles[1] = mazda;
        automoviles[2] = nissan;
        automoviles[3] = suzuki;
        automoviles[4] = audi;

        Arrays.sort(automoviles);
        for (Automovil automovil : automoviles) {
            System.out.println(automovil);
        }

    }
}
