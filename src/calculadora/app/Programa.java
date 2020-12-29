package calculadora.app;

import calculadora.fabrica.FabricaCalculos;
import calculadora.interfaces.CalculadorMatematico;

public class Programa {
    
    public static void main(String[] args){
        String calculo = "+";
        int numero1 = 2;
        int numero2 = 4;

        FabricaCalculos fabrica = new FabricaCalculos();
        CalculadorMatematico calculador = fabrica.criarCalculador(numero1, numero2, calculo);
        if (calculador != null) {
            System.out.println(calculador.calcular());
        } else System.out.println("Calculo invalido");
    }
}
