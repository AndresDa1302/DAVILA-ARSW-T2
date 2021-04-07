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
public class IweathePersistenceException extends Exception{
        public IweathePersistenceException(String message) {
        super(message);
    }

    public IweathePersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}
