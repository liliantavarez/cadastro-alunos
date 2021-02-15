package ATIVIDADE03;

import java.util.ArrayList;

public class Estudante {

    private String nome, sexo, matricula;
    private int idade;
    private ArrayList <Disciplina> disciplina= new ArrayList <Disciplina>();
    private ArrayList <Endereco> endereco= new ArrayList <Endereco>();
    private ArrayList <Contato> contato= new ArrayList <Contato>();

    public Estudante(String nome, String sexo, String matricula, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.matricula = matricula;
        this.idade = idade;
    }

    public Estudante() {
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina novaDis) {
        disciplina.add(novaDis);
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


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\nEstudante\n" + "\nNome: " + nome + "\nMatricula: " + matricula+disciplina.toString();
    }

}
