package negocio;

public class MainCarro {
    static void main() {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();

        c1.potencia = 2;
        c1.velocidad = 80;


        c2.potencia = 3;
        c2.velocidad = 60;


        c3.potencia = 2;
        c3.velocidad = 80;

        /*System.out.println("La velocidad del auto es "+c1.velocidad+
                " y la potencia es "+c1.potencia);*/

        c1.acelerar();
        c1.acelerar();
        c1.frenar();

        c2.frenar();
        c2.frenar();

        c3.acelerar();
        c3.acelerar();
        c3.frenar();
        c3.acelerar();
        c3.frenar();


        System.out.println("La velocidad del auto 1 es "+c1.velocidad+
                " y la potencia es "+c1.potencia);
        System.out.println("La velocidad del auto 2 es "+c2.velocidad+
                " y la potencia es "+c2.potencia);
        System.out.println("La velocidad del auto 3 es "+c3.velocidad+
                " y la potencia es "+c3.potencia);
    }
}
