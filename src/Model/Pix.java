package Model;

public class Pix extends ModoDePagamento{
    private String chave;

    public Pix(){}

    public void setChave(String chave){
        this.chave = chave;
    }
    public String getChave(){
        return chave;
    }
}
