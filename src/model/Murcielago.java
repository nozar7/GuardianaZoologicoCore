package model;

public class Murcielago extends Mamifero{
    // atributos

    // metodos o funciones


    public Murcielago() {
        this.nivelDeEnergia = 300;
    }

    public void volar() {
        System.out.println("Volando...");
        this.nivelDeEnergia-=50;
    }

    public void comerHumanos() {
        System.out.println("Comiendo Humanos...");
        this.nivelDeEnergia+=25;
    }

    public void atacarPueblos() {
        System.out.println("Atacando pueblos...");
        this.nivelDeEnergia-=100;
    }
}
