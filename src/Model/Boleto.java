package Model;

public class Boleto extends ModoDePagamento{
    private String codigoBarras;

    public Boleto(){}

    public void setCodigoBarras(String codigoBarras){
        this.codigoBarras = codigoBarras;
    }
    public String getCodigoBarras(){
        return codigoBarras;
    }
    
}
