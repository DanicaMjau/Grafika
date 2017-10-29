package liste;


public class lista<T> {
	
	private Cvor<Integer> glava;
	private Integer zbir=0;
	private Integer zbir1=0;
	private Integer zbir2=0;
	
	public Integer prodjiKrozListu(){
		if(glava==null){
			System.out.println("prazna je lista");
		}
		Cvor<Integer>tmp=glava;
		while(tmp!=null ){
			zbir=zbir*10+tmp.podatak;
			tmp=tmp.naredni;
		
			
		}
		return zbir;
	}
	
	
	public boolean dodajNaPocetak(Integer podatak){
		if(podatak== null){
			return false;
		}
		glava=new Cvor<Integer>(podatak,glava);
		return true;
		
	}
	

	public class Cvor<Integer>{
		private Integer podatak;
		private Cvor<Integer> naredni;
		public Cvor(Integer podatak, Cvor<Integer> naredni) {
			super();
			this.podatak = podatak;
			this.naredni = naredni;
		}
	}
	public void IspisiListu() {
		if (glava == null) {
			System.out.println("Lista je prazna");
			return;
		}
		Cvor<Integer> trenutni = glava;
		while (trenutni != null) {
			System.out.print(trenutni.podatak);
			if (trenutni.naredni != null) {
				System.out.print( " -> ");
			} else {
				System.out.println();
			}
			trenutni = trenutni.naredni;
		}
		
	}
	
	
	public static void main(String args[]) {
		//JednostrukaLista<String> mojaLista1 = new JednostrukaLista<>();
		lista<Integer> moja=new lista<>();
		lista<Integer> moja2=new lista<>();
		moja.dodajNaPocetak(5);
		moja.dodajNaPocetak(5);
		moja.dodajNaPocetak(5);
		moja.dodajNaPocetak(5);
		moja.IspisiListu();
		moja2.dodajNaPocetak(5);
		moja2.dodajNaPocetak(5);
		moja2.IspisiListu();
		int zbir1=moja.prodjiKrozListu();
		int zbir2=moja2.prodjiKrozListu();
		System.out.println(zbir1+zbir2);
		
	}

}
