/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classrobot;

import java.awt.AWTException;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

/**
 *
 * @author ANAFLAVIA
 */
public class ClassRobot {

    /**
     * @param args the command line arguments
     * @throws java.awt.AWTException
     */
    public static void main(String args[]) throws AWTException, Exception {
        
        Robo r = new Robo();
        r.iniciaNavegador();
        
        int opcao;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Instagram: O que você deseja fazer agora: " + "\n 1 - Curtir sua Timiline \n 2 - Ganhar Seguidores \n 3 - Curtir a hashtag Love \n 4 - Curtir a hashtag Love (Mais demorada) \n 5 - Automatizar \n 6 - Encerrar operações"));
            switch (opcao) {
                case 1:
                    if (r.verificarConexaoInternet() == false) {
                        JOptionPane.showMessageDialog(null, "Sem conexão no momento!");
                    } else {
                        r.prepararAmbiente();
                        r.macrosTimiline();
                    }
                    break;
                case 2:
                    if (r.verificarConexaoInternet() == false) {
                        JOptionPane.showMessageDialog(null, "Sem conexão no momento!");
                    } else {
                        r.prepararAmbiente();
                        r.macrosInstagram();
                    }
                    break;
                case 3:
                    if (r.verificarConexaoInternet() == false) {
                        JOptionPane.showMessageDialog(null, "Sem conexão no momento!");
                    } else {
                        r.prepararAmbiente();
                        r.macrosLikeLoveWEBSTA();
                    }
                    break;
                
                case 4:
                    if (r.verificarConexaoInternet() == false) {
                        JOptionPane.showMessageDialog(null, "Sem conexão no momento!");
                    } else {
                        r.prepararAmbiente();
                        r.macrosAutomatizadoWEBSTA();
                        break;
                    }
                case 5:
                    if (r.verificarConexaoInternet() == false) {
                        JOptionPane.showMessageDialog(null, "Sem conexão no momento!");
                    } else {
                        r.prepararAmbiente();
                        r.executaAutomatizado();
                    }
                    break;
                case 6:
                    System.exit(0);
                
            }
        } while (opcao != 7);
        
    }
    
}
