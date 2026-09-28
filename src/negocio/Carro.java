package negocio;

public class Carro {
    public int potencia;
    double velocidad;

    public void acelerar(){
        velocidad += potencia;
    }

    void frenar(){
        velocidad /= 2;
    }
}
