package Carros;

public class TesteCarro{
    public static void main(String[] args) {
        // Instanciando dois Veiculos 
        Carro fiat = new Carro(30,"verde"); // Primeiro veiculo com velocidade 3O e cor azul
        Carro gol = new Carro (25,"preto");// Segundo veiculo com velocidade 25 e cor preto
        
        //Exibindo os valores nas variaveis (Getters)
        System.out.println(fiat.getCor()); // Exibindo o atributo Cor 
        System.out.println(fiat.getVelocidade()); // Exibindo o atributo Velocidade 

        //Adicionando valores nas variaveis (Setters)
        gol.setCor("Amarelo"); // Troca o valor antes definido como PRETO para AMARELO na variavel
                                                   // cor
        gol.setVelocidade(45); // Adicionar o valor de 45 a variavel VELOCIDADE, trocando o valor 25 por 45

        //Chamar metodos 
        while(gol.getVelocidade() <=60){ // Fazer carro gol acelerar até 60 
            gol.acelerar(); // Chamar o metodo ACELERAR 
        }
        fiat.frear(); // Fazer o carro fiat frear ou ficar com velocidade = 0 

       }
}
