
public class Case {
	
	private Object obj;
	
	public Case() {
		obj = new Vide();
	}
	
	public Object getParcelle(){
		return obj;	
	}
	
	public void setParcelle(Object objet){
		obj = objet;
	}
	
	public void removeParcelle(){
		obj = new Vide();
	}

}
