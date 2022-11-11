
package percursoveiculo;


public class FreioABS extends Freios{

    public FreioABS(double vidaUtilTotal, double vidaUtilRestante) {
        super(vidaUtilTotal, vidaUtilRestante);
    }

    @Override
    public void arrumar() {
        super.arrumar(); 
    }

    @Override
    public void usarFreios(double distancia, double velocidade) {
        super.usarFreios(distancia, velocidade);
    }
    
    
}
