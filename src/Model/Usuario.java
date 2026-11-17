package Model;

public class Usuario{
    private int id;
    private String nome;
    private Login login;

    public Usuario(){}

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setLogin(Login login){
        this.login = login;
    }
    public Login getLogin(){
        return login;
    }
}
