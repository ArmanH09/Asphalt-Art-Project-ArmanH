import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    MPainter BMW = new MPainter();
    MuralPainter Background = new MuralPainter();
    
    Background.paintBackground("Black", 32);

    BMW.paintLogo();
  }
}