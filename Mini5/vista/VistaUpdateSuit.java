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
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Mini5.controlador.Controlador;

public class VistaUpdateSuit extends JFrame {
    static VistaUpdateSuit interfazUpdate = new VistaUpdateSuit();
    public static JTextField oldNameTF;
    public static JTextField newNameTF;
    public static JTextField newCountryTf;
    public static JTextField newMaterealTF;
    public static JTextField newpricelTF;

    public static JButton suitUpdateButton;
    public static JLabel suitOldName;
    public VistaUpdateSuit(){
        setTitle("Trajes Fuap");
        setSize(670, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente
        setResizable(false);

        JPanel panelBackground2 = new JPanel();
        panelBackground2.setLayout(null);
        panelBackground2.setSize(670, 459);

        JPanel updateSuitPanel = new JPanel();
        updateSuitPanel.setLayout(null);
        updateSuitPanel.setSize(430, 400);
        updateSuitPanel.setBackground(new Color(255, 255, 255));
        updateSuitPanel.setBackground(Color.white);
        //por ahora el add(deleteCandyPanel) se pone aqui para poder visualizar el proceso, luego se cambia de posicion 
        add(updateSuitPanel);

        JLabel updateSuitLabel = new JLabel( );
        updateSuitLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        updateSuitLabel.setText("UPDATE SUIT");
        updateSuitLabel.setBounds(40,10,210,40);
        updateSuitPanel.add(updateSuitLabel);

        suitOldName = new JLabel("Name");
        suitOldName.setFont(new Font ("Roboto Medium", 0, 14));
        suitOldName.setBounds(40, 60, 150, 30);
        updateSuitPanel.add(suitOldName);

        oldNameTF = new JTextField();
        oldNameTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        oldNameTF.setForeground(new java.awt.Color(153, 153, 153));
        oldNameTF.setText("Suit´s old name");
        oldNameTF.setBounds(40,95,250,20);
        oldNameTF.setBorder(null);
        updateSuitPanel.add(oldNameTF);

        JSeparator separator3 = new JSeparator();
        separator3.setBounds(40,115,250,10);
        separator3.setForeground(new Color(206,206,206));
        updateSuitPanel.add(separator3);

        JLabel suitNewName = new JLabel("New name");
        suitNewName.setFont(new Font ("Roboto Medium", 0, 14));
        suitNewName.setBounds(40, 125, 150, 30);
        updateSuitPanel.add(suitNewName);

        newNameTF = new JTextField();
        newNameTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        newNameTF.setForeground(new java.awt.Color(153, 153, 153));
        newNameTF.setText("Suit's new name");
        newNameTF.setBounds(40,160,250,20);
        newNameTF.setBorder(null);
        updateSuitPanel.add(newNameTF);

        JSeparator separator4 = new JSeparator();
        separator4.setBounds(40,180,250,10);
        separator4.setForeground(new Color(206,206,206));
        updateSuitPanel.add(separator4);

        ////////////////////////////////////

        JLabel suitNewCountry = new JLabel("New Country");
        suitNewCountry.setFont(new Font ("Roboto Medium", 0, 14));
        suitNewCountry.setBounds(40, 190, 150, 30);
        updateSuitPanel.add(suitNewCountry);

        newCountryTf = new JTextField("AAAAAAAAAAAAAAAA");
        newCountryTf.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        newCountryTf.setForeground(new java.awt.Color(153, 153, 153));
        newCountryTf.setBounds(40,225,250,20);
        newCountryTf.setBorder(null);
        updateSuitPanel.add(newCountryTf);

        JSeparator separator5 = new JSeparator();
        separator5.setBounds(40,245,250,10);
        separator5.setForeground(new Color(206,206,206));
        updateSuitPanel.add(separator5);
        
        JLabel suitNewMaterial = new JLabel("New Material");
        suitNewMaterial.setFont(new Font ("Roboto Medium", 0, 14));
        suitNewMaterial.setBounds(40, 255, 150, 30);
        updateSuitPanel.add(suitNewMaterial);

        newMaterealTF = new JTextField();
        TextPrompt materialTF_ = new TextPrompt("Suit's new material",newMaterealTF);
        newMaterealTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        newMaterealTF.setForeground(new java.awt.Color(153, 153, 153));
        newMaterealTF.setBounds(40,290,250,20);
        newMaterealTF.setBorder(null);
        updateSuitPanel.add(newMaterealTF);

        JSeparator separator6= new JSeparator();
        separator6.setBounds(40,310,250,10);
        separator6.setForeground(new Color(206,206,206));
        updateSuitPanel.add(separator6);

        ///

        JLabel suitPrice = new JLabel("New Price");
        suitPrice.setFont(new Font ("Roboto Medium", 0, 14));
        suitPrice.setBounds(40, 320, 150, 30);
        updateSuitPanel.add(suitPrice);

        newpricelTF = new JTextField("precio");
        TextPrompt newpricelTF_ = new TextPrompt("Suit's new price",newpricelTF);
        newpricelTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        newpricelTF.setForeground(new java.awt.Color(153, 153, 153));
        newpricelTF.setBounds(40,355,250,20);
        newpricelTF.setBorder(null);
        updateSuitPanel.add(newpricelTF);

        JSeparator separator7 = new JSeparator();
        separator7.setBounds(40,375,250,10);
        separator7.setForeground(new Color(206,206,206));
        updateSuitPanel.add(separator7);

        

        suitUpdateButton = new JButton("UPDATE");
        suitUpdateButton.setForeground(Color.white);
        suitUpdateButton.setBackground(new Color(0,51,116));
        suitUpdateButton.setBounds(40, 385, 120, 30);
        updateSuitPanel.add(suitUpdateButton);

        JButton backButton3 = new JButton("BACK");
        backButton3.setForeground(Color.white);
        backButton3.setBackground(new Color(0,51,116));
        backButton3.setBounds(200, 385, 120, 30);
        botonVolver(backButton3);
        updateSuitPanel.add(backButton3); 

        updateSuitPanel.setVisible(true);
        panelBackground2.add(updateSuitPanel);
        updateSuitPanel.setBounds(100,15,430,430);
        updateSuitPanel.setBackground(new Color(211,211,211));
        panelBackground2.setBackground(new Color(0,51,116));
        panelBackground2.setVisible(true);
        add(panelBackground2);

    }
    public void botonVolver(JButton boton) {
        ActionListener d = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                interfazUpdate.setVisible(false);
                Vista.interfaz1.setVisible(true);
            }
        };
        boton.addActionListener(d);
    }
    public static String getOldCSuitName(){
        return oldNameTF.getText();
    }
    public static String getNewSuitName(){
        return newNameTF.getText();
    }
    
    public static String getNewCountrySuit(){
        return newCountryTf.getText();
    }
    public static String getNewMaterial(){
        return newMaterealTF.getText();
    }
    public static int getNewSuitPrice(){
        return Integer.parseInt(newpricelTF.getText());
    }


    /*public void start(Controlador controlador) {
        controlador.setOperations(Operations.ADD);
        buttonAdd.addActionListener(controlador);
        setTitle("Tienda Dulces");
        setLocationRelativeTo(null);
    }*/
    public static void main(String[] args) {
        VistaUpdateSuit frame3 = new VistaUpdateSuit();
        frame3.setVisible(true);
    }
}
