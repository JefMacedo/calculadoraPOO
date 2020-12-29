package calculadora.fabrica;

import calculadora.classes.*;
import calculadora.interfaces.CalculadorMatematico;

public class FabricaCalculos {
    
    public CalculadorMatematico criarCalculador(int numero1, int numero2, String calculo) {
        if(calculo.equals("+")){
            return new Adcao(numero1, numero2);
        } else if(calculo.equals("-")){
            return new Subtracao(numero1, numero2);
        } else if(calculo.equals("*")){
            return new Multiplicacao(numero1, numero2);
        } else if(calculo.equals("/")){
            return new Divisao(numero1, numero2);
        } else return null;
    }
}
