package Model;

public class ProdutoDigital extends Produto{
    private double tamanho;
    private String linkDownload;

    public ProdutoDigital(){}

    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }
    public double getTamanho(){
        return tamanho;
    }

    public void setLinkDownload(String linkDownload){
        this.linkDownload = linkDownload;
    }
    public String getLinkDownload(){
        return linkDownload;
    }
}
