package questao01;

import java.awt.EventQueue;

public class nomeCompletoPrincipal {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new nomeCompleto();
            }
        });
        
    }
    
}
