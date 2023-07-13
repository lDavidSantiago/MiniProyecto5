package Mini5.controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Mini5.modelo.ModeloTrajes;
import Mini5.vista.VistaAddSuit;
import Mini5.vista.VistaBuySuit;
import Mini5.vista.VistaDeleteSuit;
import Mini5.vista.VistaListSuit;
import Mini5.vista.VistaSearchSuit;
import Mini5.vista.VistaSuits;
import Mini5.vista.VistaUpdateSuit;



public class Controlador implements ActionListener {
    private VistaSuits view;
    private ModeloTrajes model;
    public Controlador(VistaSuits view, ModeloTrajes model) {
        this.view = view;
        this.model = model;
    }
    public void starting(){
        view.start(this);
    }
    
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == VistaAddSuit.addSuitButton) {
        model.setSuitName(view.getSuitName());  
        model.setMaterialSuit(view.getSuitMaterial());
        model.setSuitPrice(view.getSuitPrice());
        model.setCountrySuitName(view.getSuitCountry());
        model.addNewSuit(model.getSuitName(),model.getCountrySuitName(), model.getMaterialSuit(),model.getSuitPrice());
        System.out.println(model.listSuits());
    }
    if (e.getSource() == VistaDeleteSuit.deleteSuitButton) {
        model.setSuitName(view.getCandyNameToDelete());
        model.removeSuit(model.getSuitName());
        System.out.println(model.listSuits());
        }
    if(e.getSource() == VistaSearchSuit.searchSuitButton) {       
        model.searchSuit(view.searchSuitName(),view.searchSuitCountry());
        System.out.println("as");
    }
    if(e.getSource() == VistaUpdateSuit.suitUpdateButton) {
        model.updateSuit(view.oldSuitName(), view.newSuitName(), view.newSuitCountry(), view.newSuitMateral(), view.getSuitPrice());
        System.out.println(view.newSuitCountry());
        System.out.println(view.newSuitPrice());
        System.out.println("awasd");
    }
    if(e.getSource() == VistaListSuit.listSuitButton) {
        view.setList(model.listSuits());
        }   
    }
}