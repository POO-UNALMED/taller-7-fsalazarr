package comunicacion;

public class Fabula extends Escrito {
	String ensenanza;
	String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas,String ensenanza,String interpretacion) {
		super(origen, titulo, autor, paginas);
		// TODO Auto-generated constructor stub
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	@Override
	public int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return this.getPaginas()*palabrasPagina*1;
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
		a += this.ensenanza;
		return a;
	}
	
	public String getEnsenanza() {
		return ensenanza;
	}public String getInterpretacion() {
		return interpretacion;
	}public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}
