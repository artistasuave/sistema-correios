import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class About {
    
    public void menuAbout() {

            JOptionPane.showMessageDialog(null,
                    
                    "Sistema desenvolvido para os Correios,"
                            + "\nvoltado ao controle interno de colaboradores, "
                            + "\nfornecedores, produtos/serviços fornecidos e filiais.",
            "SISTEMA DO CORREIOS", JOptionPane.WARNING_MESSAGE,
                new ImageIcon(
                    About.class.getResource
                    ("/imagens/contact.png")
                )
            
            );
        }
    }

