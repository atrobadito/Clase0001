package pe.edu.sise.miprimeraapliacacion.pe.edu.sise.miprimeraapliacioncion.domain;

/**
 * Created by cisco on 13/10/2017.
 */

public class Usuario {
    private Long id;
    private String Nombre;
    private String email;

    public Usuario() {
    }

    private String teledono ;
    private Integer sexo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeledono() {
        return teledono;
    }

    public void setTeledono(String teledono) {
        this.teledono = teledono;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }
}
