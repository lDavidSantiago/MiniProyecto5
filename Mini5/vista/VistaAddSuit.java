package Mini5.vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import Mini5.controlador.Controlador;

public class VistaAddSuit extends JFrame{
    static VistaAddSuit interfazAdd = new VistaAddSuit();
    public static JTextField nameTF;
    public static JTextField typeTF;
    public static JButton backButton;
    public static JButton addCandyButton;
    public VistaAddSuit(){
        setTitle("Trajes Fuap");
        setSize(670, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente
        setResizable(false);

        JPanel panelBackground1 = new JPanel();
        panelBackground1.setLayout(null);
        panelBackground1.setSize(670, 500);


        JPanel addSuitPanel = new JPanel();
        addSuitPanel.setLayout(null);
        addSuitPanel.setSize(570, 400);
        addSuitPanel.setBackground(new Color(255, 255, 255));
        addSuitPanel.setFont(new Font("Roboto Light", 0, 12));
        addSuitPanel.setBackground(new Color(211,211,211));
        //por ahora el add(addSuitPanel) se pone aqui para poder visualizar el proceso, luego se cambia de posicion 
        add(addSuitPanel);

        JLabel addCandyLabel = new JLabel( );
        addCandyLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        addCandyLabel.setText("ADD NEW SUIT");
        addCandyLabel.setBounds(40,10,210,40);
        addSuitPanel.add(addCandyLabel);

        JLabel suitName = new JLabel("Name");
        suitName.setFont(new Font ("Roboto Medium", 0, 14));
        suitName.setBounds(40, 80, 150, 30);
        addSuitPanel.add(suitName);

        nameTF = new JTextField();
        TextPrompt nameTF_ = new TextPrompt("Suit name",nameTF);
        nameTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        nameTF.setForeground(new java.awt.Color(153, 153, 153));
        nameTF.setBounds(40,115,250,20);
        nameTF.setBorder(null);
        addSuitPanel.add(nameTF);

        JSeparator separator1 = new JSeparator();
        separator1.setBounds(40,135,250,10);
        separator1.setForeground(new Color(206,206,206));
        addSuitPanel.add(separator1);

        JLabel suitType = new JLabel("Type");
        suitType.setFont(new Font ("Roboto Medium", 0, 14));
        suitType.setBounds(40, 170, 150, 30);
        addSuitPanel.add(suitType);

        typeTF = new JTextField();
        typeTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        typeTF.setForeground(new java.awt.Color(153, 153, 153));
        TextPrompt TypeTF_ = new TextPrompt("Suit Type",typeTF);
        typeTF.setBounds(40,205,250,20);
        typeTF.setBorder(null);
        addSuitPanel.add(typeTF);

        JSeparator separator2 = new JSeparator();
        separator2.setBounds(40,225,250,10);
        separator2.setForeground(new Color(206,206,206));
        addSuitPanel.add(separator2);

        addCandyButton = new JButton("ADD");
        addCandyButton.setForeground(Color.white);
        addCandyButton.setBackground(new Color(0,51,116));
        addCandyButton.setBounds(40, 295, 120, 30);
        addSuitPanel.add(addCandyButton);

        backButton = new JButton("BACK");
        backButton.setForeground(Color.white);
        backButton.setBackground(new Color(0,51,116));
        backButton.setBounds(200, 295, 120, 30);
        botonVolver(backButton);
        addSuitPanel.add(backButton);

        //panel sobre panel
        addSuitPanel.setVisible(true);
        panelBackground1.add(addSuitPanel);
        addSuitPanel.setBounds(135,30,400,400);
        panelBackground1.setBackground(new Color(0,51,116));
        panelBackground1.setVisible(true);
        add(panelBackground1);

    }
    public  void botonVolver(JButton boton){
        ActionListener d = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                interfazAdd.setVisible(false);
                Vista.interfaz1.setVisible(true);
            }
        };
        boton.addActionListener(d);
        
    }
    
    public void start(Controlador controlador) {
        setTitle("Trajes Fuap");
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        VistaAddSuit frame2 = new VistaAddSuit();
        frame2.setVisible(true);
    }
    public static String getCandyName() {
        return nameTF.getText();
    }
    public static String getCandyType(){
        return typeTF.getText();
    }

}

