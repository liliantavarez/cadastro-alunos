package ATIVIDADE03;

import java.util.ArrayList;

public class Universidade {
    
    private String nome;
    private int campus;
    private ArrayList <Estudante> estudante = new ArrayList <Estudante>();
    private ArrayList <Endereco> endereco= new ArrayList <Endereco>();
    private ArrayList <Contato> contato= new ArrayList <Contato>();

    public Universidade(String nome, int campus) {
        this.nome = nome;
        this.campus = campus;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCampus() {
        return campus;
    }

    public void setCampus(int campus) {
        this.campus = campus;
    }

    public ArrayList<Estudante> getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante novaEstu) {
        estudante.add(novaEstu);
    }

    public ArrayList<Endereco> getendereco() {
        return endereco;
    }

    public void setEndereco(Endereco novoEnd) {
        endereco.add(novoEnd);
    }

    public ArrayList<Contato> getContato() {
        return contato;
    }

    public void setContato(Contato novoCont) {
        contato.add(novoCont);
    }
    
    public Universidade() {
    }
    

    @Override
    public String toString() {
        return "Universidade: "+nome + "   Campus: " + campus+"\n"+estudante.toString();
    }

    
    
   }
