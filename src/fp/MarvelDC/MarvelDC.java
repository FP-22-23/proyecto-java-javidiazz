package fp.MarvelDC;

import fp.utiles.Checkers;

public class MarvelDC {
	
	
	private String titulo;
	private Integer id;
	private Double puntuacionImdb;
	private Integer puntuacionMetacritic;
	private Integer duracion;
	private Integer anyoestreno;
	private Integer presupuesto;
	private Integer recaudacionPrimeraSemana;
	private Empresa empresa;
	
	
	public MarvelDC(String titulo, Integer id, Double puntuacionImdb, Integer puntuacionMetacritic, Integer duracion,
			Integer anyoestreno, Integer presupuesto, Integer recaudacionPrimeraSemana, Empresa empresa) {
		Checkers.checkNoNull(titulo,id,puntuacionImdb,puntuacionMetacritic,duracion,anyoestreno,presupuesto,recaudacionPrimeraSemana);
		Checkers.check("La puntuación de Metacritic está por encima de 100", puntuacionMetacritic < 100);
		this.titulo = titulo;
		this.id = id;
		this.puntuacionImdb = puntuacionImdb;
		this.puntuacionMetacritic = puntuacionMetacritic;
		this.duracion = duracion;
		this.anyoestreno = anyoestreno;
		this.presupuesto = presupuesto;
		this.recaudacionPrimeraSemana = recaudacionPrimeraSemana;
		this.setEmpresa(empresa);
		
	}

  public MarvelDC(String titulo, Double puntuacionImdb, Integer puntuacionMetacritic, Integer duracion, Integer anyoestreno, Integer presupuesto) {
	  Checkers.checkNoNull(titulo,puntuacionMetacritic,duracion,anyoestreno,presupuesto);
	  Checkers.check("La puntuación de Metacritic está por encima de 100", puntuacionMetacritic < 100);
		this.titulo = titulo;
		this.puntuacionImdb = puntuacionImdb;
		this.puntuacionMetacritic = puntuacionMetacritic;
		this.duracion = duracion;
		this.anyoestreno = anyoestreno;
		this.presupuesto = presupuesto;
		
	}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Double getPuntuacionImdb() {
	return puntuacionImdb;
}

public void setPuntuacionImdb(Double puntuacionImdb) {
	this.puntuacionImdb = puntuacionImdb;
}

public Integer getPuntuacionMetacritic() {
	return puntuacionMetacritic;
}

public void setPuntuacionMetacritic(Integer puntuacionMetacritic) {
	this.puntuacionMetacritic = puntuacionMetacritic;
}

public Integer getDuracion() {
	return duracion;
}

public void setDuracion(Integer duracion) {
	this.duracion = duracion;
}

public void setEmpresa(Empresa empresa) {
	this.empresa = empresa;
}

public Empresa getEmpresa() {
	return empresa;
}


public Integer getAnyoestreno() {
	return anyoestreno;
}

public void setAnyoestreno(Integer anyoestreno) {
	this.anyoestreno = anyoestreno;
}

public Integer getPresupuesto() {
	return presupuesto;
}

public void setPresupuesto(Integer presupuesto) {
	this.presupuesto = presupuesto;
}

public Integer getRecaudacionPrimeraSemana() {
	return recaudacionPrimeraSemana;
}

public void setRecaudacionPrimeraSemana(Integer recaudacionPrimeraSemana) {
	this.recaudacionPrimeraSemana = recaudacionPrimeraSemana;
}
	

public Boolean MismaAnyoestreno(MarvelDC m) {
    Boolean res = false;
    if (anyoestreno.equals(m.getAnyoestreno())) {
        res = true;
    }
    return res;
}

public int compareTo(MarvelDC m) {
    int x;
    x = getPuntuacionImdb().compareTo(m.getPuntuacionImdb());
    if (x == 0) {
        x = getPuntuacionMetacritic().compareTo(m.getPuntuacionMetacritic());
        if (x==0) {
            x = getPresupuesto().compareTo(m.getPresupuesto());
            
        }
	}
    return x;
}



public String toString() {
	return "MarvelDC [getTitulo()=" + getTitulo() + ", getId()=" + getId() + ", getPuntuacionImdb()="
			+ getPuntuacionImdb() + ", getPuntuacionMetacritic()=" + getPuntuacionMetacritic() + ", getDuracion()="
			+ getDuracion() + ", getAnyoestreno()=" + getAnyoestreno() + ", getPresupuesto()=" + getPresupuesto()
			+ ", getRecaudacionPrimeraSemana()=" + getRecaudacionPrimeraSemana() + "]";
}






}
	




