package syzygy.lib;

public class Frames implements IFrames {
	private int lPad;
	private int rPad;
	private String upperLeftCorner;
	private String upperRightCorner;
	private String lowerLeftCorner;
	private String lowerRightCorner;
	private String horizontalConnector;
	private String verticalConnector; 
	private String crossConnector;
	private String leftVerticalConnector;
	private String rightVerticalConnector;
	private String topHorizontalConnector;
	private String bottomhorizontalConnector;
	
	public Frames() {
		this(0, 0);
	}
	
	public Frames(int lPad, int rPad) {
		this(lPad, rPad, FrameTypes.DOUBLE_FRAME, null);
	}
	
	public Frames(int lPad, int rPad, FrameTypes type,  FrameCustom custom) {
		this.lPad = lPad;
		this.rPad = rPad;
		configureStyle(type, custom);
	}
	
	@Override
	public void configureStyle(FrameTypes type, FrameCustom custom) {
		if (FrameTypes.DOUBLE_FRAME == type) {
			this.upperLeftCorner = "╔";
			this.upperRightCorner = "╗";
			this.lowerLeftCorner = "╚";
			this.lowerRightCorner = "╝";
			this.horizontalConnector = "═";
			this.verticalConnector = "║";
		}
		else if(FrameTypes.SINGLE_FRAME == type) {
			this.upperLeftCorner = "┌";
			this.upperRightCorner = "┐";
			this.lowerLeftCorner = "└";
			this.lowerRightCorner = "┘";
			this.horizontalConnector = "─";
			this.verticalConnector = "│";
		}
		else if (FrameTypes.CUSTOM == type && custom != null) {
			this.upperLeftCorner = custom.getUpperLeftCorner();
			this.upperRightCorner = custom.getUpperRightCorner();
			this.lowerLeftCorner = custom.getLowerLeftCorner();
			this.lowerRightCorner = custom.getLowerRightCorner();
			this.horizontalConnector = custom.getHorizontalConnector();
			this.verticalConnector = custom.getVerticalConnector();
		}
	}

	public int getlPad() {
		return lPad;
	}

	public int getrPad() {
		return rPad;
	}

	public String getUpper_left_corner() {
		return upperLeftCorner;
	}

	public String getUpper_right_corner() {
		return upperRightCorner;
	}

	public String getLower_left_corner() {
		return lowerLeftCorner;
	}

	public String getLower_right_corner() {
		return lowerRightCorner;
	}

	public String getHorizontal_connector() {
		return horizontalConnector;
	}

	public String getVertical_connector() {
		return verticalConnector;
	}

	@Override
	public void compose(String prompt) {
		
	}
}
