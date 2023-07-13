package Mini5.vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import Mini5.controlador.Controlador;

public class VistaAddSuit extends JFrame{
    static VistaAddSuit interfazAdd = new VistaAddSuit();
    public static JTextField pricelTF;
    public static JTextField countryTF;
    public static JTextField nameTF;
    public static JTextField materialTF;
    public static JButton backButton;
    public static JButton addSuitButton;
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

        JLabel addSuitLabel = new JLabel( );
        addSuitLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        addSuitLabel.setText("ADD NEW SUIT");
        addSuitLabel.setBounds(40,10,210,40);
        addSuitPanel.add(addSuitLabel);

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

        JLabel countryType = new JLabel("Country");
        countryType.setFont(new Font ("Roboto Medium", 0, 14));
        countryType.setBounds(40, 140, 150, 30);
        addSuitPanel.add(countryType);

        countryTF = new JTextField();
        countryTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        countryTF.setForeground(new java.awt.Color(153, 153, 153));
        TextPrompt TypeTF_ = new TextPrompt("Suit Country",countryTF);
        countryTF.setBounds(40,170,250,20);
        countryTF.setBorder(null);
        addSuitPanel.add(countryTF);

        JSeparator separator2 = new JSeparator();
        separator2.setBounds(40,190,250,10);
        separator2.setForeground(new Color(206,206,206));
        addSuitPanel.add(separator2);

        JLabel suitMaterial = new JLabel("Material");
        suitMaterial.setFont(new Font ("Roboto Medium", 0, 14));
        suitMaterial.setBounds(40, 200, 150, 30);
        addSuitPanel.add(suitMaterial);

        materialTF = new JTextField();
        TextPrompt materialTF_ = new TextPrompt("Suit's material",materialTF);
        materialTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        materialTF.setForeground(new java.awt.Color(153, 153, 153));
        materialTF.setBounds(40,230,250,20);
        materialTF.setBorder(null);
        addSuitPanel.add(materialTF);

        JSeparator separator3 = new JSeparator();
        separator3.setBounds(40,250,250,10);
        separator3.setForeground(new Color(206,206,206));
        addSuitPanel.add(separator3);

        JLabel suitPrice = new JLabel("Price");
        suitPrice.setFont(new Font ("Roboto Medium", 0, 14));
        suitPrice.setBounds(40, 260, 150, 30);
        addSuitPanel.add(suitPrice);

        pricelTF = new JTextField();
        TextPrompt pricelTF_ = new TextPrompt("Suit's price",pricelTF);
        pricelTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        pricelTF.setForeground(new java.awt.Color(153, 153, 153));
        pricelTF.setBounds(40,290,250,20);
        pricelTF.setBorder(null);
        addSuitPanel.add(pricelTF);

        JSeparator separator4 = new JSeparator();
        separator4.setBounds(40,310,250,10);
        separator4.setForeground(new Color(206,206,206));
        addSuitPanel.add(separator4);

        addSuitButton = new JButton("ADD");
        addSuitButton.setForeground(Color.white);
        addSuitButton.setBackground(new Color(0,51,116));
        addSuitButton.setBounds(40, 330, 120, 30);
        addSuitPanel.add(addSuitButton);

        backButton = new JButton("BACK");
        backButton.setForeground(Color.white);
        backButton.setBackground(new Color(0,51,116));
        backButton.setBounds(200, 330, 120, 30);
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
    public static String getSuitName() {
        return nameTF.getText();
    }
    public static String getSuitCountry(){
        return countryTF.getText();
    }
    public static String getSuitMaterial(){
        return materialTF.getText();
    }
    public static  int getSuitPrice(){
        return Integer.parseInt(pricelTF.getText());
    }
    
}

