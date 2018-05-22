
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
                    selecaoMenu.colaboradores();
                    break;
                case 2:
                    selecaoMenu.fornecedores();
                    break;
                case 3:
                    selecaoMenu.produtos();
                    break;
                case 4:
                    selecaoMenu.filiais();
                    break;
                case 5:
                    selecaoMenu.sobre();
                    break;
                default:
             JOptionPane.showMessageDialog(null, "Opção Inválida");
             }
            }
    }
}