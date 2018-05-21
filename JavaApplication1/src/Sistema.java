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
public class Sistema {

    CadastroCliente registroCliente = new CadastroCliente();
    
    public void apresentarMenu() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar Cliente"
                + "\n2 - CADASTRAR"
                + "\n3 - EDITAR"
                + "\n4 - ESTATÍSTICAS"
                + "\n5 - SOBRE"
                + "\n8001 - Sair"));

        while (menu != 8001) {
            switch (menu) {
                case 1: registroCliente.cadastrar(); break;
                case 2: registroCliente.editar(); break;
                case 3: registroCliente.estatísticas(); break;
                case 4: registroCliente.sobre(); break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,    
                "1 - Cadastrar Cliente"
                + "\n2 - CADASTRAR"
                + "\n3 - EDITAR"
                + "\n4 - ESTATÍSTICAS"
                + "\n5 - SOBRE"
                + "\n8001 - Sair"));
        }
    }

}