package questao01;

import Interface.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.JFrame.DISPOSE_ON_CLOSE;

public class nomeCompleto implements JFrameBaseInterface{

    private JFrame jFrame;
    private JLabel jLabelNome, jLabelSobrenome;
    private JTextField jTextFieldNome, jTextFieldSobrenome, jTextFieldConcatenar;
    private JButton jButtonConcatenar; 
    
    public nomeCompleto(){
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacao();
        adicionarComponentes();
        acaoBotaoConcatenar();
        jFrame.setVisible(true);
    }
    
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 300);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jLabelSobrenome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldSobrenome);
        jFrame.add(jButtonConcatenar);
        jFrame.add(jTextFieldConcatenar);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelSobrenome = new JLabel("Sobrenome");
        jTextFieldNome = new JTextField();
        jTextFieldSobrenome = new JTextField();
        jButtonConcatenar = new JButton("Concatenar");
        jTextFieldConcatenar = new JTextField();
    }

    @Override
    public void gerarLocalizacao() {
        
        jLabelNome.setLocation(10, 10);
        jLabelSobrenome.setLocation(280, 10);
        jTextFieldNome.setLocation(10, 50);
        jTextFieldSobrenome.setLocation(280, 50);
        jButtonConcatenar.setLocation(200, 150);
        jTextFieldConcatenar.setLocation(150, 100);
        
    }

    @Override
    public void gerarDimensoes() {
       
        jLabelNome.setSize(100, 20);
        jLabelSobrenome.setSize(100, 20);
        jTextFieldNome.setSize(200, 20);
        jTextFieldSobrenome.setSize(200, 20);
        jButtonConcatenar.setSize(100, 50);
        jTextFieldConcatenar.setSize(200, 20);
        
    }
    
    public void acaoBotaoConcatenar(){
        
        jButtonConcatenar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = "Olá "+jTextFieldNome.getText()+" "+jTextFieldSobrenome.getText();
                jTextFieldConcatenar.setText(texto);
            }
        });
        
    }
    
}
