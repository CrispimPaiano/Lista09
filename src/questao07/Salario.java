package questao07;

import Interface.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Crispim Paiano dos Santos
 */
public class Salario implements JFrameBaseInterface {

    private JFrame jFrame;
    private JLabel jLabelNome, jLabelQuantidadeHoras, jLabelValorINSS, jLabelContribuicaoSindical, jLabelValorPasse, jLabelAuxilioAlmoco, jLabelAuxilioEducacao, jLabelAuxilioSaude, jLabelResultado, jLabelCargo;
    private JTextField jTextFieldNome, jTextFieldQuantidadeHoras, jTextFieldValorINSS, jTextFieldContribuicaoSindical, jTextFieldValorPasse, jTextFieldAuxilioAlmoco, jTextFieldAuxilioEducacao, jTextFieldAuxilioSaude;
    private JTextArea jTextAreaResultado;
    private JComboBox jComboBoxCargo;
    private JButton jButtonProcessar;

    public Salario() {

        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacao();
        adicionarComponentes();
        acaoCalcularSalario();

        jFrame.setVisible(true);

    }

    @Override
    public void gerarTela() {

        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    @Override
    public void adicionarComponentes() {

        jFrame.add(jLabelNome);
        jFrame.add(jLabelQuantidadeHoras);
        jFrame.add(jLabelValorINSS);
        jFrame.add(jLabelContribuicaoSindical);
        jFrame.add(jLabelValorPasse);
        jFrame.add(jLabelAuxilioAlmoco);
        jFrame.add(jLabelAuxilioEducacao);
        jFrame.add(jLabelAuxilioSaude);
        jFrame.add(jLabelResultado);
        jFrame.add(jLabelCargo);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldQuantidadeHoras);
        jFrame.add(jTextFieldValorINSS);
        jFrame.add(jTextFieldContribuicaoSindical);
        jFrame.add(jTextFieldValorPasse);
        jFrame.add(jTextFieldAuxilioAlmoco);
        jFrame.add(jTextFieldAuxilioEducacao);
        jFrame.add(jTextFieldAuxilioSaude);
        jFrame.add(jTextAreaResultado);
        jFrame.add(jComboBoxCargo);
        jFrame.add(jButtonProcessar);

    }

    @Override
    public void instanciarComponentes() {

        jLabelNome = new JLabel("Nome");
        jLabelQuantidadeHoras = new JLabel("Quantidade de horas");
        jLabelValorINSS = new JLabel("Valor de INSS");
        jLabelContribuicaoSindical = new JLabel("Contribuição Sindical");
        jLabelValorPasse = new JLabel("Valor de Passe");
        jLabelAuxilioAlmoco = new JLabel("Auxílio Almoço");
        jLabelAuxilioEducacao = new JLabel("Auxílio Educação");
        jLabelAuxilioSaude = new JLabel("Auxílio Saúde");
        jLabelResultado = new JLabel("Resultado");
        jLabelCargo = new JLabel("Cargo");
        jTextFieldNome = new JTextField();
        jTextFieldQuantidadeHoras = new JTextField();
        jTextFieldValorINSS = new JTextField();
        jTextFieldContribuicaoSindical = new JTextField();
        jTextFieldValorPasse = new JTextField();
        jTextFieldAuxilioAlmoco = new JTextField();
        jTextFieldAuxilioEducacao = new JTextField();
        jTextFieldAuxilioSaude = new JTextField();
        jTextAreaResultado = new JTextArea();
        jComboBoxCargo = new JComboBox();

        DefaultComboBoxModel modelo = new DefaultComboBoxModel(
                new Object[]{
                    "Programador Júnior", "Programador Pleno", "Programador Sênior"
                }
        );
        jComboBoxCargo.setModel(modelo);
        jComboBoxCargo.setSelectedIndex(-1);

        jButtonProcessar = new JButton("Processar");

    }

