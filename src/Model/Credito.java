package Model;

public class Credito extends Cartao{
    private int parcelas;

    public Credito(){}

    public void setParcelas(int parcelas){
        this.parcelas = parcelas;
    }
    public int getParcelas(){
        return parcelas;
    }
}
