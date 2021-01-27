/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechSupport;

import java.beans.*;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author tsior
 */
public class ListePersonne implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    public Hashtable liste = new Hashtable ();
    
    public boolean isUserAlreadyRegistered (String user)
    {
        Enumeration enu = liste.elements ();
        
        while (enu.hasMoreElements())
        {
            Personne personne = (Personne) enu.nextElement();
            if (personne.user.equals(user))
                return true;
        }
        
        return false;
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
