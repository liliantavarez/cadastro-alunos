package ATIVIDADE03;

public class Endereco {
    
    private String pais,uf,cidade,rua;
    private int numero;

    public Endereco(String pais, String uf, String cidade, String rua, int numero) {
        this.pais = pais;
        this.uf = uf;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }
    
    public Endereco() {
    }
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }   
}
