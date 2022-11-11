
package percursoveiculo;


public class TanqueCombustivel {
    private double capacidadeMaxima;
    private double volumeAtual;
    private double combustivelUtilizado;

    public TanqueCombustivel(double capacidadeMaxima, double volumeAtual, double combustivelUtilizado) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.volumeAtual = volumeAtual;
        this.combustivelUtilizado = combustivelUtilizado;
    }

    public void consumir(int qtd){
        
    }
    
    public void receber(int qtd, Combustivel combustivel){
        
    }
    
    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public double getVolumeAtual() {
        return volumeAtual;
    }

    public double getCombustivelUtilizado() {
        return combustivelUtilizado;
    }
    
    
}
