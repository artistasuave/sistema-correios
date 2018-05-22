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
public class fornecedores {
    String[] razaoSocial = new String[100];
    String[] cnpj = new String[100];
    String[] material = new String [100];
    String[] formaPagamento = new String [100];
    String[] periodoContratacao = new String [100];
    int[] validadeContrato = new int [100];
    String[] regimeContratacao = new String [100];
    int atual = 0;
    
    public void cadastrar(){
    //TODO implementar cadastro
    razaoSocial[atual] = JOptionPane.showInputDialog("Insira a Razão Social");
    cnpj[atual] = JOptionPane.showInputDialog("Insira o CNPJ");
    material[atual] = JOptionPane.showInputDialog("Insira o material ou serviço fornecido");
    formaPagamento [atual] = JOptionPane.showInputDialog(null,
            "Selecione a forma de pagamento",
            "PAGAMENTO AO FORNECEDOR",
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[]{
                "", "Dinheiro", "Permuta de Serviços", "Fatura a prazo"
            },
            ""
            );
    periodoContratacao [atual] = JOptionPane.showInputDialog(null,
            "Selecione a periodização da contratação",
            "CONTRATAÇÃO DO FORNECEDOR",
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[]{
                "", "Semanal", "Quinzenal", "Mensal", "Semestral"
            },
            ""
            );
    validadeContrato
}
    public void buscarPorRazaoSocial(){
    //TODO implementar busca Razão Social
}
    public void buscarPorCNPJ(){
    //TODO implementar busca por CNPJ
}
    public void listar(){
    //TODO implementar listagem
}
    public void editar(){
    //TODO implementar edição
}
    public void estatisticas(){
    //TODO implementar estatisticas
    }
    
}
