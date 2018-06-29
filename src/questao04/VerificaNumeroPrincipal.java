package questao04;

import java.awt.EventQueue;

/**
 * @author Crispim Paiano dos Santos
 */

public class VerificaNumeroPrincipal {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new VerificaNumero();
            }
        });
        
    }
    
}
