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
    
   public void menuFilial(){
     
       int menuCadastroFiliais = Integer.parseInt(JOptionPane.showInputDialog(null, 
                         "\n1 - Cadastrar Filial"
                        +"\n2 - Buscar por nome"
                        +"\n3 - Buscar pelo CNPJ"
                        +"\n4 - Editar"
                        +"\n5 - Estatisticas"         
                        +"\n8001 - SAIR"));
       
       while(menuCadastroFiliais != 8001){
           
                 switch(menuCadastroFiliais){
                     case 1:
                         Cadastro();
                         break;
                     case 2:
                         buscarPeloNome();
                         break;
                     case 3:
                         buscaCNPJ();
                         break;
                     case 4:
                         editar();
                         break;
                     case 5:
                         estatisticas();
                          default:
                     JOptionPane.showMessageDialog(null, "Opção Inválida");
           }
                                 
                menuCadastroFiliais = Integer.parseInt(JOptionPane.showInputDialog(null,
                      "\n1 - Cadastrar"                  
                     +"\n2 - Buscar Pelo nome"
                     +"\n3 - Buscar pelo cnpj"
                     +"\n4 - Editar"
                     +"\n5 - Estatísticas"
                     +"\n8001 - Sair"));
        }
    }                 
                    
    String[] nomes = new String[100];
    String[] cnpjs = new String[100];
    String[] cidades = new String[100];
    String[] telefones = new String[100];
    String[] emails = new String[100];
    int[] quantMaxColaboradores = new int[100];
    double[] tamanhoMaxEstoques = new double[100];
    double[] orcamentMaxMensal = new double[100];
    static int atual = 0;

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
public void estatisticas(){
    //Filial com maior Estoque
  //  int tamanhoMaxEstoques[posicao] = Integer.MAX_VALUE;
    // JOptionPane.showMessageDialog(null, maiorEstoque);
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
           +"\nTelefone "+ telefones[posicao]//.substring(0,4).substring(5,8)
           +"\nEmail: "+ emails[posicao]
           +"\nQuantidade máxima de colaboradores: "+ quantMaxColaboradores[posicao]
           +"\nTamanho máximo do estoque:"+ tamanhoMaxEstoques[posicao] +" m2"
           +"\nOrçamento máximo mensal: "+ orcamentMaxMensal[posicao]+ " reais");
 
}

public void solicitarInformacao(int posicao){
    
    nomes[posicao] = JOptionPane.showInputDialog("Digite o nome da filial").trim();
    cnpjs[posicao] = JOptionPane.showInputDialog("Digite o CNPJ")
         .replace(".","").replace("/","").replace(" ","").trim().replace("-","");
    cidades[posicao] = JOptionPane.showInputDialog("Cidade aonde se encontra a Filial").trim();
    telefones[posicao] = JOptionPane.showInputDialog("Telefone da Filial").trim().replace("-","")
            .replace(" ","").replace(".","").replace("=","").replace("/","");
    emails[posicao] = JOptionPane.showInputDialog("Email da Filial").trim();
    quantMaxColaboradores[posicao] = Integer.parseInt(JOptionPane.showInputDialog
        ("Quantidade máxima de colaboradores").trim());
    tamanhoMaxEstoques[posicao] = Double.parseDouble(JOptionPane.showInputDialog
        ("Tamanho do estoque(m2)").trim().replace("m2","").replace("m3",""));
    orcamentMaxMensal[posicao] = Double.parseDouble(JOptionPane.showInputDialog
        ("Orçamento máximo mensal").trim());
    
   }
} 


