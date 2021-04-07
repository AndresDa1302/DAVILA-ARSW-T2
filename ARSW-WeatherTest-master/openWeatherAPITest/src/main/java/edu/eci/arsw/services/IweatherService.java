/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.services;

import edu.eci.arsw.model.Iweather;

/**
 *
 * @author Andres Davila
 */
public interface IweatherService {
    public Iweather buscarPorCiudad(String city);
}
