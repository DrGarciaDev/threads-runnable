/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsrunnable;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis_
 */
public class ThreadsRunnable implements Runnable {
    private long ms         = 0;
    @Override
    public void run() {
        try {
            ms = (long)((Math.random() * 5 + 1) * 1000);
            System.out.println("MS " + ms);
            
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadsRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Proceso " + Thread.currentThread().getName() + " Finalizado en " + ms);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
