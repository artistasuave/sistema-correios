
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos Guilherme Bialas
 */
public class Servicos {
    
    public void menuServicos(){
        int menuDeServicos = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "\n1 - Cadastrar o serviço"
                +"\n2 - Buscar pelo serviço"
                +"\n3 - Editar"
                +"\n8001 - SAIR"));
   
    while(menuDeServicos != 8001){
        
        switch (menuDeServicos){
            case 1:
                cadastrar();
                break;
            case 2:
                buscarPeloServico();
                break;
            case 3:
                editar();
            default:
                    JOptionPane.showMessageDialog(null, "Opção invalida");
        }
           menuDeServicos = Integer.parseInt(JOptionPane.showInputDialog(null,
                     "1 - Cadastrar"
                    + "\n2 - Buscar"
                    + "\n3 - Editar"
                    + "\n8001 - Sair"));
    
    }
    }
    

    String[] nomes = new String[100];
    String[] descricao = new String[100];
    double[] valorPago = new double[100];
    String[] abrangencia = new String[100];
    int[] tempoMaxEntrega = new int[100];
    double[] pesoMaxCorrespodencia = new double[100];
    String[] tributacao = new String[100];
    int atual = 0;
    
    public void cadastrar(){
        solicitarInformacao(atual);
        atual++;
    }
    public void editar(){
        String busca = JOptionPane.showInputDialog("Digite o nome do produto para editar");
          for(int posicao = 0; posicao < atual; posicao++){
              if(nomes[posicao].equals(busca)){
                  solicitarInformacao(posicao);
                  return;
              }
          }
   
    }
public void listar(){
    String texto = "";
    for(int posicao = 0; posicao < atual; posicao++){
        texto += nomes[posicao] + " "+ valorPago[posicao]+ "\n";
}
   JOptionPane.showMessageDialog(null, texto);
}
public void contabilizarPeloServico(){
    String busca = JOptionPane.showInputDialog("Digite o nome do  serviço");
    int quantidadeRegistros = 0;
    for(int posicao; posicao < atual; atual++){
        if(nomes[posicao].contains(busca)){
            quantidadeRegistros++;
        }
    }
 JOptionPane.showMessageDialog(null,  "A quantidade de "+ busca+ " é "+ quantidadeRegistros);
 
}
public void buscarPeloServico(){
    String busca = JOptionPane.showInputDialog("Digite o derviço para efetuar a busca");
    for(int posicao = 0; posicao < atual; posicao++){
        if(nomes[posicao].contains(busca)){
            apresentarInformacao(posicao);
        }
    }
}
public void apresentarInformacao(int posicao){
    JOptionPane.showMessageDialog(null, 
            "\nServiço: "+ nomes[posicao]
            +"\nDescrição: "+ descricao[posicao]
            +"\nValor pago: "+ valorPago[posicao]+ " reais"
            +"\nÁrea de abrangência: " + abrangencia[posicao]
            +"\nTempo máximo para a entrega:"+ tempoMaxEntrega[posicao]+ " dias"
            +"\nPeso máximo da correspodência: "+ pesoMaxCorrespodencia[posicao]+ " Kg"
            +"\nTributação: "+ tributacao[posicao]+ " reais");
}
public void solicitarInformacao(int posicao){
    nomes[posicao] = JOptionPane.showInputDialog("Digite o nome do serviço").trim();
    descricao[posicao] = JOptionPane.showInputDialog("Descrição do serviço");
    valorPago[posicao] = Integer.parseInt(JOptionPane.showInputDialog("valor do serviço"));
    abrangencia[posicao] = JOptionPane.showInputDialog(null, "Região de abrangência", "", JOptionPane.QUESTION_MESSAGE,
            null, new Object[]{"Norte", "Nordeste", "centro-Oeste", "Sudeste","Sul"}, "Sul").toString();
    //colocar a caixa de dialogo contendo as 
    tempoMaxEntrega[posicao] = Integer.parseInt(JOptionPane.showInputDialog("Tempo máximo da entrega"));
    pesoMaxCorrespodencia[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Peso máximo da correspodêcia"));
    tributacao[posicao] = JOptionPane.showInputDialog("Tributação do serviço");
    
    
}
    
}