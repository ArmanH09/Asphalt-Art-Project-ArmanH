import org.code.neighborhood.*;

public class MPainter extends MuralPainter {
  public void paintLogo() {
    
    // Combine all methods into one to create the M logo

    goToLBStripePos();
    paintLBStripe();
    goToBStripePos();
    paintBStripe();
    goToRStripePos();
    paintRStripe();
    goToMPos();
    paintM();
  }

  public void goToLBStripePos() {

    // Get into position to paint the light blue stripe
    
    resetPosition();
    turnRight();
    moveToY11();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
  }

  public void moveToY11() {

    // Move 11 times to get to starting position for every peice of the Logo
    
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
  }

  public void paintLBStripe() {

    // Paint the light blue stripe
    
    paintLine("LightBlue", 5);
    turnToWest();
    move();
    move();
    paintLine("LightBlue", 4);
    turnToEast();
    paintLine("LightBlue", 4);
    turnToWest();
    move();
    paintLine("LightBlue", 4);
    turnToEast();
    paintLine("LightBlue", 4);
    turnToWest();
    move();
    paintLine("LightBlue", 4);
    turnToEast();
    paintLine("LightBlue", 4);
    turnToWest();
    move();
    move();
    paintLine("LightBlue", 4);
    turnToEast();
    move();
    paintLine("LightBlue", 4);
    turnToWest();
    move();
    move();
    paintLine("LightBlue", 4);
  }

  public void goToBStripePos() {

    // Go to the Blue stripe position, use the Light blue stripe position method, and move a few spaces to the right.
    
    turnAround();
    goToLBStripePos();
    move();
    move();
    move();
    move();
    move();
  }

  public void paintBStripe() {

    // Paint the blue stripe
    
    paintLine("Blue", 4);
    turnToWest();
    move();
    move();
    paintLine("Blue", 4);
    turnToEast();
    paintLine("Blue", 4);
    turnToWest();
    move();
    paintLine("Blue", 4);
    turnToEast();
    paintLine("Blue", 4);
    turnToWest();
    move();
    paintLine("Blue", 4);
    turnToEast();
    paintLine("Blue", 4);
    turnToWest();
    move();
    move();
    paintLine("Blue", 4);
    turnToEast();
    move();
    paintLine("Blue", 4);
    turnToWest();
    move();
    move();
    paintLine("Blue", 4);
  }

  public void goToRStripePos() {

    // Go the red stripe position using the blue stripe position and moving right a few spaces.
    
    goToBStripePos();
    move();
    move();
    move();
    move();
  }

  public void paintRStripe() {

    // Paint the red stripe 
    
    paintLine("Red", 4);
    turnToWest();
    move();
    move();
    paintLine("Red", 4);
    turnToEast();
    paintLine("Red", 5);
    turnToWest();
    move();
    move();
    paintLine("Red", 4);
    turnToEast();
    paintLine("Red", 4);
    turnToWest();
    move();
    paintLine("Red", 4);
    turnToEast();
    paintLine("Red", 4);
    turnToWest();
    move();
    paintLine("Red", 5);
    turnToEast();
    move();
    paintLine("Red", 4);
    turnToWest();
    move();
    move();
    paintLine("Red", 4);
  }

  public void goToMPos() {

    // Go M position using the red stripe position
    
    goToRStripePos();
    move();
    move();
    move();
    move();
  }

  public void paintM() {

    // Paint the M
    
    paintLine("White", 4);
    move();
    move();
    paintLine("White", 4);
    turnToWest();
    move();
    paintLine("White", 5);
    move();
    paintLine("White", 5);
    turnToEast();
    move();
    paintLine("White", 5);
    move();
    paintLine("White", 5);
    turnToWest();
    move();
    paintLine("White", 12);
    turnToEast();
    paintLine("White", 13);
    turnToWest();
    move();
    paintLine("White", 13);
    turnToEast();
    paintLine("White", 4);
    move();
    paintLine("White", 9);
    turnToWest();
    move();
    paintLine("White", 4);
    move();
    paintLine("White", 4);
    move();
    paintLine("White", 4);
    turnToEast();
    paintLine("White", 4);
    move();
    move();
    paintLine("White", 4);
    move();
    paintLine("White", 4);
    turnToWest();
    move();
    paintLine("White", 4);
    move();
    move();
    paintLine("White", 3);
    move();
    move();
    move();
    paintLine("White", 4);
  }
}