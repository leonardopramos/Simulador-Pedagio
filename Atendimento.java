public class Atendimento {
    private int valor;
    public void Atender(Cabine c){
        if(c.getFilaDeCarros().retornaPrimeiroVeiculo().getTipo() == "Carro"){
            this.valor = valor + 3;
        }
        if(c.getFilaDeCarros().retornaPrimeiroVeiculo().getTipo() == "Moto"){
            this.valor = valor + 1;
        }
        if(c.getFilaDeCarros().retornaPrimeiroVeiculo().getTipo() == "Caminhao"){
            this.valor = valor + 10;
        }
        ListaAtendimentos.getAtendidos().adicionar(c.getFilaDeCarros().retornaPrimeiroVeiculo());
        c.getFilaDeCarros().remover();
    }
    public int getValor() {
        return valor;
    }
    
}
