package questao07;

import java.awt.EventQueue;

/**
 *
 * @author Crispim Paiano dos Santos
 */
public class SalarioPrincipal {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Salario();
            }
        });
        
    }
    
}
