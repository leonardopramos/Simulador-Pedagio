import java.util.Random;

public class Veiculo {
    
    private String placa;
    private String tipo;
    private String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String auxPlaca = "";
    private String auxTipo = "";
    private Random r = new Random();
    private int tempoAtendimento = r.nextInt(10, 60);

    private int selecionaTipo = r.nextInt(1, 4);


    public Veiculo(){

        auxPlaca += alfabeto.charAt(r.nextInt(1, 26));
        auxPlaca += alfabeto.charAt(r.nextInt(1, 26));
        auxPlaca += alfabeto.charAt(r.nextInt(1, 26));
        auxPlaca += r.nextInt(9);
        auxPlaca += alfabeto.charAt(r.nextInt(1, 26));
        auxPlaca += r.nextInt(9);
        auxPlaca += r.nextInt(9);

        switch (selecionaTipo) {
            case 1:
                auxTipo = "Moto";
                break;
            case 2:
                auxTipo = "Carro";
                break;
            case 3:
                auxTipo = "Caminhao";
                break;
        }
        
        this.placa = auxPlaca;
        this.tipo = auxTipo;
    }

    
    public String getPlaca() {
        return placa;
    }
    public String getTipo() {
        return tipo;
    }
    public int getTempoAtendimento() {
        return tempoAtendimento;
    }

    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", tipo=" + tipo + "]";
    }

   

}
