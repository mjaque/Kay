

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Jugador extends ImageView{


	public Jugador() {
		super(IMAGEN);
			Rectangle2D viewportRect = new Rectangle2D(0, 0, 30, 30);
			this.setViewport(viewportRect);
	}

	static final Image IMAGEN = new Image("recursos/player.png");
	
}
