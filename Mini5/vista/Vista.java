package Mini5.vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import Mini5.controlador.Controlador;

public class Vista extends JFrame implements VistaSuits {
 public static JTextField jTextField1;
    public static JButton botonFrames;
    public static int opcionNumerito;
    public static Vista interfaz1 = new Vista();
    
    public Vista(){
        setTitle("Trajes Fuap");
        setSize(670, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); 
        setResizable(false);

        JPanel panelBackground = new JPanel();
        panelBackground.setLayout(null);
        panelBackground.setSize(670, 535);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        panelPrincipal.setSize(570, 400);
        panelPrincipal.setBackground(new Color(211,211,211));
        
        JLabel label1 = new JLabel("TRAJES FUAP");
        label1.setFont(new Font ("Roboto Medium", 0, 24));
        label1.setBounds(40, 10, 210, 40);
        panelPrincipal.add(label1);

        JLabel label2 = new JLabel("1) Add suits");
        label2.setFont(new Font ("Roboto Medium", 0, 14));
        label2.setBounds(40, 80, 150, 30);
        panelPrincipal.add(label2);

        JLabel label3 = new JLabel("2) Update suits ");
        label3.setFont(new Font ("Roboto Medium", 0, 14));
        label3.setBounds(40, 115, 150, 30);
        panelPrincipal.add(label3);
 
        JLabel label4 = new JLabel("3) Delete suits");
        label4.setFont(new Font ("Roboto Medium", 0, 14));
        label4.setBounds(40, 150, 150, 30);
        panelPrincipal.add(label4);

        JLabel label5 = new JLabel("4) Search by name");
        label5.setFont(new Font ("Roboto Medium", 0, 14));
        label5.setBounds(40, 185, 150, 30);
        panelPrincipal.add(label5);

        JLabel label6 = new JLabel("5) List suits");
        label6.setFont(new Font ("Roboto Medium", 0, 14));
        label6.setBounds(40, 220, 150, 30);
        panelPrincipal.add(label6);

        JLabel label7 = new JLabel("6) Buy suit");
        label7.setFont(new Font ("Roboto Medium", 0, 14));
        label7.setBounds(40, 255, 150, 30);
        panelPrincipal.add(label7);

       
        jTextField1 = new JTextField();
        TextPrompt holderMain = new TextPrompt("Ingrese una opcion",jTextField1);
        jTextField1.setFont(new Font("Roboto Light", 0, 12));
        jTextField1.setForeground(new Color(153, 153, 153));
        jTextField1.setBounds(40,290,120,30);
        jTextField1.setBorder(null);
        panelPrincipal.add(jTextField1);

        JSeparator separator1 = new JSeparator();
        separator1.setBounds(40,320,120,10);
        separator1.setForeground(new Color(206,206,206));
        panelPrincipal.add(separator1);

        botonFrames = new JButton("OK");
        botonFrames.setForeground(Color.white);
        botonFrames.setBackground(new Color(0,51,116));
        botonFrames.setBounds(180, 290, 120, 30);
        botonAceptar(botonFrames,panelPrincipal,jTextField1);
        
        //PANEL ENCIMA DE OTRO PANEL
        panelPrincipal.setVisible(true);
        panelBackground.add(panelPrincipal);
        panelPrincipal.setBounds(135,47,400,400);
        panelBackground.setBackground(new Color(0,51,116));
        panelBackground.setVisible(true);
        add(panelBackground);

    }

    public static void botonAceptar(JButton boton,JPanel panel,JTextField cf){
        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                opcionNumerito=Integer.parseInt(cf.getText());
                seleccionMenuOpciones(opcionNumerito);
                cf.setText("");
            }
        };
        boton.addActionListener(al);
        panel.add(boton);
        
    }
    public static void seleccionMenuOpciones(int opcion){
        switch (opcion){
            case 1:
                Vista.interfaz1.setVisible(false);
                VistaAddSuit.interfazAdd.setVisible(true);
                break;
            case 2:
                Vista.interfaz1.setVisible(false);
                VistaUpdateSuit.interfazUpdate.setVisible(true);
                break;
            case 3:
                Vista.interfaz1.setVisible(false);
                VistaDeleteSuit.vistaDelete.setVisible(true);
                break;
            case 4:
                Vista.interfaz1.setVisible(false);
                VistaSearchSuit.vista5.setVisible(true);
                break;
            case 5:
                Vista.interfaz1.setVisible(false);
                VistaListSuit.vista6.setVisible(true);
                break;
            case 6:
                VistaBuySuit.addCombo();
                VistaBuySuit.vistaBuy.setVisible(true);
                break;

            default:
                JOptionPane.showMessageDialog(null,"error, ingrese una opcion valida ","ERROR", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    public void inicio(JFrame view) {//trabajo con vista1 que es estatico 
        view.setVisible(false);
        interfaz1.setVisible(true);

    }
    public static void main(String[] args) {
        Vista frame = new Vista();
        frame.setVisible(true);
    }

    @Override
    public void start(Controlador controlador) {
        VistaAddSuit.addSuitButton.addActionListener(controlador);
        VistaDeleteSuit.deleteSuitButton.addActionListener(controlador);
        VistaListSuit.listSuitButton.addActionListener(controlador);
        VistaUpdateSuit.suitUpdateButton.addActionListener(controlador);
        VistaSearchSuit.searchSuitButton.addActionListener(controlador);
        setLocationRelativeTo(null);
        interfaz1.setVisible(true);
    }

    
    public String getSuitName() {
        return VistaAddSuit.getSuitName();
    }

    
    public String getSuitCountry() {
        return VistaAddSuit.getSuitCountry();
    }

  
    public String getSuitMaterial() {
        return VistaAddSuit.getSuitMaterial();
    }

   
    public int getSuitPrice() {
        return VistaAddSuit.getSuitPrice();
    }

    @Override
    public String getCandyNameToDelete() {
        return VistaDeleteSuit.getCandyNameToDelete();
    }

    @Override
    public String searchSuitName() {
       return VistaSearchSuit.getSuitName();
    }
    public String searchSuitCountry(){
        return VistaSearchSuit.getSuitCountry();
    }

    @Override
    public String oldSuitName() {
        return VistaUpdateSuit.getOldCSuitName();
    }

    @Override
    public String newSuitName() {
        return VistaUpdateSuit.getNewSuitName();
    }

    @Override
    public String newSuitCountry() {
        return VistaUpdateSuit.getNewSuitCountry();
    }

    @Override
    public String newSuitMateral() {
        return VistaUpdateSuit.getNewMaterial();
    }

    @Override
    public int newSuitPrice() {
        return VistaUpdateSuit.getNewSuitPrice();
    }

    public void setList(String lista){
        VistaListSuit.listSuitsTextArea.setText(lista);
    }
    
}