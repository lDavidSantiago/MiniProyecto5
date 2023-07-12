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

public class VistaSearchSuit extends JFrame {
    static VistaSearchSuit vista5 = new VistaSearchSuit();
    public static JTextField nameSearchTF;
    public static JButton searchSuitButton;
    public static JTextField typeTF1;
    public VistaSearchSuit(){
        setTitle("Trajes Fuap");
        setSize(670, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente
        setResizable(false);

        JPanel panelBackground4 = new JPanel();
        panelBackground4.setLayout(null);
        panelBackground4.setSize(670, 459);

        JPanel searchSuitPanel = new JPanel();
        searchSuitPanel.setLayout(null);
        searchSuitPanel.setSize(430, 300);
        searchSuitPanel.setBackground(new Color(255, 255, 255));
        searchSuitPanel.setBackground(Color.white);
        add(searchSuitPanel);

        JLabel searchSuitLabel = new JLabel( );
        searchSuitLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        searchSuitLabel.setText("SEARCH A SUIT");
        searchSuitLabel.setBounds(40,10,210,40);
        searchSuitPanel.add(searchSuitLabel);

        JLabel suitNameSearch = new JLabel("Name");
        suitNameSearch.setFont(new Font ("Roboto Medium", 0, 14));
        suitNameSearch.setBounds(40, 80, 150, 30);
        searchSuitPanel.add(suitNameSearch);

        nameSearchTF = new JTextField();
        TextPrompt nameTF_ = new TextPrompt("Suit name",nameSearchTF);
        nameSearchTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        nameSearchTF.setForeground(new java.awt.Color(153, 153, 153));
        nameSearchTF.setText("Suit's name you want to search");
        nameSearchTF.setBounds(40,115,250,20);
        nameSearchTF.setBorder(null);
        searchSuitPanel.add(nameSearchTF);

        JLabel suitType = new JLabel("Type");
        suitType.setFont(new Font ("Roboto Medium", 0, 14));
        suitType.setBounds(40, 170, 150, 30);
        searchSuitPanel.add(suitType);

        typeTF1 = new JTextField();
        typeTF1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        typeTF1.setForeground(new java.awt.Color(153, 153, 153));
        TextPrompt TypeTF_ = new TextPrompt("Suit Type",typeTF1);
        typeTF1.setBounds(40,205,250,20);
        typeTF1.setBorder(null);
        searchSuitPanel.add(typeTF1);

        JSeparator separator2 = new JSeparator();
        separator2.setBounds(40,225,250,10);
        separator2.setForeground(new Color(206,206,206));
        searchSuitPanel.add(separator2);

        JSeparator separator7 = new JSeparator();
        separator7.setBounds(40,135,250,10);
        separator7.setForeground(new Color(206,206,206));
        searchSuitPanel.add(separator7);

        searchSuitButton = new JButton("SEARCH");
        //Que la accion del boton saque un joptionMessage
        searchSuitButton.setForeground(Color.white);
        searchSuitButton.setBackground(new Color(0,51,116));
        searchSuitButton.setBounds(40, 295, 120, 30);
        searchSuitPanel.add(searchSuitButton);

        JButton backButton4 = new JButton("BACK");
        backButton4.setForeground(Color.white);
        backButton4.setBackground(new Color(0,51,116));
        backButton4.setBounds(200, 295, 120, 30);
        botonVolver(backButton4);
        searchSuitPanel.add(backButton4);

        //panel sobre panel
        searchSuitPanel.setVisible(true);
        panelBackground4.add(searchSuitPanel);
        searchSuitPanel.setBounds(135,30,430,400);
        searchSuitPanel.setBackground(new Color(211,211,211));
        panelBackground4.setBackground(new Color(0,51,116));
        panelBackground4.setVisible(true);
        add(panelBackground4);

    }
    public void botonVolver(JButton boton) {
        ActionListener d = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                vista5.setVisible(false);
                Vista.interfaz1.setVisible(true);
            }
        };
        boton.addActionListener(d);
    }
    /*public void start(Controlador controlador) {
        controlador.setOperations(Operations.ADD);
        buttonAdd.addActionListener(controlador);
        setTitle("Tienda Dulces");
        setLocationRelativeTo(null);
    }*/
    public static void main(String[] args) {
        VistaSearchSuit frame5 = new VistaSearchSuit();
        frame5.setVisible(true);
    }
}