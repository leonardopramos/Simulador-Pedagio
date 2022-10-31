
public class Cabine{

    private int qtdVeiculos;
    private Fila filaDeCarros;
    private int numeroCabine;

    public Cabine(int numeroCabine){
        this.filaDeCarros = new Fila();
        this.qtdVeiculos = filaDeCarros.getQuantidade();
        this.numeroCabine = numeroCabine;

    }

   
    
    public int getNumeroCabine() {
        return numeroCabine;
    }

    public int getQtdVeiculos() {
        return qtdVeiculos;
    }
    public Fila getFilaDeCarros() {
        return filaDeCarros;
    }

    
}