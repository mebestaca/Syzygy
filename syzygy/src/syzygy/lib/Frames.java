package syzygy.lib;

public class Frames implements IFrames {
	private static int left_pad = 0;
	private static int right_pad = 0;
	
	private String upper_left_corner;
	private String upper_right_corner;
	private String lower_left_corner;
	private String lower_right_corner;
	private String horizontal_connector;
	private String vertical_connector;
	
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
	}
	
	
}
