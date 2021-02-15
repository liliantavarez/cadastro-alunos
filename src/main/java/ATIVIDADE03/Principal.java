package ATIVIDADE03;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

public class Principal {

    public static void main(String[] args) {

        int escolha;
        double somaUT1 = 0, somaUT2 = 0;
        Universidade novoCadUni = new Universidade();

        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("OPCOES DE CADASTRO:\n1. Cadastro Faculdade\n2. Cadastrar Alunos\n3. Exibir Estudante\n0. Sair"));

            switch (escolha) {

                case 1:

                    JOptionPane.showMessageDialog(null, "Insira os dados da universidade");
                    String nome = showInputDialog("Nome: ");
                    int campus = Integer.parseInt(JOptionPane.showInputDialog("Campus:"));

                    novoCadUni.setNome(nome);
                    novoCadUni.setCampus(campus);

                    String pais = showInputDialog("Pais: ");
                    String uf = showInputDialog("UF: ");
                    String cidade = showInputDialog("Cidade: ");
                    String rua = showInputDialog("Rua: ");
                    int numero = Integer.parseInt(showInputDialog("Nº:"));

                    Endereco novoEndUni = new Endereco(pais, uf, cidade, rua, numero);

                    String email = showInputDialog("E-mail:");
                    String telefone = showInputDialog("Telefone:");
                    String redeSocial = showInputDialog("Rede Social:");

                    Contato novoContUni = new Contato(email, telefone, redeSocial);

                    novoCadUni.setContato(novoContUni);
                    novoCadUni.setEndereco(novoEndUni);

                    break;
                case 2:
                    Estudante novoEstu = new Estudante();

                    JOptionPane.showMessageDialog(null, "Insira os dados do estudante");
                    String nomeAluno = showInputDialog("Nome: ");
                    novoEstu.setNome(nomeAluno);
                    String sexo = showInputDialog("Sexo: ");
                    novoEstu.setSexo(sexo);
                    String matricula = showInputDialog("Matricula: ");
                    novoEstu.setMatricula(matricula);
                    int idade = Integer.parseInt(showInputDialog("Idade: "));
                    novoEstu.setIdade(idade);

                    String paisAluno = showInputDialog("Pais: ");
                    String ufAluno = showInputDialog("UF: ");
                    String cidadeAluno = showInputDialog("Cidade: ");
                    String ruaAluno = showInputDialog("Rua: ");
                    int numeroAluno = Integer.parseInt(showInputDialog("Nº:"));
                    Endereco novoEndEstu = new Endereco(paisAluno, ufAluno, cidadeAluno, ruaAluno, numeroAluno);

                    String emailAluno = showInputDialog("E-mail:");
                    String telefoneAluno = showInputDialog("Telefone:");
                    String redeSocialAluno = showInputDialog("Rede Social:");
                    Contato novoContEstu = new Contato(emailAluno, telefoneAluno, redeSocialAluno);

                    novoEstu.setEndereco(novoEndEstu);
                    novoEstu.setContato(novoContEstu);

                    novoCadUni.setEstudante(novoEstu);

                    int cadDis = JOptionPane.showConfirmDialog(null, "Deseja cadastrar uma disciplia?", "CADASTRO DISCIPLINA", JOptionPane.YES_NO_OPTION);
                    while (cadDis == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Cadastrar Disciplina(s)");
                        int periodo = Integer.parseInt(showInputDialog("Periodo Letivo:"));
                        String nomeDis = showInputDialog("Disciplina: ");
                        String nomeProf = showInputDialog("Professor: ");
                        int faltas = Integer.parseInt(showInputDialog("Faltas:"));
                        double notaFinal = 0;
                        Disciplina novaDis = new Disciplina(periodo, nomeDis, nomeProf, faltas, notaFinal);
                        double[] notasUT1 = new double[4];
                        double[] notasUT2 = new double[4];
                        for (int i = 0; i < notasUT1.length; i++) {
                            notasUT1[i] = (Double.parseDouble(showInputDialog("Nota " + (i + 1) + " da 1ª Unidade:")));
                            novaDis.addNotasUT1(notasUT1);
                            somaUT1 = notasUT1[i] + somaUT1;
                        }
                        for (int i = 0; i < notasUT2.length; i++) {
                            notasUT2[i] = (Double.parseDouble(showInputDialog("Nota " + (i + 1) + " da 2ª Unidade:")));
                            novaDis.addNotasUT2(notasUT2);
                            somaUT2 = notasUT2[i] + somaUT2;
                        }
                        double mediaUT1 = somaUT1 / 4;
                        double mediaUT2 = somaUT2 / 4;
                        double mediaFinal = (mediaUT1 + mediaUT2) / 2;
                        if (mediaFinal >= 4 && mediaFinal < 7) {
                            notaFinal = (Double.parseDouble(showInputDialog("Nota da final:")));
                            novaDis.setProvaFinal(notaFinal);
                            mediaFinal = (mediaFinal + notaFinal) / 2;
                            if (mediaFinal >= 5) {
                                novaDis.setStatus("Aprovado na final com media:" + mediaFinal);
                            } else {
                                novaDis.setStatus("Reprovado na final com media:" + mediaFinal);
                            }
                        } else if (mediaFinal < 4) {
                            novaDis.setStatus("Reprovado com Media:" + mediaFinal);
                        } else {
                            novaDis.setStatus("Aprovado com Media:" + mediaFinal);
                        }
                        novoEstu.setDisciplina(novaDis);
                        somaUT1 = 0;
                        mediaUT1 = 0;
                        somaUT2 = 0;
                        mediaUT2 = 0;
                        cadDis = JOptionPane.showConfirmDialog(null, "Deseja cadastrar uma nova disciplia?", "CADASTRO DISCIPLINA", JOptionPane.YES_NO_OPTION);
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, novoCadUni.toString());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇAO INVALIDA");
            }
        } while (escolha != 0);
    }
}
