package comunicacion;

public class Alfabeto extends Pictograma {
	String[] letras;
	String interpretacion;
	
	public Alfabeto(String origen,String[] letras, String interpretacion) {
		super(origen);
		// TODO Auto-generated constructor stub
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {return letras.length;}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString () {
		String ls = "";
		for (String l : letras){
			ls += l + ", ";
		}
		return ls.substring(0,ls.length()-2);
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}public String getInterpretacion() {
		return interpretacion;
	}public String[] getLetras() {
		return letras;
	}public void setLetras(String[] letras) {
		this.letras = letras;
	}

}
