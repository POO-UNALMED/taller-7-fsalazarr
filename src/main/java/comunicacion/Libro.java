package comunicacion;

public class Libro extends Escrito {
	String co_autor;
	String editorial;
	String edicion;
	String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor,String editorial,String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		// TODO Auto-generated constructor stub
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	@Override
	public int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return this.getPaginas()*palabrasPagina*2;
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String a = this.getOrigen() + "\n";
		a += this.getTitulo() + "\n";
		a += this.getAutor() + "\n";
		a += this.getPaginas() + "\n";
		a += this.co_autor + "\n";
		a += this.editorial + "\n";
		a += this.edicion;
		return a;
	}
	
	public String getCo_autor() {
		return co_autor;
	}public String getEdicion() {
		return edicion;
	}public String getEditorial() {
		return editorial;
	}public String getInterpretacion() {
		return interpretacion;
	}public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}public void setEdicion(String edicion) {
		this.edicion = edicion;
	}public void setEditorial(String editorial) {
		this.editorial = editorial;
	}public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
