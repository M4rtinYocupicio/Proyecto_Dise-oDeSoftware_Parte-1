/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Entities.Profesor;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author marti
 */
public interface IProfesorBO 
{
    boolean agregar(Profesor profesor);
    List<Profesor> consultarTodos();
    Profesor consultar(ObjectId idProyecto);
}
