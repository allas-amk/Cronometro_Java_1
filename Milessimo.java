/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cronometro;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allas
 */
public class Milessimo implements Runnable {

    @Override
    public void run() {
        int i = Integer.parseInt(Tela.txtMili.getText());
        for (;;) {
            Tela.txtMili.setText(i+"");
            i++;
            if(i==1000) {
                i = 0;
            }
            try {
                Thread.sleep(1);
            } catch (Exception ex) {
            }
        }
    }
    
}
