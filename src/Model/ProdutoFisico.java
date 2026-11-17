package Model;

public class ProdutoFisico extends Produto{
    private double peso;

    public ProdutoFisico(){}

    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
}
