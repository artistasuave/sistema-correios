
import javax.swing.JOptionPane;

/**
 * @author Michelle de Jesus Rogério
 */
public class colaboradores {

    String[] nome = new String[100];
    String[] cpf = new String[100];
    String[] dataNascimento = new String[100];
    String[] telefone = new String[100];
    String[] email = new String[100];
    String[] dataContratacao = new String[100];
    // Estatísticas: colaborador+antigo, colaborador mais jovem
    String[] regimeContratacao = new String[100];
    String[] funcao = new String[100];
    String[] salario = new String[100];
    /*
     Estatísticas: maior salário, menor salário, média dos salários cadastrados, média dos salários por filial
     */
    String[] filialAtuacao = new String[100];
    int atual = 0;

    public void cadastrar() {
        //TODO implementar cadastro
        nome[atual] = JOptionPane.showInputDialog("Insira o nome do colaborador");
        cpf[atual] = JOptionPane.showInputDialog("Insira o CPF do colaborador").replace(".", "").replace("-","");
        dataNascimento[atual] = JOptionPane.showInputDialog("Insira a data de nascimento do colaborador").replace(".", "").replace("-","").replace("/","");
        telefone[atual] = JOptionPane.showInputDialog("Insira o telefone do colaborador");
        email[atual] = JOptionPane.showInputDialog("Insira o email do colaborador");
        dataContratacao[atual] = JOptionPane.showInputDialog("Insira a data de contratação do colaborador");
        regimeContratacao[atual] = JOptionPane.showInputDialog("Insira o regime de contratação do colaborador");
        funcao[atual] = JOptionPane.showInputDialog("Insira a função do colaborador");
        salario[atual] = JOptionPane.showInputDialog("Insira o salário do colaborador");
        filialAtuacao[atual] = JOptionPane.showInputDialog("Insira a filial de atuação do colaborador");
        atual++;
    }

    public void buscarPeloNome() {
        //TODO implementar busca
        String busca = JOptionPane.showInputDialog("Digite o nome parcial do colaborador para a busca");
        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                JOptionPane.showMesssageDialog(null,
                        "Nome: " + nome[i]
                        + "\nCPF: " + cpf[i]
                        + "\nData de Nascimento: " + dataNascimento[i]
                        + +"\nTelefone: " + telefone[i]
                        + "\nEmail: " + email[i]
                        + "\nData da Contratação: " + dataContratacao[i]
                        + "\nRegime de Contratação: " + regimeContratacao[i]
                        + "\nFunção: " + funcao[i]
                        + "\nSalário: " + salario[i]
                        + "\nFilial de Atuação: " + filialAtuacao[i]);
            }
        }
    }
    public void buscarPorCPF() {
    //TODO implementar busca por CPF
}

    public void editar() {
        //TODO implementar edição
    }

    public void estatisticas() {
        //TODO implementar estatisticas
    }

}