    @Override
    public void gerarLocalizacao() {

        jLabelNome.setLocation(10, 10);
        jLabelQuantidadeHoras.setLocation(10, 50);
        jLabelValorINSS.setLocation(10, 90);
        jLabelContribuicaoSindical.setLocation(10, 130);
        jLabelValorPasse.setLocation(10, 170);
        jLabelAuxilioAlmoco.setLocation(200, 10);
        jLabelAuxilioEducacao.setLocation(200, 50);
        jLabelAuxilioSaude.setLocation(200, 90);
        jLabelResultado.setLocation(200, 130);
        jLabelCargo.setLocation(200, 170);
        jTextFieldNome.setLocation(10, 30);
        jTextFieldQuantidadeHoras.setLocation(10, 70);
        jTextFieldValorINSS.setLocation(10, 110);
        jTextFieldContribuicaoSindical.setLocation(10, 150);
        jTextFieldValorPasse.setLocation(10, 190);
        jTextFieldAuxilioAlmoco.setLocation(200, 30);
        jTextFieldAuxilioEducacao.setLocation(200, 70);
        jTextFieldAuxilioSaude.setLocation(200, 110);
        jTextAreaResultado.setLocation(150, 200);
        jComboBoxCargo.setLocation(200, 190);
        jButtonProcessar.setLocation(150, 400);

    }

    @Override
    public void gerarDimensoes() {

        jLabelNome.setSize(100,20);
        jLabelQuantidadeHoras.setSize(100,20);
        jLabelValorINSS.setSize(100,20);
        jLabelContribuicaoSindical.setSize(100,20);
        jLabelValorPasse.setSize(100,20);
        jLabelAuxilioAlmoco.setSize(100,20);
        jLabelAuxilioEducacao.setSize(100,20);
        jLabelAuxilioSaude.setSize(100,20);
        jLabelResultado.setSize(100,20);
        jLabelCargo.setSize(100,20);

        jTextFieldNome.setSize(75,25);
        jTextFieldQuantidadeHoras.setSize(75,25);
        jTextFieldValorINSS.setSize(75,25);
        jTextFieldContribuicaoSindical.setSize(75,25);
        jTextFieldValorPasse.setSize(75,25);
        jTextFieldAuxilioAlmoco.setSize(75,25);
        jTextFieldAuxilioEducacao.setSize(75,25);
        jTextFieldAuxilioSaude.setSize(75,25);

        jTextAreaResultado.setSize(200, 200);
        jComboBoxCargo.setSize(75,25);
        jButtonProcessar.setSize(75,25);

    }

    public void acaoCalcularSalario() {

        jButtonProcessar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double valorINSS = Double.parseDouble(jTextFieldValorINSS.getText());
                    double contribuicaoSindical = Double.parseDouble(jLabelContribuicaoSindical.getText());

                    double descontos = valorINSS + contribuicaoSindical;
                    
                    double valorPasse = Double.parseDouble(jTextFieldValorPasse.getText());
                    double auxilioAlmoço = Double.parseDouble(jTextFieldAuxilioAlmoco.getText());
                    double auxilioEducacao = Double.parseDouble(jTextFieldAuxilioEducacao.getText());
                    double auxilioSaude = Double.parseDouble(jTextFieldAuxilioSaude.getText());

                    double auxilios = valorPasse + auxilioAlmoço + auxilioEducacao + auxilioSaude;
                    
                    int horasTrabalhadas = Integer.parseInt(jTextFieldQuantidadeHoras.getText());

                    double salario = horasTrabalhadas;

                    if (jComboBoxCargo.getSelectedIndex() == 1) {
                        salario += salario * 10;
                    } else if (jComboBoxCargo.getSelectedIndex() == 2) {
                        salario += salario * 12;
                    } else if (jComboBoxCargo.getSelectedIndex() == 3) {
                        salario += salario * 18;
                    }

                    double salarioLiquido = salario+auxilios-descontos;
                    String texto = "SALÁRIO BRUTO:"+salario+" DESCONTOS:"+descontos+" AUXÍLIOS: "+auxilios+" SALÁRIO LÍQUIDO:"+salarioLiquido;
                    
                    jTextAreaResultado.setText(texto);
                    
                    }catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Digite todo os campos corretamente");
                }
                }
            }
        );

    }

}
