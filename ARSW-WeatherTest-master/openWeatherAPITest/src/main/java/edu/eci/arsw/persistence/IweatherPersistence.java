/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.persistence;

import edu.eci.arsw.model.Iweather;

/**
 *
 * @author Andres Davila
 */
public interface IweatherPersistence {
    /**
     * 
     * @param city nombre de la ciudad
     * @return retorna iweather
     * @throws IweatherException si no existe el objeto iweather
     */
    public Iweather buscarPorCiudad(String city) throws IweatherException;
}
