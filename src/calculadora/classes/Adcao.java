package calculadora.classes;

public class Adcao extends CalculoMatematico {
    
    public Adcao(int numero1, int numero2) {
        super(numero1, numero2);
    }

    @Override
    protected int doCalcular(){
        return numero1 + numero2;
    }
}
