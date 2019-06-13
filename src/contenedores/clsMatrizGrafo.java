package contenedores;

public class clsMatrizGrafo extends clsMatrizArr{
	public clsMatrizGrafo(int ordenGrafo){
		super(ordenGrafo, ordenGrafo);
	}
	
	public boolean areConnected(int i, int j){
		boolean response=false;
		if (i>=0 && i<getNroFilas() && j>=0 && j<getNroColumnas()){
			if (this.matriz[i][j]!=null){
				response=true;
			}
		}				
		return response;
	}
	
}
