package questao05;

import java.awt.EventQueue;

/**
 * @author Crispim Paiano dos Santos
 */
public class CalculadoraPrincipal {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Calculadora();
            }
        });
        
    }
    
}
