package Mini5.vista;

import Mini5.controlador.Controlador;

public interface VistaSuits {
    public void start(Controlador controlador);
    public String getName();
    
    public String getSuitName();
    
    public String getSuitCountry();
    
    public String getSuitMaterial();
    
    public int getSuitPrice();
    
    public String getCandyNameToDelete();
    
    public String searchSuitName();
    
    public String searchSuitCountry();

    public String oldSuitName();

    public String newSuitName();

    public String newSuitCountry();
    
    public String newSuitMateral();

    public int newSuitPrice();
}
