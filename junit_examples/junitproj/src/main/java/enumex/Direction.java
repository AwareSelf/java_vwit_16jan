package enumex;

public enum Direction {
	  EAST(0), WEST(180), NORTH(90), SOUTH(270);

	  // constructor
	  private Direction(final int angle) {
	    this.angle = angle;
	  }

	  // internal state
	  private int angle;

	  public int getAngle() {
	    return angle;
	  }
	}