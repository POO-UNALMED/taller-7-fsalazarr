package comunicacion;

public class Tesis extends Escrito {
	String idea;
	String[] argumentos;
	String conclusion;
	String referencias;
	String interpretacion;

	
	public Tesis(String origen, String titulo, String autor, int paginas,String idea,String[] argumentos,String conclusion,String referencias,String interpretacion) {
		super(origen, titulo, autor, paginas);
		// TODO Auto-generated constructor stub
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	@Override
	public int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return this.getPaginas()*palabrasPagina*5;
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
		a += this.idea + "\n";
		a += this.argumentos.length + "\n";
		a += this.conclusion + "\n";
		a += this.referencias;
		return a;
	}
	
	public String[] getArgumentos() {
		return argumentos;
	}public String getConclusion() {
		return conclusion;
	}public String getIdea() {
		return idea;
	}public String getInterpretacion() {
		return interpretacion;
	}public String getReferencias() {
		return referencias;
	}public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}public void setIdea(String idea) {
		this.idea = idea;
	}public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
}
