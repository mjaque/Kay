import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Escena3 extends Scene {
	// Atributos de la Escena
	static final Group RAIZ = new Group();
	static final Image IMAGEN = new Image(Escena3.class.getClassLoader().getResourceAsStream("recursos/imagen1.png"));
	public Principal principal;
	public Escena3(Principal principal2) {
		super (RAIZ);
		this.principal = principal2;
		ImageView iv = new ImageView(IMAGEN);
		RAIZ.getChildren().add(iv);
		Jugador player = new Jugador();
		player.setX(100);
		player.setY(100);
		player.setFitWidth(60);
		player.setFitHeight(60);
		RAIZ.getChildren().add(player);
		
	}


}