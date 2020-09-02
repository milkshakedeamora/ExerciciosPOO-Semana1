package Carros;

public class Carro {
    
    private int velocidade;
    private String cor;
    
    public Carro (int vel, String color){
        velocidade = vel;
        cor = color;
    }
    public void acelerar(){
        velocidade++;
    }
    public void frear(){
        while(velocidade >=0){
            velocidade--;
        }
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public String getCor() {
        return cor;
    }
    public int getVelocidade() {
        return velocidade;
    }

}
