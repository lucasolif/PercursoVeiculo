
package percursoveiculo;

public class CarroEsportivo extends Veiculos{
    private Freios freioABS;

    public CarroEsportivo(Freios freioABS, double quilometragem) {
        super(quilometragem);
        this.freioABS = freioABS;
    }

    public Freios getFreioABS() {
        return freioABS;
    }
    
    
}
