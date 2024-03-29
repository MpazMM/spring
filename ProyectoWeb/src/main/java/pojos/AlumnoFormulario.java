package pojos;

public class AlumnoFormulario {

	private long id;
	private String nombre;
	private String apellidos;
	private String sexo;
	private String asignatura;
	private String areaTexto;



	/**
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param sexo
	 * @param asignatura
	 * @param areaTexto
	 */
	public AlumnoFormulario(long id, String nombre, String apellidos, String sexo, String asignatura,
			String areaTexto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.asignatura = asignatura;
		this.areaTexto = areaTexto;
	}
	
	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getAreaTexto() {
		return areaTexto;
	}

	public void setAreaTexto(String areaTexto) {
		this.areaTexto = areaTexto;
	}

	@Override
	public String toString() {
		return "AlumnoFormulario [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "")
				+ (sexo != null ? "sexo=" + sexo + ", " : "")
				+ (asignatura != null ? "asignatura=" + asignatura + ", " : "")
				+ (areaTexto != null ? "areaTexto=" + areaTexto : "") + "]";
	}
	
	
	
}
