/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DDL_Queries;
import Controller.Database_Queries;

/**
 *
 * @author saich
 */
public abstract class Trips {
   
     Database_Queries setDatabase_Queries;
    

   
    public abstract void show_Trips();

   
    public void setDatabase() {
        setDatabase_Queries.DDL();
    }
    
}
