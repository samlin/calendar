package com.calendar.bean;

import java.io.Serializable;

public class Event implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6131349602227922478L;

	private String id;

	// 事件结束时间，全日视图产生的时间都是0:00到23:59
	private String endTime = "23:59";

	// 事件结束日期
	private String eymd = null;

	/**
	 * 事件颜色
	 */
	private String color = "red";

	// 是否有警告
	private boolean alertFlag;

	// 是否锁定
	private boolean locked = false;

	// 起始日期
	private String ymd = null;

	// 主题
	private String subject;

	// 起始时间
	private String startTime = "00:00";

	// 描述
	private String description;

	// 回复类型
	private String repeatType;

	// 日历编号
	private String calendarId;

	public boolean isAlertFlag() {
		return alertFlag;
	}

	public void setAlertFlag(boolean alertFlag) {
		this.alertFlag = alertFlag;
	}

	public String getCalendarId() {
		return calendarId;
	}

	public void setCalendarId(String calendarId) {
		this.calendarId = calendarId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEymd() {
		return eymd;
	}

	public void setEymd(String eymd) {
		this.eymd = eymd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public String getRepeatType() {
		return repeatType;
	}

	public void setRepeatType(String repeatType) {
		this.repeatType = repeatType;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getYmd() {
		return ymd;
	}

	public void setYmd(String ymd) {
		this.ymd = ymd;
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + (alertFlag ? 1231 : 1237);
		result = PRIME * result
				+ ((calendarId == null) ? 0 : calendarId.hashCode());
		result = PRIME * result + ((color == null) ? 0 : color.hashCode());
		result = PRIME * result
				+ ((description == null) ? 0 : description.hashCode());
		result = PRIME * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = PRIME * result + ((eymd == null) ? 0 : eymd.hashCode());
		result = PRIME * result + ((id == null) ? 0 : id.hashCode());
		result = PRIME * result + (locked ? 1231 : 1237);
		result = PRIME * result
				+ ((repeatType == null) ? 0 : repeatType.hashCode());
		result = PRIME * result
				+ ((startTime == null) ? 0 : startTime.hashCode());
		result = PRIME * result + ((subject == null) ? 0 : subject.hashCode());
		result = PRIME * result + ((ymd == null) ? 0 : ymd.hashCode());
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
		final Event other = (Event) obj;
		if (alertFlag != other.alertFlag)
			return false;
		if (calendarId == null) {
			if (other.calendarId != null)
				return false;
		} else if (!calendarId.equals(other.calendarId))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (eymd == null) {
			if (other.eymd != null)
				return false;
		} else if (!eymd.equals(other.eymd))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (locked != other.locked)
			return false;
		if (repeatType == null) {
			if (other.repeatType != null)
				return false;
		} else if (!repeatType.equals(other.repeatType))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (ymd == null) {
			if (other.ymd != null)
				return false;
		} else if (!ymd.equals(other.ymd))
			return false;
		return true;
	}

	public String toString() {

		String buffer = "";
		buffer += "endTime=" + this.endTime;
		buffer += ", endDay=" + this. eymd;
		buffer += ", alertFlag=" + this.alertFlag;
		buffer += ", locked=" + this.locked;
		buffer += ", startDay=" + this.ymd;
		buffer += ", subject=" + this.subject;
		buffer += ", startTime=" + this.startTime;
		buffer += ", description=" + this.description;
		buffer += ", repeatType=" + this.repeatType;
		buffer += ", calendarId=" + this.calendarId;
		return buffer;
	}
}
