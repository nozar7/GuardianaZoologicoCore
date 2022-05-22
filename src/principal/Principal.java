package principal;

import model.Gorila;
import model.Mamifero;
import model.Murcielago;

public class Principal {
    public static void main(String[] args) {
        System.out.println("principal class working!!");

        Mamifero m = new Mamifero();
        m.setNivelDeEnergia(500);

        Murcielago murcielago = new Murcielago();
        murcielago.mostrarEnergia();
    }
}
