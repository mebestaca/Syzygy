package syzygy.lib;

public class FrameCustom {
	private String upper_left_corner;
	private String upper_right_corner;
	private String lower_left_corner;
	private String lower_right_corner;
	private String horizontal_connector;
	private String vertical_connector;
	
	private  FrameCustom(String upper_left_corner, String upper_right_corner, String lower_left_corner,
			String lower_right_corner, String horizontal_connector, String vertical_connector) {
		super();
		this.upper_left_corner = upper_left_corner;
		this.upper_right_corner = upper_right_corner;
		this.lower_left_corner = lower_left_corner;
		this.lower_right_corner = lower_right_corner;
		this.horizontal_connector = horizontal_connector;
		this.vertical_connector = vertical_connector;
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
