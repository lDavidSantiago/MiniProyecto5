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


public class VistaDeleteSuit extends JFrame {
    static VistaDeleteSuit vistaDelete = new VistaDeleteSuit();
    public static JTextField nameDeleteTF;
    public static JButton deleteSuitButton;
    public VistaDeleteSuit(){
        setTitle("Trajes Fuap");
        setSize(670, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Usamos un diseño nulo para posicionar los componentes manualmente
        setResizable(false);

        JPanel panelBackground3 = new JPanel();
        panelBackground3.setLayout(null);
        panelBackground3.setSize(670, 459);

        JPanel deleteSuitPanel = new JPanel();
        deleteSuitPanel.setLayout(null);
        deleteSuitPanel.setSize(430, 300);

        deleteSuitPanel.setBackground(Color.white);
        //por ahora el add(deleteCandyPanel) se pone aqui para poder visualizar el proceso, luego se cambia de posicion 
        add(deleteSuitPanel);

        JLabel deleteSuitLabel = new JLabel( );
        deleteSuitLabel.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        deleteSuitLabel.setText("DELETE A SUIT");
        deleteSuitLabel.setBounds(40,10,210,40);
        deleteSuitPanel.add(deleteSuitLabel);

        JLabel suitNameDelete = new JLabel("Name");
        suitNameDelete.setFont(new Font ("Roboto Medium", 0, 14));
        suitNameDelete.setBounds(40, 80, 150, 30);
        deleteSuitPanel.add(suitNameDelete);

        nameDeleteTF = new JTextField();
        nameDeleteTF.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        nameDeleteTF.setForeground(new java.awt.Color(153, 153, 153));
        nameDeleteTF.setText("Suit´s name you want to delete");
        nameDeleteTF.setBounds(40,115,250,20);
        nameDeleteTF.setBorder(null);
        deleteSuitPanel.add(nameDeleteTF);

        JSeparator separator6 = new JSeparator();
        separator6.setBounds(40,135,250,10);
        separator6.setForeground(new Color(206,206,206));
        deleteSuitPanel.add(separator6);

        deleteSuitButton = new JButton("DELETE");
        deleteSuitButton.setForeground(Color.white);
        deleteSuitButton.setBackground(new Color(225,59,59));
        deleteSuitButton.setBounds(40, 195, 120, 30);
        deleteSuitButton.setBackground(new Color(0,51,116));
        deleteSuitPanel.add(deleteSuitButton);

        JButton backButton3 = new JButton("BACK");
        backButton3.setForeground(Color.white);
        backButton3.setBackground(new Color(225,59,59));
        backButton3.setBounds(200, 195, 120, 30);
        backButton3.setBackground(new Color(0,51,116));
        botonVolver(backButton3);
        deleteSuitPanel.add(backButton3);



        //panel sobre panel
        deleteSuitPanel.setVisible(true);
        panelBackground3.add(deleteSuitPanel);
        deleteSuitPanel.setBounds(115,80,430,300);
        deleteSuitPanel.setBackground(new Color(211,211,211));
        panelBackground3.setBackground(new Color(0,51,116));
        panelBackground3.setVisible(true);
        add(panelBackground3);

    }
    public void botonVolver(JButton boton) {
        ActionListener d = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                vistaDelete.setVisible(false);
                Vista.interfaz1.setVisible(true);
            }
        };
        boton.addActionListener(d);
    }

    public static String getCandyNameToDelete(){
        return nameDeleteTF.getText();
    }
    /*public void start(Controlador controlador) {
        controlador.setOperations(Operations.ADD);
        buttonAdd.addActionListener(controlador);
        setTitle("Tienda Dulces");
        setLocationRelativeTo(null);
    }*/
    public static void main(String[] args) {
        VistaDeleteSuit frame4 = new VistaDeleteSuit();
        frame4.setVisible(true);
    }
}
    

