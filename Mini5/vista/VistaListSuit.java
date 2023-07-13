package Mini5.vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class VistaListSuit extends JFrame {
    static VistaListSuit vista6 = new VistaListSuit();
    public static JTextArea listCandiesTextArea;
    public static JButton listCandiesButton;
    public VistaListSuit(){
        setTitle("Trajes Fuap");
        setSize(670, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente
        setResizable(false);

        JPanel panelBackground5 = new JPanel();
        panelBackground5.setLayout(null);
        panelBackground5.setSize(670, 459);

        JPanel listSuitPanel = new JPanel();
        listSuitPanel.setLayout(null);
        listSuitPanel.setSize(430, 400);
        listSuitPanel.setBackground(new Color(255, 255, 255));
        listSuitPanel.setBackground(Color.white);
        //por ahora el add(deleteCandyPanel) se pone aqui para poder visualizar el proceso, luego se cambia de posicion 
        add(listSuitPanel);

        JLabel listCandyLabel = new JLabel( );
        listCandyLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        listCandyLabel.setText("SEARCH A SUIT");
        listCandyLabel.setBounds(40,10,210,40);
        listSuitPanel.add(listCandyLabel);

        JLabel candyNameList = new JLabel("Name             Type            Material            Price");
        candyNameList.setFont(new Font ("Roboto Medium", 0, 14));
        candyNameList.setBounds(40, 80, 300, 30);
        listSuitPanel.add(candyNameList);

        

        listCandiesTextArea = new JTextArea(); 
        listCandiesTextArea.setEditable(false); 
        

        JScrollPane scroll = new JScrollPane(listCandiesTextArea);
        scroll.setBounds(40,115,300,200);
        listSuitPanel.add(scroll);

        listCandiesButton = new JButton("UPDATE");
        listCandiesButton.setForeground(Color.white);
        listCandiesButton.setBackground(new Color(0,51,116));
        listCandiesButton.setBounds(40, 350, 120, 30);
        listSuitPanel.add(listCandiesButton);

        JButton backButton5 = new JButton("BACK");
        backButton5.setForeground(Color.white);
        backButton5.setBackground(new Color(0,51,116));
        backButton5.setBounds(200, 350, 120, 30);
        botonVolver(backButton5);
        listSuitPanel.add(backButton5);

        //panel sobre panel
        listSuitPanel.setVisible(true);
        panelBackground5.add(listSuitPanel);
        listSuitPanel.setBounds(115,15,430,430);
        listSuitPanel.setBackground(new Color(211,211,211));
        panelBackground5.setBackground(new Color(0,51,116));
        panelBackground5.setVisible(true);
        add(panelBackground5);

       
    }
    public void botonVolver(JButton boton) {
        ActionListener d = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                vista6.setVisible(false);
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
        VistaListSuit frame6 = new VistaListSuit();
        frame6.setVisible(true);
    }
}
