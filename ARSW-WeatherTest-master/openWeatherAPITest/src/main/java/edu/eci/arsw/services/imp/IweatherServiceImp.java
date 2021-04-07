/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.services.imp;

import edu.eci.arsw.model.Iweather;
import edu.eci.arsw.services.IweatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Davila
 */
@Service
public class IweatherServiceImp implements IweatherService{
    

    @Override
    public Iweather buscarPorCiudad(String city) {
        return null;
        
        
        
    }
    
}
