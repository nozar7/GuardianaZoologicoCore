package principal;

import model.Murcielago;

public class TestMurcielago {
    public static void main(String[] args) {
        Murcielago murcielago = new Murcielago();
        murcielago.atacarPueblos();
        murcielago.atacarPueblos();
        murcielago.atacarPueblos();
        murcielago.comerHumanos();
        murcielago.comerHumanos();
        murcielago.comerHumanos();
        murcielago.comerHumanos();
        murcielago.comerHumanos();
        murcielago.volar();
        murcielago.volar();
        murcielago.mostrarEnergia();
    }
}
