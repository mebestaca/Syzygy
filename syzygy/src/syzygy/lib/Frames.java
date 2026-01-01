package syzygy.lib;

public class Frames implements IFrames {
	private int lPad;
	private int rPad;
	private String upper_left_corner;
	private String upper_right_corner;
	private String lower_left_corner;
	private String lower_right_corner;
	private String horizontal_connector;
	private String vertical_connector;
	
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
			this.upper_left_corner = "╔";
			this.upper_right_corner = "╗";
			this.lower_left_corner = "╚";
			this.lower_right_corner = "╝";
			this.horizontal_connector = "═";
			this.vertical_connector = "║";
		}
		else if(FrameTypes.SINGLE_FRAME == type) {
			this.upper_left_corner = "┌";
			this.upper_right_corner = "┐";
			this.lower_left_corner = "└";
			this.lower_right_corner = "┘";
			this.horizontal_connector = "─";
			this.vertical_connector = "│";
		}
		else if (FrameTypes.CUSTOM == type && custom != null) {
			this.upper_left_corner = custom.getUpperLeftCorner();
			this.upper_right_corner = custom.getUpperRightCorner();
			this.lower_left_corner = custom.getLowerLeftCorner();
			this.lower_right_corner = custom.getLowerRightCorner();
			this.horizontal_connector = custom.getHorizontalConnector();
			this.vertical_connector = custom.getVerticalConnector();
		}
	}

	public int getlPad() {
		return lPad;
	}

	public int getrPad() {
		return rPad;
	}

	public String getUpper_left_corner() {
		return upper_left_corner;
	}

	public String getUpper_right_corner() {
		return upper_right_corner;
	}

	public String getLower_left_corner() {
		return lower_left_corner;
	}

	public String getLower_right_corner() {
		return lower_right_corner;
	}

	public String getHorizontal_connector() {
		return horizontal_connector;
	}

	public String getVertical_connector() {
		return vertical_connector;
	}
}
