import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Random r = new Random();

        Atendimento atd = new Atendimento();

        Cabine c1 = new Cabine(1);
        Cabine c2 = new Cabine(2);
        Cabine c3 = new Cabine(3);
        Cabine c4 = new Cabine(4);
        Cabine c5 = new Cabine(5);

        c1.getFilaDeCarros().adicionar(new Veiculo());
        c1.getFilaDeCarros().adicionar(new Veiculo());
        c2.getFilaDeCarros().adicionar(new Veiculo());
        c2.getFilaDeCarros().adicionar(new Veiculo());
        c3.getFilaDeCarros().adicionar(new Veiculo());
        c3.getFilaDeCarros().adicionar(new Veiculo());
        c4.getFilaDeCarros().adicionar(new Veiculo());
        c4.getFilaDeCarros().adicionar(new Veiculo());
        c5.getFilaDeCarros().adicionar(new Veiculo());
        c5.getFilaDeCarros().adicionar(new Veiculo());

        int tempo = 0;
        int tempoDeFila1 = 0;
        int tempoDeFila2 = 0;
        int tempoDeFila3 = 0;
        int tempoDeFila4 = 0;
        int tempoDeFila5 = 0;

        Scanner sc = new Scanner(System.in);

        while (tempo < 86400) {
            System.out.println("Teste de simulação");
            System.out.println("Status atual: ");

            System.out.println("Tempo: " + tempo);
            System.out.println("Cabine 1: " + c1.getFilaDeCarros());
            System.out.println("Cabine 2: " + c2.getFilaDeCarros());
            System.out.println("Cabine 3: " + c3.getFilaDeCarros());
            System.out.println("Cabine 4: " + c4.getFilaDeCarros());
            System.out.println("Cabine 5: " + c5.getFilaDeCarros());

            System.out.println("Número de carros que passaram pelo pedágio: " + ListaAtendimentos.getAtendidos().tamanho());
            System.out.println("Valor recebido até então: " + atd.getValor());

            System.out.println("Status da lista de atendidos.");
            System.out.println(ListaAtendimentos.getAtendidos());


            if(c1.getFilaDeCarros().estaVazia() == false){
                if(tempoDeFila1 >= c1.getFilaDeCarros().retornaPrimeiroVeiculo().getTempoAtendimento()){
                    atd.Atender(c1);
                    tempoDeFila1 = 0;
                }
            }
            if(c2.getFilaDeCarros().estaVazia() == false){
                if(tempoDeFila1 >= c2.getFilaDeCarros().retornaPrimeiroVeiculo().getTempoAtendimento()){

                    atd.Atender(c2);
                    tempoDeFila2 = 0;
                }
            }
            if(c3.getFilaDeCarros().estaVazia() == false){
                if(tempoDeFila3 >= c3.getFilaDeCarros().retornaPrimeiroVeiculo().getTempoAtendimento()){

                    atd.Atender(c3);
                    tempoDeFila3 = 0;
                }
            }
            if(c4.getFilaDeCarros().estaVazia() == false){

                if(tempoDeFila4 >= c4.getFilaDeCarros().retornaPrimeiroVeiculo().getTempoAtendimento()){
                    atd.Atender(c4);
                    tempoDeFila4 = 0;
                }
            }
            if(c5.getFilaDeCarros().estaVazia() == false){
                if(tempoDeFila5 >= c5.getFilaDeCarros().retornaPrimeiroVeiculo().getTempoAtendimento()){

                    atd.Atender(c5);
                    tempoDeFila5 = 0;
                }
            }

            int criarNovoCarro = r.nextInt(10);
            int selecionaCabine = r.nextInt(1, 6);

            if (criarNovoCarro >= 5) {
                Veiculo v = new Veiculo();

                switch (selecionaCabine) {
                    case 1:
                        c1.getFilaDeCarros().adicionar(v);
                        break;
                    case 2:
                        c2.getFilaDeCarros().adicionar(v);
                        break;
                    case 3:
                        c3.getFilaDeCarros().adicionar(v);
                        break;
                    case 4:
                        c4.getFilaDeCarros().adicionar(v);
                        break;
                    case 5:
                        c5.getFilaDeCarros().adicionar(v);
                        break;
                }
            }
            System.out.println("Para continuar a simulação aperte qualquer tecla.");

            tempo = tempo + 5;
            tempoDeFila1 = tempoDeFila1 + 5;
            tempoDeFila2 = tempoDeFila2 + 5;
            tempoDeFila3 = tempoDeFila3 + 5;
            tempoDeFila4 = tempoDeFila4 + 5;
            tempoDeFila5 = tempoDeFila5 + 5;

            sc.next();
            continue;
        }
        sc.close();
    }
}
