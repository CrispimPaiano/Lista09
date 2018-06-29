package questao02;

import Interface.JFrameBaseInterface;
import com.sun.org.apache.xalan.internal.lib.ExsltStrings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Crispim Paiano dos Santos
 */
public class Tabuada implements JFrameBaseInterface{

    private JFrame jFrame;
    private JTextField jTextFieldNumero;
    private JButton jButtonTabuada;
    private JLabel jLabelNumero, jLabelAreaTabuada;
    private JScrollPane jScrollPane;
    private JTextArea jTextArea;
    
    
    public Tabuada(){
            gerarTela();
            instanciarComponentes();
            gerarDimensoes();
            gerarLocalizacao();
            adicionarComponentes();
            acaoGerarTabuada();
        configurarJScrollPane();
        jFrame.setVisible(true);
    }
    
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(300, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
    
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonTabuada);
        jFrame.add(jLabelNumero);
        jFrame.add(jTextArea);
        jFrame.add(jScrollPane);
    
    }

    @Override
    public void instanciarComponentes() {
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton("Gerar Tabuada");
        jLabelNumero = new JLabel("Número", JLabel.CENTER);
        jTextArea = new JTextArea();
        jScrollPane = new JScrollPane();
    }

    @Override
    public void gerarLocalizacao() {
        
        jButtonTabuada.setLocation(45, 60);
        jLabelNumero.setLocation(95, 10);
        jScrollPane.setLocation(10, 150);
        jTextFieldNumero.setLocation(95, 30);
        
    }

    @Override
    public void gerarDimensoes() {
        
        jButtonTabuada.setSize(200, 50);
        jLabelNumero.setSize(100, 20);
        jScrollPane.setSize(280, 300);
        jTextFieldNumero.setSize(100, 20);
        
    }
    
    public void acaoGerarTabuada(){
        
        jButtonTabuada.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
           
                String texto = "";
                int numero = Integer.parseInt(jTextFieldNumero.getText());
                for (int i = 0; i <= 50; i++) {
                    texto += i +  "X"  + numero +  ": "  + (i*numero)+"\n";
                    //jLabelAreaTabuada.setText("<html> i +  X  + numero +  :  + (i*numero)<br></html>"); 
                }
                jTextArea.setText(texto);
            }
        });
        
        
        
    }
    
    private void configurarJScrollPane(){
        jScrollPane.setViewportView(jTextArea);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextArea.setLineWrap(true);
    }

    
}
