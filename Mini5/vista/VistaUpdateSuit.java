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
    static VistaUpdateSuit vista3 = new VistaUpdateSuit();
    public static JTextField oldNameTF;
    public static JTextField newNameTF;
    public static JTextField newTypeTF;
    public static JButton suitCandyButton;
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
        suitOldName.setBounds(40, 80, 150, 30);
        updateSuitPanel.add(suitOldName);

        oldNameTF = new JTextField();
        oldNameTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        oldNameTF.setForeground(new java.awt.Color(153, 153, 153));
        oldNameTF.setText("Suit´s old name");
        oldNameTF.setBounds(40,115,250,20);
        oldNameTF.setBorder(null);
        updateSuitPanel.add(oldNameTF);

        JSeparator separator3 = new JSeparator();
        separator3.setBounds(40,135,250,10);
        separator3.setForeground(new Color(206,206,206));
        updateSuitPanel.add(separator3);

        JLabel suitNewName = new JLabel("New name");
        suitNewName.setFont(new Font ("Roboto Medium", 0, 14));
        suitNewName.setBounds(40, 175, 150, 30);
        updateSuitPanel.add(suitNewName);

        newNameTF = new JTextField();
        newNameTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        newNameTF.setForeground(new java.awt.Color(153, 153, 153));
        newNameTF.setText("Suit's new name");
        newNameTF.setBounds(40,210,250,20);
        newNameTF.setBorder(null);
        updateSuitPanel.add(newNameTF);

        JSeparator separator4 = new JSeparator();
        separator4.setBounds(40,230,250,10);
        separator4.setForeground(new Color(206,206,206));
        updateSuitPanel.add(separator4);

        ////////////////////////////////////

        JLabel suitNewType = new JLabel("New Type");
        suitNewType.setFont(new Font ("Roboto Medium", 0, 14));
        suitNewType.setBounds(40, 265, 150, 30);
        updateSuitPanel.add(suitNewType);

        newTypeTF = new JTextField();
        newTypeTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        newTypeTF.setForeground(new java.awt.Color(153, 153, 153));
        newTypeTF.setText("Suit's new type");
        newTypeTF.setBounds(40,300,250,20);
        newTypeTF.setBorder(null);
        updateSuitPanel.add(newTypeTF);

        JSeparator separator5 = new JSeparator();
        separator5.setBounds(40,320,250,10);
        separator5.setForeground(new Color(206,206,206));
        updateSuitPanel.add(separator5);
        

        suitCandyButton = new JButton("UPDATE");
        suitCandyButton.setForeground(Color.white);
        suitCandyButton.setBackground(new Color(0,51,116));
        suitCandyButton.setBounds(40, 355, 120, 30);
        updateSuitPanel.add(suitCandyButton);

        JButton backButton3 = new JButton("BACK");
        backButton3.setForeground(Color.white);
        backButton3.setBackground(new Color(0,51,116));
        backButton3.setBounds(200, 355, 120, 30);
        botonVolver(backButton3);
        updateSuitPanel.add(backButton3); 

        updateSuitPanel.setVisible(true);
        panelBackground2.add(updateSuitPanel);
        updateSuitPanel.setBounds(115,30,430,400);
        updateSuitPanel.setBackground(new Color(211,211,211));
        panelBackground2.setBackground(new Color(0,51,116));
        panelBackground2.setVisible(true);
        add(panelBackground2);

    }
    public void botonVolver(JButton boton) {
        ActionListener d = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                vista3.setVisible(false);
                Vista.interfaz1.setVisible(true);
            }
        };
        boton.addActionListener(d);
    }
    public static String getNewCandyName(){
        return newNameTF.getText();
    }
    public static String getOldCandyName(){
        return oldNameTF.getText();
    }
    public static String getNewCandyType(){
        return newTypeTF.getText();
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
