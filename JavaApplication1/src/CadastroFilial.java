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
public class CadastroFilial {
    
    String[] nomes = new String[100];
    String[] cnpjs = new String[100];
    String[] cidades = new String[100];
    String[] telefones = new String[100];
    String[] emails = new String[100];
    int[] quantMaxColaboradores = new int[100];
    double[] tamanhoMaxEstoques = new double[100];
    double[] orcamentMaxMensal = new double[100];
    int atual = 0;

public void Cadastro(){
    solicitarInformacao(atual);
            atual++;
}


public void editar(){
   
    String busca = JOptionPane.showInputDialog("Digite o nome da Filial para editar");
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
        texto += nomes[posicao] + " "+ cnpjs[posicao] + "\n";
    }
     JOptionPane.showMessageDialog(null, texto);
}


public void contabilizarPeloNome(){
    String busca = JOptionPane.showInputDialog("Digite o nome parcial para efetura a busca");
    int quantidadeRegistros = 0;
    for( int posicao = 0; posicao < atual; posicao++){
        if(nomes[posicao].contains(busca)){
            quantidadeRegistros++;
        }
    }
         JOptionPane.showMessageDialog(null, "A quantidade de "+ busca + " é "+ 
                  quantidadeRegistros);
} 

public void buscarPeloNome(){        
        String busca = JOptionPane.showInputDialog("Digite o nome parcial que você deseja encontrar");
        for(int posicao = 0; posicao < atual; posicao++){
            if(nomes[posicao].contains(busca)){
                apresentarInformacao(posicao);
            }
        }
}           

public void buscaCNPJ(){
  String cnpjBuscado = JOptionPane.showInputDialog("Digite o cnpj para a busca");
  for(int posicao = 0; posicao <atual; posicao++){
      if(cnpjs[posicao].equals(cnpjBuscado)){
          apresentarInformacao(posicao);
          return;
      }
  }
       JOptionPane.showMessageDialog(null, "O CNPJ não foi encontrado");
}



public void apresentarInformacao(int posicao){
    JOptionPane.showMessageDialog(null,
            "Nome: "+ nomes[posicao]
           +"\nCNPJ: "+ cnpjs[posicao]
           +"\nCidade: "+ cidades[posicao]
           +"\nTelefone "+ telefones[posicao]
           +"\nEmail: "+ emails[posicao]
           +"\nQuantidade máxima de colaboradores:+ "+ quantMaxColaboradores[posicao]
           +"\nTamanho máximo do estoque:"+ tamanhoMaxEstoques[posicao]
           +"\nOrçamento máximo mensal: "+ orcamentMaxMensal[posicao]);
 
}




public void solicitarInformacao(int posicao){
    
    nomes[posicao] = JOptionPane.showInputDialog("Digite o nome da filial").trim();
    cnpjs[posicao] = JOptionPane.showInputDialog("Digite o CNPJ")
            .replace(".","").replace("/","").replace(" ","");
    cidades[posicao] = JOptionPane.showInputDialog("Cidade aonde se encontra a Filial");
    telefones[posicao] = JOptionPane.showInputDialog("Telefone da Filial");
    emails[posicao] = JOptionPane.showInputDialog("Email da Filial");
    quantMaxColaboradores[posicao] = Integer.parseInt(JOptionPane.showInputDialog
        ("Quantidade máxima de colaboradores"));
    tamanhoMaxEstoques[posicao] = Double.parseDouble(JOptionPane.showInputDialog
        ("Tamanho do estoque"));
    orcamentMaxMensal[posicao] = Double.parseDouble(JOptionPane.showInputDialog
        ("Orçamento máximo mensal"));
    
   }
} 


