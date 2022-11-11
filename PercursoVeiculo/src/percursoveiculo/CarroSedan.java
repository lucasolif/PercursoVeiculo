
package percursoveiculo;


public class CarroSedan extends Veiculos{
    private Freios freiosTambor;

    public CarroSedan(Freios freiosTambor, double quilometragem) {
        super(quilometragem);
        this.freiosTambor = freiosTambor;
    }

    public Freios getFreiosTambor() {
        return freiosTambor;
    }
    
 
}
