package Mini5.modelo;

import java.util.ArrayList;

public class ModeloTrajes{

    private String suitName;
    private String countrySuitName;
    private String materialSuit;
    private float suitPrice;
    private static ArrayList<ModeloTrajes> models = new ArrayList<ModeloTrajes>();
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
    public float getSuitPrice() {
        return suitPrice;
    }
    public void setSuitPrice(float suitPrice) {
        this.suitPrice = suitPrice;
    }
    
    public ModeloTrajes(String suitName, String countrySuitName, String materialSuit, float suitPrice) {
        this.suitName = suitName;
        this.countrySuitName = countrySuitName;
        this.materialSuit = materialSuit;
        this.suitPrice = suitPrice;
    }

    public void addNewSuit(String suitName, String countrySuitName, String materialSuit, float suitPrice) {
        ModeloTrajes traje = new ModeloTrajes(suitName, countrySuitName, materialSuit, suitPrice);
        models.add(traje);
        System.out.println(traje.getSuitName());
    }

    public void removeSuit(String suitName){
        ModeloTrajes trajeremover = null;
        for(ModeloTrajes traje : models){
            if(traje.getSuitName().equals(suitName)){
                trajeremover = traje;
                break;
            }
        }
        if(trajeremover != null){
        models.remove(trajeremover);
        System.out.println("traje eliminado: " + trajeremover.getSuitName());
        }
        else{
            System.out.println("NO SE ENCONTRO EL TRAJE POR EL NOMBRE");
        }
    }

    public String updateSuit(String suitName,String newSuitName, String newCountrySuitName, String newMaterialSuit, float newSuitPrice){
        ModeloTrajes suitToUpdate = null;
        for(ModeloTrajes traje : models){
            if(traje.getSuitName().equals(suitName)){
                suitToUpdate = traje;
                break;
            }
        }
    
        if(suitToUpdate != null){
            suitToUpdate.setSuitName(newSuitName);
            suitToUpdate.setCountrySuitName(newCountrySuitName);
            suitToUpdate.setMaterialSuit(newMaterialSuit);
            suitToUpdate.setSuitPrice(newSuitPrice);
            return "Traje actualizado: " + suitName + " ahora es" + suitToUpdate.getSuitName() + " " + suitToUpdate.getCountrySuitName() + " " + suitToUpdate.getMaterialSuit() + " " + suitToUpdate.getSuitPrice();
        }
        
        else {
            return "No se encontro ningun traje";
        }
        
    }

    public String listSuits(){
        StringBuilder result = new StringBuilder();  
        for(int i = 0; i <models.size(); i++){
            result.append("Nombre: ").append(models.get(i).getSuitName()).append(", Pais de Fabricacion: ").append(models.get(i).getMaterialSuit()).append(", Material: ").append(models.get(i).getMaterialSuit()).append(", Precio: ").append(models.get(i).getSuitPrice());
        }
        return result.toString();
    }

    

}