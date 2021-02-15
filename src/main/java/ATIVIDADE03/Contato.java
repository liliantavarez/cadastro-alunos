package ATIVIDADE03;

public class Contato {
    
    private String email,telefone,redeSocial;

    public Contato(String email, String telefone, String redeSocial) {
        this.email = email;
        this.telefone = telefone;
        this.redeSocial = redeSocial;
    }

    public Contato() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }
}
