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
                    
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed aliquam urna in nisl viverra, nec porta lacus gravida. Phasellus a risus leo. Nulla sed metus nec felis imperdiet tincidunt. Sed imperdiet odio id pulvinar faucibus. Quisque commodo velit a metus elementum vulputate. Phasellus id convallis magna. In vel tempus nisl, id maximus nibh. Aenean eu risus laoreet elit vestibulum ultrices quis quis libero. Duis fermentum at tellus id tincidunt. Praesent ornare nec tellus dictum finibus. Vivamus lacinia, ipsum eget convallis faucibus, libero eros lacinia massa, sodales bibendum ex nulla vel tortor. Nam sed nibh eget ligula sollicitudin luctus. Suspendisse nibh arcu, condimentum eget est malesuada, ultrices cursus ligula. Ut neque enim, ornare in eros convallis, pulvinar efficitur elit.",
            "SISTEMA DO CORREIOS", JOptionPane.WARNING_MESSAGE,
                new ImageIcon(
                    About.class.getResource
                    ("/imagens/contact.png")
                )
            
            );
        }
    }

