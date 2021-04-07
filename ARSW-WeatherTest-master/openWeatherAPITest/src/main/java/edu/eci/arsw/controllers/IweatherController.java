/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.controllers;

import edu.eci.arsw.services.imp.IweatherServiceImp;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Andres Davila
 */
@RestController
@CrossOrigin(origins = "*")
public class IweatherController {
    
    @Autowired
    private IweatherServiceImp iweatherService;
    
    @RequestMapping(method = RequestMethod.GET,path = {"iweather/{city}"})
    public ResponseEntity<?> buscarPorCiudad(@PathVariable String city){
        try{
            return new ResponseEntity<>(iweatherService.buscarPorCiudad(city),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(IweatherController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("No se encontró la ciudad :"+city,HttpStatus.NOT_FOUND);
    
            }
    }
}
    

