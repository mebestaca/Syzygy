package syzygy.lib;

public class FrameCustom {
	private String upper_left_corner;
	private String upper_right_corner;
	private String lower_left_corner;
	private String lower_right_corner;
	private String horizontal_connector;
	private String vertical_connector;
	
	private FrameCustom(Builder builder) {
		super();
		this.upper_left_corner = builder.upper_left_corner;
		this.upper_right_corner = builder.upper_right_corner;
		this.lower_left_corner = builder.lower_left_corner;
		this.lower_right_corner = builder.lower_right_corner;
		this.horizontal_connector = builder.horizontal_connector;
		this.vertical_connector = builder.vertical_connector;
	}
	
	public String getUpperLeftCorner() {
		return upper_left_corner;
	}
	public String getUpperRightCorner() {
		return upper_right_corner;
	}
	public String getLowerLeftCorner() {
		return lower_left_corner;
	}
	public String getLowerRightCorner() {
		return lower_right_corner;
	}
	public String getHorizontalConnector() {
		return horizontal_connector;
	}
	public String getVerticalConnector() {
		return vertical_connector;
	}
	
	public static class Builder {
		private String upper_left_corner;
		private String upper_right_corner;
		private String lower_left_corner;
		private String lower_right_corner;
		private String horizontal_connector;
		private String vertical_connector;
		
		public Builder() {
			
		}
		
		public Builder setUpperLeftCorner(String glyph) {
			this.upper_left_corner = glyph;
			return this;
		}
		
		public Builder setUpperRightCorner(String glyph) {
			this.upper_right_corner = glyph;
			return this;
		}
		
		public Builder setLowerLeftCorner(String glyph) {
			this.lower_left_corner = glyph;
			return this;
		}
		
		public Builder setLowerRightCorner(String glyph) {
			this.lower_right_corner = glyph;
			return this;
		}
		
		public Builder setHorizontalConnector(String glyph) {
			this.horizontal_connector = glyph;
			return this;
		}
		
		public Builder setVerticalConnector(String glyph) {
			this.vertical_connector = glyph;
			return this;
		}
	
		public FrameCustom build() {
			return new FrameCustom(this);
		}
	}
}
