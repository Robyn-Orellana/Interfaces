/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import dominio.Pelicula;
import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEx;
import java.util.List;

/**
 *
 * @author robyn
 */
public interface IAccesoDatos{
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    public String Buscar(String nombreArchivo, String Buscar) throws EscrituraDatosEx;
    public void crear (String nombreArchivo)throws AccesoDatosEx;
    public void borrar(String nombreArchivo) throws AccesoDatosEx; 
    
}
