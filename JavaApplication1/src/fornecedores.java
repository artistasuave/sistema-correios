
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Michelle de Jesus Rogério
 */
public class Fornecedores {

    public void menuFornecedor() {

        Fornecedores fornecedores = new Fornecedores();
        int menuFornecedores = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar Fornecedor"
                + "\n2 - Buscar por Razão Social"
                + "\n3 - Buscar por CNPJ"
                + "\n4 - Listar"
                + "\n5 - Editar"
                + "\n8001 - SAIR"));

        while (menuFornecedores != 8001) {

            switch (menuFornecedores) {
                case 1:
                    fornecedores.cadastrar();
                    break;
                case 2:
                    fornecedores.buscarPorRazaoSocial();
                    break;
                case 3:
                    fornecedores.buscarPorCNPJ();
                    break;
                case 4:
                    fornecedores.listar();
                case 5:
                    fornecedores.editar();
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
            menuFornecedores = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1 - Cadastrar Fornecedor"
                    + "\n2 - Buscar por Razão Social"
                    + "\n3 - Buscar por CNPJ"
                    + "\n4 - Listar"
                    + "\n5 - Editar"
                    + "\n8001 - SAIR"));
        }
    }
    String[] razaoSocial = new String[100];
    String[] cnpj = new String[100];
    String[] material = new String[100];
    String[] formaPagamento = new String[100];
    String[] periodoContratacao = new String[100];
    String[] validadeContrato = new String[100];
    String[] regimeContratacao = new String[100];
    int atual = 0, ultimo = 0;

    public void cadastrar() {
        solicitarInformacao(atual);
        atual++;
    }

    public void buscarPorRazaoSocial() {
        String buscaRazao = JOptionPane.showInputDialog("Digite a razão social parcial para busca");
        for (int i = 0; i < atual; i++) {
            if (razaoSocial[i].contains(buscaRazao)) {
                apresentarInformacao(i);
            }
        }
    }

    public void buscarPorCNPJ() {
        String buscaCNPJ = JOptionPane.showInputDialog("Digite o CNPJ para busca");
        for (int i = 0; i < atual; i++) {
            if (cnpj[i].equals(buscaCNPJ)) {
                apresentarInformacao(i);
            }
        }
        JOptionPane.showMessageDialog(null, "CNPJ não encontrado");
    }

    public void listar() {
        String texto = "";
        if (ultimo > 0) {
            for (int posicao = 0; posicao < ultimo; posicao++) {
                texto += razaoSocial[posicao] + "\n";
            }
        } else {
            texto = "Não há empresas cadastradas.";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void editar() {
        String busca = JOptionPane.showInputDialog("Digite o nome do fornecedor que deseja editar");
        for (int i = 0; i < atual; i++) {
            if (razaoSocial[i].equals(busca)) {
                solicitarInformacao(i);
                return;
            }
        }
    }

    public void solicitarInformacao(int posicao) {
        razaoSocial[posicao] = JOptionPane.showInputDialog("Insira a Razão Social");
        cnpj[posicao] = JOptionPane.showInputDialog("Insira o CNPJ").replace(".", "").replace("-", "").replace("/", "");
        material[posicao] = JOptionPane.showInputDialog("Insira o material ou serviço fornecido");
        formaPagamento[posicao] = JOptionPane.showInputDialog(null,
                "Selecione a forma de pagamento",
                "PAGAMENTO AO FORNECEDOR",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "", "Dinheiro", "Permuta de Serviços", "Fatura a prazo"
                },
                "")
                .toString();
        periodoContratacao[posicao] = JOptionPane.showInputDialog(null,
                "Selecione a periodização da contratação",
                "CONTRATAÇÃO DO FORNECEDOR",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "", "Semanal", "Quinzenal", "Mensal", "Semestral"
                },
                "")
                .toString();
        validadeContrato[posicao] = JOptionPane.showInputDialog("Digite a data de validade do contrato").replace(".", "").replace("-", "").replace("/", "");
        //TODO criar alerta caso a data de validade seja menor do que 1 mês

        regimeContratacao[posicao] = JOptionPane.showInputDialog(null,
                "Selecione o método de contratação",
                "CONTRATAÇÃO DO FORNECEDOR",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{
                    "", "Licitação", "Contrato Particular"
                },
                "")
                .toString();
    }

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null,
                "Razão Social: " + razaoSocial[posicao]
                + "\nCNPJ: " + cnpj[posicao]
                + "\nMaterial ou Serviço fornecido: " + material[posicao]
                + "\nForma de Pagamento: " + formaPagamento[posicao]
                + "\nPeriodização da contratação: " + periodoContratacao[posicao]
                + "\nValidade do Contrato: " + validadeContrato[posicao]
                + "\nRegime de Contratação: " + regimeContratacao[posicao]
        );

    }
}
