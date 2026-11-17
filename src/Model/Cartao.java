package Model;

public class Cartao extends ModoDePagamento{
    private String titular;
    private String numero;
    private String validade;
    private String cvv;

    public Cartao(){}

    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getTitular(){
        return titular;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getNumero(){
        return numero;
    }

    public void setValidade(String validade){
        this.validade = validade;
    }
    public String getValidade(){
        return validade;
    }

    public void setCvv(String cvv){
        this.cvv = cvv;
    }
    public String getCvv(){
        return cvv;
    }
    
}
