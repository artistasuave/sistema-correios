
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
                    break;
                case 5:
                    estatisticas();
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
            menuColaboradores = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1 - Cadastrar Colaborador"
                    + "\n2 - Buscar por Nome"
                    + "\n3 - Buscar por CPF"
                    + "\n4 - Editar"
                    + "\n5 - Estatisticas"
                    + "\n8001 - SAIR"));
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
    Double[] salario = new Double[100];
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
        String busca = JOptionPane.showInputDialog("Digite o nome para editar");
        for (int i = 0; i < atual; i++) {
            if (nome[i].equals(busca)) {
                solicitarInformacao(i);
                return;
            }
        }
    }

    public void estatisticas() {
        /*TODO implementar estatisticas: 
        - Data da contratação: colaborador mais jovem e colaborador mais antigo
        dataContratação
        MAX.VALUE*/
        int maisIdade = Integer.MIN_VALUE, menosIdade = Integer.MAX_VALUE;
        double maiorSalario = Integer.MIN_VALUE, menorSalario = Integer.MAX_VALUE;

        if (salario > maiorSalario) {
            maiorSalario = salario;
        }

        /*
        - SALÁRIO (double)
        salario
        int maiorSalario = Integer.MIN_VALUE, menorSalario = Integer.MAX_VALUE;
        double mediaSalario = 0, mediaPorFilial = 0;
         */
    }

    public void solicitarInformacao(int posicao) {
        if (CadastroFilial.atual == 0) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO: NÃO HÁ FILIAIS CADASTRADAS!"
                    + "\nPara cadastrar um colaborador é necessário que haja uma filial previamente cadastrada.");
        } else {

            nome[posicao] = JOptionPane.showInputDialog("Insira o nome do colaborador");
            cpf[posicao] = JOptionPane.showInputDialog("Insira o CPF do colaborador").replace(".", "").replace("-", "");
            //TODO validação da quantidade de caracteres inseridos no CPF
            dataNascimento[posicao] = JOptionPane.showInputDialog("Insira a data de nascimento do colaborador").replace(".", "").replace("-", "").replace("/", "");
            //TODO validação data de nascimento
            telefone[posicao] = JOptionPane.showInputDialog("Insira o telefone do colaborador");
            //TODO validação número de telefone+ddd
            email[posicao] = JOptionPane.showInputDialog("Insira o email do colaborador");
            dataContratacao[posicao] = JOptionPane.showInputDialog("Insira a data de contratação do colaborador").replace(".", "").replace("-", "").replace("/", "");
            //TODO validação data da contratação
            regimeContratacao[posicao] = JOptionPane.showInputDialog(null,
                    "Selecione o regime de contratação",
                    "REGIME DE CONTRATAÇÃO",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{
                        "", "Concursado", "Terceirizado",},
                    "")
                    .toString();
            funcao[posicao] = JOptionPane.showInputDialog("Insira a função do colaborador");
            salario[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário do colaborador"));
            filialAtuacao[posicao]
                    // listar valores da variável 'nomes' do cadastro de filiais como menu
                    = JOptionPane.showInputDialog(null,
                            "Selecione a filial de atuação",
                            "FILIAIS DE ATUAÇÃO",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            nome,
                            "")
                            .toString();
            /*
            Object[] nomes = new Object[CadastroFilial.atual];
            for (int i = 0; i < CadastroFilial.atual; i++) {
                nomes[i] = CadastroFilial.nomes[i];
             */
        }
    }
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
