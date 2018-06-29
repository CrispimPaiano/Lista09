package questao05;

import Interface.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Crispim Paiano dos Santos
 */

public class Calculadora implements JFrameBaseInterface{

    private JFrame jFrame;
    private JLabel jLabelNumero01, jLabelNumero02, jLabelResultado;
    private JTextField jTextFieldNumero01, jTextFieldNumero02;
    private JTextArea JTextAreaResultado;
    private JScrollPane jScrollPaneResultado;
    private JButton jButtonSomar, jButtonSubtrair, jButtonMultiplicar, jButtonDividir;
    private String texto = "";   
    
    public Calculadora(){
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacao();
        adicionarComponentes();
        configurarJScrollPane();
        acaoCalculadora();
        jFrame.setVisible(true);
    }
    
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(250, 300);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {

        jFrame.add(jLabelNumero01);
        jFrame.add(jLabelNumero02);
        jFrame.add(jLabelResultado);
        jFrame.add(jTextFieldNumero01);
        jFrame.add(jTextFieldNumero02);
        jFrame.add(JTextAreaResultado);
        jFrame.add(jScrollPaneResultado);
        jFrame.add(jButtonSomar);
        jFrame.add(jButtonSubtrair);
        jFrame.add(jButtonMultiplicar);
        jFrame.add(jButtonDividir);
        JTextAreaResultado.setEditable(false);
        
    }

    @Override
    public void instanciarComponentes() {
        
        jLabelNumero01 = new JLabel("Número 01");
        jLabelNumero02 = new JLabel("Número 02");
        jLabelResultado = new JLabel("Resultado");
        jTextFieldNumero01 = new JTextField();
        jTextFieldNumero02 = new JTextField();
        JTextAreaResultado = new JTextArea();
        jScrollPaneResultado = new JScrollPane();
        jButtonSomar = new JButton("+");
        jButtonSubtrair = new JButton("-");
        jButtonMultiplicar = new JButton("*");
        jButtonDividir = new JButton("/");
        
    }

    @Override
    public void gerarLocalizacao() {
        //jFrame.setSize(250, 300);
        jLabelNumero01.setLocation(20,10);
        jLabelNumero02.setLocation(145,10);
        jLabelResultado.setLocation(80,80);
        jTextFieldNumero01.setLocation(20,30);
        jTextFieldNumero02.setLocation(145,30);
        jScrollPaneResultado.setLocation(70,100);
        jButtonSomar.setLocation(20,55);
        jButtonSubtrair.setLocation(70,55);
        jButtonMultiplicar.setLocation(120,55);
        jButtonDividir.setLocation(170,55);
                
    }

    @Override
    public void gerarDimensoes() {
        
        
        jLabelNumero01.setSize(75,20);
        jLabelNumero02.setSize(75,20);
        jLabelResultado.setSize(75,20);
        jTextFieldNumero01.setSize(50,20);
        jTextFieldNumero02.setSize(50,20);
        jScrollPaneResultado.setSize(100,100);
        jButtonSomar.setSize(50,25);
        jButtonSubtrair.setSize(50,25);
        jButtonMultiplicar.setSize(50,25);
        jButtonDividir.setSize(50,25);
        
    }
    
    private void configurarJScrollPane(){
        jScrollPaneResultado.setViewportView(JTextAreaResultado);
        jScrollPaneResultado.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneResultado.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        JTextAreaResultado.setLineWrap(true);
    }
    
    public void acaoCalculadora(){
        
        jButtonSomar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1 = Double.parseDouble(jTextFieldNumero01.getText());
                double numero2 = Double.parseDouble(jTextFieldNumero02.getText());
                texto +=numero1+" + "+numero2+":"+ String.valueOf(numero1+numero2)+"\n";
                JTextAreaResultado.setText(texto);
            }
        });
        
        jButtonSubtrair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1 = Double.parseDouble(jTextFieldNumero01.getText());
                double numero2 = Double.parseDouble(jTextFieldNumero02.getText());
                texto +=numero1+" - "+numero2+":"+ String.valueOf(numero1-numero2)+"\n";
                JTextAreaResultado.setText(texto);
            }
        });
        
        jButtonMultiplicar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1 = Double.parseDouble(jTextFieldNumero01.getText());
                double numero2 = Double.parseDouble(jTextFieldNumero02.getText());
                texto +=numero1+" * "+numero2+":"+ String.valueOf(numero1*numero2)+"\n";
                JTextAreaResultado.setText(texto);
            }
        });
        
        jButtonDividir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1 = Double.parseDouble(jTextFieldNumero01.getText());
                double numero2 = Double.parseDouble(jTextFieldNumero02.getText());
                texto +=numero1+"/"+numero2+":"+ String.valueOf(numero1/numero2)+"\n";
                JTextAreaResultado.setText(texto);
            }
        });
        
    }
    
    
    
}
