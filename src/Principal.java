import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Principal extends Application{
	
	
	// Datos del Programa y Tamaño de Pantalla
		static final double VERSION = 0.1;
		private Stage ventana;
		static final double ANCHO = 1024;// px
		static final double ALTO = 714;// px


		public static void main(String[] args) {
			launch(args);
		}

		
		@Override
		public void start(Stage ventana) {
			this.ventana=ventana;
			// 1.1 Crear la ventana
			ventana.setWidth(ANCHO);
			ventana.setHeight(ALTO);
			ventana.setTitle("KAY " + VERSION);
			ventana.setResizable(false);
	
			// 1.2 Crear la escena
			ventana.setScene(new PantallaCarga());
		PauseTransition delay = new PauseTransition(Duration.seconds(4))	;
            delay.setOnFinished(event -> cambiar());
            delay.play();
            ventana.show();
		}


		private Void cambiar() {
		// TODO Auto-generated method stub
		ventana.setScene(new Escena1());
			return null;
		}

		
	}

	
