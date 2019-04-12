import javafx.scene.Group;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class PantallaCarga extends Scene{
	

		// Atributos de la Escena
		static final Group RAIZ = new Group();
		static final Image IMAGEN = new Image(PantallaCarga.class.getClassLoader().getResourceAsStream("recursos/pixil-frame-0 (3).png"));
		static final Image Load = new Image(PantallaCarga.class.getClassLoader().getResourceAsStream("recursos/Loading.gif"));
		public PantallaCarga() {
			super (RAIZ);
			Rectangle R = new Rectangle();
			R.setFill(Color.BLACK);
			R.setX(0);
			R.setY(0);
			R.setHeight(714);
			R.setWidth(1024);
			RAIZ.getChildren().add(R);
			ImageView logo = new ImageView(IMAGEN);
			logo.setX(220);
			logo.setY(60);
			RAIZ.getChildren().add(logo);
			ImageView load = new ImageView(Load);
			load.setX(0);
			load.setY(0);
			load.setPreserveRatio(true);
			load.setFitHeight(100);
			load.setFitWidth(100);
			RAIZ.getChildren().add(load);
			
			
		}

	}

