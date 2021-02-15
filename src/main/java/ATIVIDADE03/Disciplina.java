package ATIVIDADE03;

public class Disciplina {
    
    private double[]notasUT1= new double[4];
    private double[]notasUT2= new double[4];
    private double provaFinal;
    private int numeroFaltas,periodoLetivo;
    private String nomeDisciplina, nomeProfessor,status;

    public Disciplina(int periodoLetivo, String nomeDisciplina,String nomeProfessor,int numeroFaltas,double provaFinal) {
        this.provaFinal = provaFinal;
        this.nomeDisciplina = nomeDisciplina;
        this.numeroFaltas = numeroFaltas;
        this.nomeProfessor = nomeProfessor;
        this.periodoLetivo = periodoLetivo;
    }

    public Disciplina() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double[] getNotasUT1() {
        return notasUT1;
    }

    public void addNotasUT1(double[] notasUT1) {
        this.notasUT1 = notasUT1;
    }

    public double[] getNotasUT2() {
        return notasUT2;
    }

    public void addNotasUT2(double[] notasUT2) {
        this.notasUT2 = notasUT2;
    }
    
    public double getProvaFinal() {
        return provaFinal;
    }

    public void setProvaFinal(double provaFinal) {
        this.provaFinal = provaFinal;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    public void setNumeroFaltas(int numeroFaltas) {
        this.numeroFaltas = numeroFaltas;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public int getPeriodoLetivo() {
        return periodoLetivo;
    }

    public void setPeriodoLetivo(int periodoLetivo) {
        this.periodoLetivo = periodoLetivo;
    }

    @Override
    public String toString() {
        return "\nDisciplina(s) cadastradas\n"+
                "\nDisciplina:"+ nomeDisciplina + 
                "\nPeriodo:"+ periodoLetivo+
                "\nStatus:"+status;
    }

    
    
}
