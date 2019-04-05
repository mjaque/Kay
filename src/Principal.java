import javafx.application.Application;
import javafx.stage.Stage;

public class Principal extends Application{
	
	
	// Datos del Programa y Tamaño de Pantalla
		static final double VERSION = 0.1;

		static final double ANCHO = 1024;// px
		static final double ALTO = 714;// px


		public static void main(String[] args) {
			launch(args);
		}

		
		@Override
		public void start(Stage ventana) {
			// 1.1 Crear la ventana
			ventana.setWidth(ANCHO);
			ventana.setHeight(ALTO);
			ventana.setTitle("KAY " + VERSION);
			ventana.setResizable(false);

			// 1.2 Crear la escena
	//ventana.setScene(new Escena1(null));
			ventana.show();
		}

	}

	
