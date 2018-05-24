
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
public class Sistema{
    Colaboradores colaboradores = new Colaboradores();
    Fornecedores fornecedor = new Fornecedores();
    Servicos servicos = new Servicos();
    CadastroFilial filiais = new CadastroFilial();
    About sobre = new About();
    
    public void apresentarMenu() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Colaboradores"
                + "\n2 - Fornecedores"
                + "\n3 - Produtos/Serviços"
                + "\n4 - Filiais"
                + "\n5 - SOBRE"
                + "\n8001 - Sair"));

        while (menu != 8001) {
            switch (menu) {
                case 1:
                    colaboradores.menuColaborador();
                    break;
                case 2:
                    fornecedor.menuFornecedor();
                    break;
                case 3:
                    servicos.menuServicos();
                    break;
                case 4:
                    filiais.menuFilial();
                    break;
                case 5:
                    sobre.menuAbout();
                    break;
                default:
             JOptionPane.showMessageDialog(null, "Opção Inválida");
             }
            }
    }
}