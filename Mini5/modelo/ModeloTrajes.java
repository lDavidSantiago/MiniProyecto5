package Mini5.modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Mini5.controlador.ManejaArchivos;
public class ModeloTrajes{

    private String suitName;
    private String countrySuitName;
    private String materialSuit;
    private int suitPrice;
    public static ArrayList<ModeloTrajes> models = new ArrayList<ModeloTrajes>();
    ManejaArchivos manejador = new ManejaArchivos();

    
    public String getSuitName() {
        return suitName;
    }
    public void setSuitName(String suitName) {
        this.suitName = suitName;
    }
    public String getCountrySuitName() {
        return countrySuitName;
    }
    public static ArrayList<ModeloTrajes> getModels() {
        return models;
    }
    public static void setModels(ArrayList<ModeloTrajes> models) {
        ModeloTrajes.models = models;
    }
    public void setCountrySuitName(String countrySuitName) {
        this.countrySuitName = countrySuitName;
    }
    public String getMaterialSuit() {
        return materialSuit;
    }
    public void setMaterialSuit(String materialSuit) {
        this.materialSuit = materialSuit;
    }
    public int getSuitPrice() {
        return suitPrice;
    }
    public void setSuitPrice(int suitPrice) {
        this.suitPrice = suitPrice;
    }
    
    public ModeloTrajes(String suitName, String countrySuitName, String materialSuit, int suitPrice) {
        this.suitName = suitName;
        this.countrySuitName = countrySuitName;
        this.materialSuit = materialSuit;
        this.suitPrice = suitPrice;
    }

    public ModeloTrajes() {
    }
    public void addNewSuit(String suitName, String countrySuitName, String materialSuit, int suitPrice) {
        int i = 0;
        StringBuilder result = new StringBuilder();  
        ModeloTrajes traje = new ModeloTrajes(suitName, countrySuitName, materialSuit, suitPrice);
        models.add(traje);
        System.out.println(traje.getSuitName());
        result.append("Nombre: ").append(models.get(i).getSuitName()).append(", Pais de Fabricacion: ").append(models.get(i).getCountrySuitName()).append(", Material: ").append(models.get(i).getMaterialSuit()).append(", Precio: ").append(models.get(i).getSuitPrice()).append("\n");
        manejador.escribirArchivos(result.toString(), i);
        manejador.leerArchivos();
        i++;
    }

 

    public void removeSuit(String suitName){
        int i = 0;

        ModeloTrajes trajeremover = null;
        for(ModeloTrajes traje : models){
            if(traje.getSuitName().equals(suitName)){
                trajeremover = traje;
                break;
            }
            i++;
        
        }
        if(trajeremover != null){
            models.remove(trajeremover);
            System.out.println("traje eliminado: " + trajeremover.getSuitName());
            manejador.deleteArchivos(i);
            manejador.leerArchivos();
            
        }
        else{
            System.out.println("NO SE ENCONTRO EL TRAJE POR EL NOMBRE");
        }
    }

    public String updateSuit(String suitName,String newSuitName, String newCountrySuitName, String newMaterialSuit, int newSuitPrice){
        int i = 0;
        StringBuilder result = new StringBuilder();
        
        
        ModeloTrajes suitToUpdate = null;
        for(ModeloTrajes traje : models){
            
            if(traje.getSuitName().equals(suitName)){
                suitToUpdate = traje;

                break;
            }
            i++;
        }
    
        if(suitToUpdate != null){
            suitToUpdate.setSuitName(newSuitName);
            suitToUpdate.setCountrySuitName(newCountrySuitName);
            suitToUpdate.setMaterialSuit(newMaterialSuit);
            suitToUpdate.setSuitPrice(newSuitPrice);
            result.append("Nombre: ").append(models.get(i).getSuitName()).append(", Pais de Fabricacion: ").append(models.get(i).getCountrySuitName()).append(", Material: ").append(models.get(i).getMaterialSuit()).append(", Precio: ").append(models.get(i).getSuitPrice()).append("\n");
            manejador.updateArchivos(result.toString(), i);
            manejador.leerArchivos();
            return " " ;
        }
        
        else {
            return "No se encontro ningun traje";
        }
        
    }

    public String listSuits(){
        StringBuilder result = new StringBuilder();  
        for(int i = 0; i <models.size(); i++){
            result.append("Nombre: ").append(models.get(i).getSuitName()).append(", Pais de Fabricacion: ").append(models.get(i).getMaterialSuit()).append(", Material: ").append(models.get(i).getMaterialSuit()).append(", Precio: ").append(models.get(i).getSuitPrice()).append("\n");

        }
        return result.toString();
    }

    public String searchSuit(String suitName, String suitCountry){
        ModeloTrajes suitFinded = null;
       int i = 0;
       for(ModeloTrajes traje : models){
            if(traje.getSuitName().equals(suitName)&& traje.getCountrySuitName().equals(suitCountry)){
                suitFinded = traje;
                break;}
        i++;
        }
        if(suitFinded != null){
            JOptionPane.showMessageDialog(null,"Traje encontrado: " + " Nombre: " + suitFinded.getSuitName() + ", Pais: " + suitFinded.getCountrySuitName() + ", Material: " + suitFinded.getMaterialSuit() + ", Precio: " + suitFinded.getSuitPrice());
            return " ";
        }
        else{
           return "no encontre xd";
        }

    }
    public void addToBuy(){

    }
}