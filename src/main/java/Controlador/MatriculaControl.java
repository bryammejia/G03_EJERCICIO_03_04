
package Controlador;

import Modelo.Matricula;
import Servicio.MatriculaServicio;
import java.util.List;

/**
 *
 * @author USER
 */
public class MatriculaControl {

    private MatriculaServicio matriculaServicio = new MatriculaServicio();
    
    public Matricula crearMatricula(String [] args){
        Matricula matricula = new Matricula(Integer.valueOf(args[0]), Integer.valueOf(args [1]), Integer.valueOf(args[2]), args[3]);
        this.matriculaServicio.crear(matricula);
        return matricula;
        
    }
    
    public Matricula buscarMatricula(String arg){
        return this.matriculaServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Matricula eliminar(String arg){
        return this.matriculaServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Matricula modificar(String [] args){
            Matricula matriculaNuevo = new Matricula(Integer.valueOf(args[0]),Integer.valueOf(args[1]), Integer.valueOf(args[2]), args[3]);
            this.matriculaServicio.modificar(Integer.valueOf(args[0]), matriculaNuevo);
           return matriculaNuevo;
}
    
    public List<Matricula> listar(){
        return this.matriculaServicio.listar();
                
    }
}
