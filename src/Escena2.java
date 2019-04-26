import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class Escena2 extends Scene implements EventHandler<KeyEvent> {
	// Atributos de la Escena
	
	static final Group RAIZ = new Group();
	static final Image IMAGEN = new Image(Escena2.class.getClassLoader().getResourceAsStream("recursos/imagen1.png"));
	public Principal principal;
	public Escena2(Principal principal) {
		super (RAIZ);
		this.principal = principal;
		ImageView iv = new ImageView(IMAGEN);
		RAIZ.getChildren().add(iv);
		Jugador player = new Jugador();
		player.setX(200);
		player.setY(400);
		player.setFitWidth(60);
		player.setFitHeight(60);
		RAIZ.getChildren().add(player);
	
		this.setOnKeyPressed(this);

	}

	@Override
	public void handle(KeyEvent event) {
		System.out.println("sadfasdfasdfasdfasdfasdfasdff");
		switch (event.getCode()) {

		case UP:
			System.out.println("asdfasdfasfd");
		principal.cambiar2();

			break;
			
		default:
		}
		// TODO Auto-generated method stub
		
	}

}