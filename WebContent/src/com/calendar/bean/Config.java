package com.calendar.bean;


public class Config {

	/**
	 * 编号
	 */
	private String id = "1";
	
	
	//是否为双击创建事件
	private boolean createByDblclick = false;
	/**
	 * 月显示 比如8月18号为  8/16 在月视图中表现出来
	 */
	private String monthFormat = "m-d";
	
	/**
	 * 周视图数字显示 8月18星期二显示为 8/18(二)
	 */
	private String weekFormat = "m-d(D)";
	/**
	 * 视图样式，这里使用默认既可，不需要更改
	 */
	private String style = "CalendarSettingUIModel";
	
	/**
	 * 是否隐藏不活动的行
	 */
	private boolean hideInactiveRow = false;
	
	/**
	 * 日视图化格式 比如 2011年8月18号星期二显示为 (二) 八月 18 2011  (大小写表示数据是否中文大写)
	 */
	private String dayFormat = "l M d Y";
	
	/**
	 * 时间格式为
	 */
	private String fromtoFormat = "m/d/Y";
	
	/**
	 * 时间间隔设置,默认为30分钟,在产生时间下拉列表时表示每隔30分钟一次，在日视图中可以看到效果
	 */
	private int intervalSlot = 30;
	
	/**
	 * 视图是否只读
	 */
	private boolean readOnly = false;
	
	/**
	 * 24小时制，还是12小时制 
	 */
	private int hourFormat = 24; // 12;
	
	/**
	 * 是否显示单天
	 */
	private boolean singleDay = false;
	/**
	 * 月开始第一天
	 */
	private int startDay = 1;
	
	/**
	 *  活动结束时间
	 */
	private String activeEndTime = "19:00";
	
	/**
	 * 活动开始时间
	 */
	private String activeStartTime = "09:00";
	
	/**
	 * 语言种类
	 */
	private String language = "zh_CN";
	
	
	

	public String getActiveEndTime() {
		return activeEndTime;
	}

	public void setActiveEndTime(String activeEndTime) {
		this.activeEndTime = activeEndTime;
	}

	public String getActiveStartTime() {
		return activeStartTime;
	}

	public void setActiveStartTime(String activeStartTime) {
		this.activeStartTime = activeStartTime;
	}

	public boolean isCreateByDblclick() {
		return createByDblclick;
	}

	public void setCreateByDblclick(boolean createByDblclick) {
		this.createByDblclick = createByDblclick;
	}

	public String getDayFormat() {
		return dayFormat;
	}

	public void setDayFormat(String dayFormat) {
		this.dayFormat = dayFormat;
	}

	public String getFromtoFormat() {
		return fromtoFormat;
	}

	public void setFromtoFormat(String fromtoFormat) {
		this.fromtoFormat = fromtoFormat;
	}

	public boolean isHideInactiveRow() {
		return hideInactiveRow;
	}

	public void setHideInactiveRow(boolean hideInactiveRow) {
		this.hideInactiveRow = hideInactiveRow;
	}

	public int getHourFormat() {
		return hourFormat;
	}

	public void setHourFormat(int hourFormat) {
		this.hourFormat = hourFormat;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIntervalSlot() {
		return intervalSlot;
	}

	public void setIntervalSlot(int intervalSlot) {
		this.intervalSlot = intervalSlot;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMonthFormat() {
		return monthFormat;
	}

	public void setMonthFormat(String monthFormat) {
		this.monthFormat = monthFormat;
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	public boolean isSingleDay() {
		return singleDay;
	}

	public void setSingleDay(boolean singleDay) {
		this.singleDay = singleDay;
	}

	public int getStartDay() {
		return startDay;
	}

	public void setStartDay(int startDay) {
		this.startDay = startDay;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getWeekFormat() {
		return weekFormat;
	}

	public void setWeekFormat(String weekFormat) {
		this.weekFormat = weekFormat;
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((activeEndTime == null) ? 0 : activeEndTime.hashCode());
		result = PRIME * result + ((activeStartTime == null) ? 0 : activeStartTime.hashCode());
		result = PRIME * result + (createByDblclick ? 1231 : 1237);
		result = PRIME * result + ((dayFormat == null) ? 0 : dayFormat.hashCode());
		result = PRIME * result + ((fromtoFormat == null) ? 0 : fromtoFormat.hashCode());
		result = PRIME * result + (hideInactiveRow ? 1231 : 1237);
		result = PRIME * result + hourFormat;
		result = PRIME * result + ((id == null) ? 0 : id.hashCode());
		result = PRIME * result + intervalSlot;
		result = PRIME * result + ((language == null) ? 0 : language.hashCode());
		result = PRIME * result + ((monthFormat == null) ? 0 : monthFormat.hashCode());
		result = PRIME * result + (readOnly ? 1231 : 1237);
		result = PRIME * result + (singleDay ? 1231 : 1237);
		result = PRIME * result + startDay;
		result = PRIME * result + ((style == null) ? 0 : style.hashCode());
		result = PRIME * result + ((weekFormat == null) ? 0 : weekFormat.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Config other = (Config) obj;
		if (activeEndTime == null) {
			if (other.activeEndTime != null)
				return false;
		} else if (!activeEndTime.equals(other.activeEndTime))
			return false;
		if (activeStartTime == null) {
			if (other.activeStartTime != null)
				return false;
		} else if (!activeStartTime.equals(other.activeStartTime))
			return false;
		if (createByDblclick != other.createByDblclick)
			return false;
		if (dayFormat == null) {
			if (other.dayFormat != null)
				return false;
		} else if (!dayFormat.equals(other.dayFormat))
			return false;
		if (fromtoFormat == null) {
			if (other.fromtoFormat != null)
				return false;
		} else if (!fromtoFormat.equals(other.fromtoFormat))
			return false;
		if (hideInactiveRow != other.hideInactiveRow)
			return false;
		if (hourFormat != other.hourFormat)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (intervalSlot != other.intervalSlot)
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (monthFormat == null) {
			if (other.monthFormat != null)
				return false;
		} else if (!monthFormat.equals(other.monthFormat))
			return false;
		if (readOnly != other.readOnly)
			return false;
		if (singleDay != other.singleDay)
			return false;
		if (startDay != other.startDay)
			return false;
		if (style == null) {
			if (other.style != null)
				return false;
		} else if (!style.equals(other.style))
			return false;
		if (weekFormat == null) {
			if (other.weekFormat != null)
				return false;
		} else if (!weekFormat.equals(other.weekFormat))
			return false;
		return true;
	}

}
