package colorFlipper;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) {
		BufferedImage img;
		try {
			Color myColor = new Color(59, 138, 237);
			int rgb = myColor.getRGB();
			img = ImageIO.read(new File("C:\\Users\\Morga\\OneDrive\\Documents\\Random\\typewriter.png"));
			for(int row = 0; row < img.getWidth(); row ++) {
				for(int col = 0; col < img.getHeight(); col++) {
					int c = img.getRGB(row, col);
					if(c == -16777216) {
						img.setRGB(row, col, rgb);
					}
				}
			}
			File newFile = new File("C:\\\\Users\\\\Morga\\\\OneDrive\\\\Documents\\\\Random\\\\new_typewriter.png");
			ImageIO.write(img, "png", newFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
