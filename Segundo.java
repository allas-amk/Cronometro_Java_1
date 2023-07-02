/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cronometro;

/**
 *
 * @author Allas
 */
public class Segundo implements Runnable {

    @Override
    public void run() {
        int i = Integer.parseInt(Tela.txtSeg.getText());
        for (;;) {
            Tela.txtSeg.setText(i+"");
            i++;
            if(i==59) {
                i = 0;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
}
