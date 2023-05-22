package  {
	
	import flash.display.MovieClip;
	import fl.transitions.Fade;
	
	
	public class setup extends MovieClip {           //definicion de la clase
		
		private var fondo_new: fondo = new fondo();     //variables de clase 
		private var piso_new: piso = new piso();
		private var protagonista_new: protagonista = new protagonista();
		private var antagonita_new: antagonita = new antagonita();
		private var bala_new: bala = new bala();
		
		public function setup() {         //metodo contructor 
			//constructor code 
			addChild(fondo_new);
			addChild(piso_new);
			addChild(protagonista_new);
			addChild(antagonita_new);
			fondo_new.y = 200;
			fondo_new.x = 275;
			
			piso_new.y = 370;
			piso_new.x = 275;
			
			
			protagonista_new.y = 375;
			protagonista_new.x = 275;
			
			antagonita_new.y = 50;
			antagonita_new.x = 275;
			
		}
	}
	
}
