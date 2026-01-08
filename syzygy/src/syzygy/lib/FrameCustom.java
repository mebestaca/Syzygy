package syzygy.lib;

public class FrameCustom {
	private String upper_left_corner;
	private String upper_right_corner;
	private String lower_left_corner;
	private String lower_right_corner;
	private String horizontal_connector;
	private String vertical_connector;
	private String crossConnector;
	private String leftVerticalConnector;
	private String rightVerticalConnector;
	private String topHorizontalConnector;
	private String bottomhorizontalConnector;
	
	private FrameCustom(Builder builder) {
		super();
		this.upper_left_corner = builder.upper_left_corner;
		this.upper_right_corner = builder.upper_right_corner;
		this.lower_left_corner = builder.lower_left_corner;
		this.lower_right_corner = builder.lower_right_corner;
		this.horizontal_connector = builder.horizontal_connector;
		this.vertical_connector = builder.vertical_connector;
		this.crossConnector = builder.crossConnector;
		this.leftVerticalConnector = builder.leftVerticalConnector;
		this.rightVerticalConnector = builder.rightVerticalConnector;
		this.topHorizontalConnector = builder.topHorizontalConnector;
		this.bottomhorizontalConnector = builder.bottomhorizontalConnector;
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
	
	public String getCrossConnector() {
		return crossConnector;
	}

	public String getLeftVerticalConnector() {
		return leftVerticalConnector;
	}

	public String getRightVerticalConnector() {
		return rightVerticalConnector;
	}

	public String getTopHorizontalConnector() {
		return topHorizontalConnector;
	}

	public String getBottomhorizontalConnector() {
		return bottomhorizontalConnector;
	}

	public static class Builder {
		private String upper_left_corner;
		private String upper_right_corner;
		private String lower_left_corner;
		private String lower_right_corner;
		private String horizontal_connector;
		private String vertical_connector;
		private String crossConnector;
		private String leftVerticalConnector;
		private String rightVerticalConnector;
		private String topHorizontalConnector;
		private String bottomhorizontalConnector;
		
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
		
		public Builder setCrossConnector(String glyph) {
			this.crossConnector = glyph;
			return this;
		}
		
		public Builder setLeftVerticalConnector(String glyph) {
			this.leftVerticalConnector = glyph;
			return this;
		}
		
		public Builder setRightVerticalConnector(String glyph) {
			this.rightVerticalConnector = glyph;
			return this;
		}
		
		public Builder setTopHorizontalConnector(String glyph) {
			this.topHorizontalConnector = glyph;
			return this;
		}
		
		public Builder setBottomhorizontalConnector(String glyph) {
			this.bottomhorizontalConnector = glyph;
			return this;
		}
	
		public FrameCustom build() {
			return new FrameCustom(this);
		}
	}
}
