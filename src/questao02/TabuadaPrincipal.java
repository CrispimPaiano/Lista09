package questao02;

import java.awt.EventQueue;

/**
 * @author Alunos
 */
public class TabuadaPrincipal {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Tabuada();
            }
        });
        
    }
    
}
