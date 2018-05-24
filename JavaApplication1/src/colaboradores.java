
import javax.swing.JOptionPane;

/**
 * @author Michelle de Jesus Rogério
 */
public class Colaboradores {

    public void menuColaborador() {

        int menuColaboradores = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar Colaborador"
                + "\n2 - Buscar por Nome"
                + "\n3 - Buscar por CPF"
                + "\n4 - Editar"
                + "\n5 - Estatisticas"
                + "\n8001 - SAIR"));

        while (menuColaboradores != 8001) {

            switch (menuColaboradores) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    buscarPeloNome();
                    break;
                case 3:
                    buscarPeloCPF();
                    break;
                case 4:
                    editar();
                case 5:
                    estatisticas();
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
            menuColaboradores = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1 - Cadastrar"
                    + "\n2 - Buscar"
                    + "\n3 - Editar"
                    + "\n4 - Estatísticas"
                    + "\n8001 - Sair"));
        }
    }

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
        solicitarInformacao(atual);
        atual++;
    }

    public void buscarPeloNome() {
        String buscaNome = JOptionPane.showInputDialog("Digite o nome parcial do colaborador para a busca");
        for (int i = 0; i < atual; i++) {
            if (nome[i].contains(buscaNome)) {
                apresentarInformacao(i);
            }
        }
    }

    public void buscarPeloCPF() {
        String buscaCPF = JOptionPane.showInputDialog("Digite o CPF para a busca");
        for (int i = 0; i < atual; i++) {
            if (cpf[i].equals(buscaCPF)) {
                apresentarInformacao(i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "CPF não encontrado");
    }

    public void editar() {
        //TODO implementar edição
    }

    public void estatisticas() {
        //TODO implementar estatisticas
    }

    public void solicitarInformacao(int posicao) {
        nome[posicao] = JOptionPane.showInputDialog("Insira o nome do colaborador");
        cpf[posicao] = JOptionPane.showInputDialog("Insira o CPF do colaborador").replace(".", "").replace("-", "");
        dataNascimento[posicao] = JOptionPane.showInputDialog("Insira a data de nascimento do colaborador").replace(".", "").replace("-", "").replace("/", "");
        telefone[posicao] = JOptionPane.showInputDialog("Insira o telefone do colaborador");
        email[posicao] = JOptionPane.showInputDialog("Insira o email do colaborador");
        dataContratacao[posicao] = JOptionPane.showInputDialog("Insira a data de contratação do colaborador").replace(".", "").replace("-", "").replace("/", "");
        regimeContratacao[posicao] = JOptionPane.showInputDialog("Insira o regime de contratação do colaborador");
        funcao[posicao] = JOptionPane.showInputDialog("Insira a função do colaborador");
        salario[posicao] = JOptionPane.showInputDialog("Insira o salário do colaborador");
        filialAtuacao[posicao] = JOptionPane.showInputDialog("Insira a filial de atuação do colaborador");
    }

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null,
                "Nome: " + nome[posicao]
                + "\nCPF: " + cpf[posicao]
                + "\nData de Nascimento: " + dataNascimento[posicao]
                + "\nTelefone: " + telefone[posicao]
                + "\nEmail: " + email[posicao]
                + "\nData da Contratação: " + dataContratacao[posicao]
                + "\nRegime de Contratação: " + regimeContratacao[posicao]
                + "\nFunção: " + funcao[posicao]
                + "\nSalário: " + salario[posicao]
                + "\nFilial de Atuação: " + filialAtuacao[posicao]);
    }

}
