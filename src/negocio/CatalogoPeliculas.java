/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

/**
 *
 * @author robyn
 */
public interface CatalogoPeliculas{
    public void agregarPeliculas(String nombrePelicula, String nombreArchivo);
    public void listarPeliculas(String nombreArchivo);
    public void buscarPeliculas(String nombreArchivo, String buscar);
    public void iniciarArchivo(String nombreArchivo);
    
}
