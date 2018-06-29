package questao06;

import Interface.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Crispim Paiano dos Santos
 */
public class CalculoIMC implements JFrameBaseInterface {

    private JFrame jFrame;
    private JLabel jLabelNome, jLabelPeso, jLabelAltura;
    private JTextField jTextFieldNome, jTextFieldPeso, jTextFieldAltura;
    private JButton jButtonIMC;

    public CalculoIMC() {

        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacao();
        adicionarComponentes();
        acaoCalcularIMC();

        jFrame.setVisible(true);

    }

    @Override
    public void gerarTela() {

        jFrame = new JFrame();
        jFrame.setSize(300, 300);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    @Override
    public void adicionarComponentes() {

        jFrame.add(jLabelNome);
        jFrame.add(jLabelPeso);
        jFrame.add(jLabelAltura);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldPeso);
        jFrame.add(jTextFieldAltura);
        jFrame.add(jButtonIMC);

    }

    @Override
    public void instanciarComponentes() {

        jLabelNome = new JLabel("Nome");
        jLabelPeso = new JLabel("Peso");
        jLabelAltura = new JLabel("Altura");
        jTextFieldNome = new JTextField();
        jTextFieldPeso = new JTextField();
        jTextFieldAltura = new JTextField();
        jButtonIMC = new JButton("Gerar IMC");

    }

    @Override
    public void gerarLocalizacao() {

        jLabelNome.setLocation(20, 10);
        jLabelPeso.setLocation(110, 10);
        jLabelAltura.setLocation(200, 10);
        jTextFieldNome.setLocation(20, 40);
        jTextFieldPeso.setLocation(110, 40);
        jTextFieldAltura.setLocation(200, 40);
        jButtonIMC.setLocation(100, 100);

    }

    @Override
    public void gerarDimensoes() {

        jLabelNome.setSize(75, 20);
        jLabelPeso.setSize(75, 20);
        jLabelAltura.setSize(75, 20);
        jTextFieldNome.setSize(75, 20);
        jTextFieldPeso.setSize(75, 20);
        jTextFieldAltura.setSize(75, 20);
        jButtonIMC.setSize(100, 100);

    }

    public void acaoCalcularIMC() {

        jButtonIMC.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    double peso = Double.parseDouble(jTextFieldPeso.getText());
                    double altura = Double.parseDouble(jTextFieldAltura.getText());

                    double imc = peso / (altura * altura);
                    String texto = jTextFieldNome.getText() + " : ";

                    if (imc < 10) {
                        texto += "Desnutrição Grau V";
                    } else if (imc < 13) {
                        texto += "Desnutrição Grau IV";
                    } else if (imc < 16) {
                        texto += "Desnutrição Grau III";
                    } else if (imc < 17) {
                        texto += "Desnutrição Grau II";
                    } else if (imc < 18.5) {
                        texto += "Desnutrição Grau I";
                    } else if (imc < 25) {
                        texto += "Normal";
                    } else if (imc < 30) {
                        texto += "Pré-obesidade";
                    } else if (imc < 35) {
                        texto += "Obesidade Grau I";
                    } else if (imc < 40) {
                        texto += "Obesidade Grau II";
                    } else {
                        texto += "Obesidade Grau III";
                    }

                    JOptionPane.showMessageDialog(null, texto);

                    
                    
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Digite todo os campos corretamente");
                }
            }
        });

    }

}
