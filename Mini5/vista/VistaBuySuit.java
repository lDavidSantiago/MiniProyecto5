package Mini5.vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Mini5.modelo.ModeloTrajes;
public class VistaBuySuit extends JFrame {
    static VistaBuySuit vistaBuy = new VistaBuySuit();
    public static JTextArea buySuitTextArea;
    public static JButton buySuitButton;
    public static JPanel buySuitPanel;
    public static JComboBox <String> combo1;
    public VistaBuySuit(){
        setTitle("Trajes Fuap");
        setSize(670, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente
        setResizable(false);

        JPanel panelBackground6 = new JPanel();
        panelBackground6.setLayout(null);
        panelBackground6.setSize(670, 459);

        buySuitPanel = new JPanel();
        buySuitPanel.setLayout(null);
        buySuitPanel.setSize(430, 400);
        buySuitPanel.setBackground(new Color(255, 255, 255));
        buySuitPanel.setBackground(Color.white);
        //por ahora el add(deleteCandyPanel) se pone aqui para poder visualizar el proceso, luego se cambia de posicion 
        add(buySuitPanel);

        JLabel buySuitLabel = new JLabel( );
        buySuitLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        buySuitLabel.setText("BUY A SUIT");
        buySuitLabel.setBounds(40,10,210,40);
        buySuitPanel.add(buySuitLabel);

        JLabel suitNameBuy = new JLabel("Suit");
        suitNameBuy.setFont(new Font ("Roboto Medium", 0, 14));
        suitNameBuy.setBounds(40, 80, 150, 30);
        buySuitPanel.add(suitNameBuy);


        //CAJA OPCIONES MULTIPLES
        JComboBox <String> combo1 = new JComboBox <String>();
        combo1.setBounds(40,115,150,30);
        buySuitPanel.add(combo1);
        addCombo();

        ////

        buySuitTextArea = new JTextArea(); 
        buySuitTextArea.setEditable(false); 
        
        JLabel buySuitLabelTA = new JLabel("Bought");
        buySuitLabelTA.setFont(new Font ("Roboto Medium", 0, 14));
        buySuitLabelTA.setBounds(200, 80, 150, 30);
        buySuitPanel.add(buySuitLabelTA);

        JScrollPane scroll = new JScrollPane(buySuitTextArea);
        scroll.setBounds(200,115,150,200);
        buySuitPanel.add(scroll);
        

        buySuitButton = new JButton("BUY");
        buySuitButton.setForeground(Color.white);
        buySuitButton.setBackground(new Color(0,51,116));
        buySuitButton.setBounds(40, 350, 120, 30);
        buySuitPanel.add(buySuitButton);

        JButton backButton5 = new JButton("BACK");
        backButton5.setForeground(Color.white);
        backButton5.setBackground(new Color(0,51,116));
        backButton5.setBounds(200, 350, 120, 30);
        botonVolver(backButton5);
        buySuitPanel.add(backButton5);

        //panel sobre panel
        buySuitPanel.setVisible(true);
        panelBackground6.add(buySuitPanel);
        buySuitPanel.setBounds(115,15,430,430);
        buySuitPanel.setBackground(new Color(211,211,211));
        panelBackground6.setBackground(new Color(0,51,116));
        panelBackground6.setVisible(true);
        add(panelBackground6);

       
    }
    public void botonVolver(JButton boton) {
        ActionListener d = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                vistaBuy.setVisible(false);
                Vista.interfaz1.setVisible(true);
            }
        };
        boton.addActionListener(d);
    }

    public static void addCombo(){
        for(ModeloTrajes traje : ModeloTrajes.models){
            combo1.addItem(traje.getSuitName());
        }
    }



    /*public void start(Controlador controlador) {
        controlador.setOperations(Operations.ADD);
        buttonAdd.addActionListener(controlador);
        setTitle("Tienda Dulces");
        setLocationRelativeTo(null);
    }*/
    public static void main(String[] args) {
        VistaBuySuit frame7 = new VistaBuySuit();
        frame7.setVisible(true);
    }
}
