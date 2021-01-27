package TechSupport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author tsior
 */
public class TechSupportBean implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String email;
    
    private String logiciel;
    
    private String os;
    
    private String probleme;
    
    private String prenom;
    
    private String nom;
    
    private String telephone;
    
    private String sampleProperty;
    
    private final PropertyChangeSupport propertySupport;
    
    public TechSupportBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        String oldValue = this.email;
        this.email = email;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, this.email);
    }
    
    public String getLogiciel() {
        return logiciel;
    }
    
    public void setLogiciel(String logiciel) {
        String oldValue = this.logiciel;
        this.logiciel = logiciel;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, this.logiciel);
    }
    
    public String getSystemeExploitation() {
        return this.os;
    }
    
    public void setSystemeExploitation(String systemeExploitation) {
        String oldValue = this.os;
        this.os = systemeExploitation;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, this.os);
    }
    
    public String getDescription() {
        return this.probleme;
    }
    
    public void setDescription(String description) {
        String oldValue = this.probleme;
        this.probleme = description;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, this.probleme);
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        String oldValue = this.prenom;
        this.prenom = prenom;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, this.prenom);
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        String oldValue = this.nom;
        this.nom = nom;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, this.nom);
    }
    
    public String getTelephone() {
        return telephone;
    }
    
    public void setTelephone(String telephone) {
        String oldValue = this.telephone;
        this.telephone = telephone;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, this.telephone);
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
