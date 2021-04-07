/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.persistence;

/**
 *
 * @author Andres Davila
 */
public class IweatherException extends Exception{

    public IweatherException(String message) {
        super(message);
    }

    public IweatherException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
