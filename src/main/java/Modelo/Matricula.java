
package Modelo;

/**
 *
 * @author USER
 */
public class Matricula {
    
    private int Codigo;
    private int yearMatricula;
    private int fechaExpira;
    private String placa;
    private String estaMatriculado;

    public Matricula(int Codigo, int yearMatricula, int fechaExpira, String placa) {
        this.Codigo = Codigo;
        this.yearMatricula = yearMatricula;
        this.fechaExpira = fechaExpira;
        this.placa = placa;
    }

    public Matricula() {
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getYearMatricula() {
        return yearMatricula;
    }

    public void setYearMatricula(int yearMatricula) {
        this.yearMatricula = yearMatricula;
    }

    public int getFechaExpira() {
        return fechaExpira;
    }

    public void setFechaExpira(int fechaExpira) {
        this.fechaExpira = fechaExpira;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEstaMatriculado() {
        return estaMatriculado;
    }

    public void setEstaMatriculado(String estaMatriculado) {
        this.estaMatriculado = estaMatriculado;
    }

    @Override
    public String toString() {
        return "Matricula{" + "Codigo=" + Codigo + ", yearMatricula=" + yearMatricula + ", fechaExpira=" + fechaExpira + ", placa=" + placa + ", estaMatriculado=" + estaMatriculado + '}';
    }

    
}
