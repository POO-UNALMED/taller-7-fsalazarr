package comunicacion;

public class Periodico extends Escrito {
	String fecha;
	String primicia;
	String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas,String fecha,String primicia,String interpretacion) {
		super(origen, titulo, autor, paginas);
		// TODO Auto-generated constructor stub
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return this.getPaginas()*palabrasPagina*10;
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
		a += this.fecha + "\n";
		a += this.primicia;
		return a;
	}
	
	public String getFecha() {
		return fecha;
	}public String getInterpretacion() {
		return interpretacion;
	}public String getPrimicia() {
		return primicia;
	}public void setFecha(String fecha) {
		this.fecha = fecha;
	}public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

}
