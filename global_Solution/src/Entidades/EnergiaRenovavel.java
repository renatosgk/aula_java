package Entidades;

public class EnergiaRenovavel extends Energia{

    @Override
    public void tipoEnergia() {
        System.out.println(getNome() + " é uma fonte de energia renovável.");
    }
}

