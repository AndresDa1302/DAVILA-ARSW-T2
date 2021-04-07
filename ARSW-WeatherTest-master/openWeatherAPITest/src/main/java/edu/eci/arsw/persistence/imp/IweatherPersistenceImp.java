/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.persistence.imp;

import edu.eci.arsw.model.Iweather;
import edu.eci.arsw.persistence.IweatherException;
import edu.eci.arsw.persistence.IweatherPersistence;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Andres Davila
 */
public class IweatherPersistenceImp implements IweatherPersistence{
    
    private final ConcurrentHashMap<String,Iweather> iweather=new ConcurrentHashMap<>();
    
    
    
    
    
    @Override
    public Iweather buscarPorCiudad(String city) throws IweatherException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String getweatherCity(String city)
    {
        return iweather.get(city).toString();
    }
    
}
