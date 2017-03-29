/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classrobot;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ANAFLAVIA
 */
public class Robo {

    private Robot rb;

    public Robo() throws AWTException {
        this.rb = new Robot();
    }

    public void clicaFirefox(int tempo) {
        //Botão Iniciar//rb.mouseMove(20, 750);  // Move o mouse até a posição x,y. (x Horizontal) - (y Vertical)
        //Clica no ícone do Firefox

        rb.mouseMove(260, 750);
        //Cada ícone da parte de baixo, soma-se 60. 1º = 20; 2º = 80......
        rb.delay(500);
        rb.mousePress(InputEvent.BUTTON1_MASK);  //Clicando com Botão Esquerdo .
        rb.delay(500);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);  // Solta o botão passado como parâmetro.
        rb.delay(tempo);
    }

    public void clicaIconeImacros() {
        //Clica no ícone do iMacros
        rb.mouseMove(990, 50);
        rb.delay(500);
        rb.mousePress(InputEvent.BUTTON1_MASK);  //Clicando com Botão Esquerdo .
        rb.delay(500);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);  // Solta o botão passado como parâmetro.

    }

    public void macrosAutomatizadoWEBSTA() {
        //Clica na Opção do Macros desejado
        rb.delay(1000);
        rb.mouseMove(90, 200);
        rb.delay(500);
        rb.mousePress(InputEvent.BUTTON1_MASK);  //Clicando com Botão Esquerdo .
        rb.delay(100);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);  // Solta o botão passado como parâmetro.
        rb.mousePress(InputEvent.BUTTON1_MASK);  //Clicando com Botão Esquerdo .
        rb.delay(100);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);  // Solta o botão passado como parâmetro.
        rb.delay(700);
        fechaIconeImacros();
        rb.delay(50000);
    }

    public void macrosCodeMaster() {
        //Clica na Opção do Macros desejado
        rb.delay(1000);
        rb.mouseMove(90, 220);
        rb.delay(500);
        rb.mousePress(InputEvent.BUTTON1_MASK);  //Clicando com Botão Esquerdo .
        rb.delay(100);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);  // Solta o botão passado como parâmetro.
        rb.mousePress(InputEvent.BUTTON1_MASK);  //Clicando com Botão Esquerdo .
        rb.delay(100);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);  // Solta o botão passado como parâmetro. 
        rb.delay(700);
        fechaIconeImacros();
        rb.delay(50000);
    }

    public void macrosInstagram() {
        //Clica na Opção do Macros desejado
        rb.delay(1000);
        rb.mouseMove(90, 260);
        rb.delay(500);
        rb.mousePress(InputEvent.BUTTON1_MASK);  //Clicando com Botão Esquerdo .
        rb.delay(100);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);  // Solta o botão passado como parâmetro.
        rb.mousePress(InputEvent.BUTTON1_MASK);  //Clicando com Botão Esquerdo .
        rb.delay(100);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);  // Solta o botão passado como parâmetro.
        rb.delay(700);
        fechaIconeImacros();
        rb.delay(50000); //Depois medir
    }

    public void macrosLikeLoveWEBSTA() {
        //Clica na Opção do Macros desejado
        rb.delay(1000);
        rb.mouseMove(90, 280);
        rb.delay(500);
        rb.mousePress(InputEvent.BUTTON1_MASK);  //Clicando com Botão Esquerdo .
        rb.delay(100);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);  // Solta o botão passado como parâmetro.
        rb.mousePress(InputEvent.BUTTON1_MASK);  //Clicando com Botão Esquerdo .
        rb.delay(100);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);  // Solta o botão passado como parâmetro.
        rb.delay(700);
        fechaIconeImacros();
        rb.delay(50000);
    }

    public void macrosTimiline() {
        //Clica na Opção do Macros desejado
        rb.delay(1000);
        rb.mouseMove(90, 300);
        rb.delay(500);
        rb.mousePress(InputEvent.BUTTON1_MASK);  //Clicando com Botão Esquerdo .
        rb.delay(100);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);  // Solta o botão passado como parâmetro.
        rb.mousePress(InputEvent.BUTTON1_MASK);  //Clicando com Botão Esquerdo .
        rb.delay(100);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);  // Solta o botão passado como parâmetro.       
        rb.delay(700);
        fechaIconeImacros();
        rb.delay(50000); //Depois medir o tempo

    }

    public void fechaIconeImacros() {
        //Fecha o ícone do Macros
        rb.mouseMove(990, 50);
        rb.delay(500);
        rb.mousePress(InputEvent.BUTTON1_MASK);  //Clicando com Botão Esquerdo .
        rb.delay(500);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);  // Solta o botão passado como parâmetro.
    }

    public void fechaNavegador() {
        rb.mouseMove(1330, 10);
        rb.delay(500);
        rb.mousePress(InputEvent.BUTTON1_MASK);  //Clicando com Botão Esquerdo .
        rb.delay(500);
        rb.mouseRelease(InputEvent.BUTTON1_MASK);  // Solta o botão passado como parâmetro.

    }

    public void executaAutomatizado() {
        try {
            prepararAmbiente();
            macrosAutomatizadoWEBSTA();
            Thread.sleep(50000); //Depois medir o tempo de cada um
            macrosInstagram();
            Thread.sleep(50000); //Depois medir o tempo de cada um
            macrosLikeLoveWEBSTA();
            Thread.sleep(50000); //Depois medir o tempo de cada um
            macrosTimiline();
            Thread.sleep(50000); //Depois medir o tempo de cada um
            encerraAmbiente();
        } catch (InterruptedException ex) {
            Logger.getLogger(Robo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void prepararAmbiente() {
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI("www.google.com"));
            Thread.sleep(3000); //Espera 10s
            clicaIconeImacros();
            Thread.sleep(2000); //Espera 2s

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (URISyntaxException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (InterruptedException ex) {
            Logger.getLogger(Robo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void iniciaNavegador() {
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI("www.google.com"));
            Thread.sleep(10000); //Espera 10s

        } catch (IOException | URISyntaxException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (InterruptedException ex) {
            Logger.getLogger(Robo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void encerraAmbiente() {
        fechaIconeImacros();
        fechaNavegador();
    }

    public boolean verificarConexaoInternet() {
        boolean verifica = false;
        try {

            InetAddress address = InetAddress.getByName("www.instagram.com");

            verifica = address.isReachable(2000);

        } catch (IOException ex) {
            Logger.getLogger(Robo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return verifica;
    }
}
