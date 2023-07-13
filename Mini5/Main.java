package Mini5;

import Mini5.controlador.Controlador;
import Mini5.modelo.ModeloTrajes;
import Mini5.vista.Vista;
import Mini5.vista.VistaSuits;

public class Main {
    public static void main(String[] args){
        ModeloTrajes mod = new ModeloTrajes();
        VistaSuits view = new Vista();
        
        Controlador ctrl = new Controlador(view,mod);
        ctrl.starting();
    }
}
