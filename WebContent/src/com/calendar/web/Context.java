package com.calendar.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import com.calendar.bean.Calendar;
import com.calendar.bean.Config;
import com.calendar.bean.Event;

/**
 * ģ�������ṩ��,�ṩ���������ã��¼�������ʵ�ָ������ɾ�Ĳ鷽��
 * @author Administrator
 *
 */
public class Context {

	static Context instance = new Context();

	/**
	 * ��������
	 */
	private static List<Config> configs = new ArrayList<Config>();
	
	/**
	 * ��������
	 */
	private static List<Calendar> calendars = new ArrayList<Calendar>();
	
	/**
	 * �¼�����
	 */
	private static List<Event> events = new ArrayList<Event>();

	public static Context getInstance() {
		return instance;
	}

	private Context() {

	}

	static {
		/**
		 * ��ʹ��
		 */
		instance.configs.add(new Config());
		Calendar c = new Calendar();
		c.setId(UUID.randomUUID().toString());
		c.setColor("purple");
		c.setDescription("�ҵ�����");
		c.setName("�ҵ�����");
		c.setId("10001");
		c.setPermit("all");
		c.setHide(false);
		c.setUserId("1");

		Calendar c2 = new Calendar();
		c2.setId(UUID.randomUUID().toString());
		c2.setColor("orange");
		c2.setDescription("�ҵ�����2");
		c2.setName("�ҵ�����2");
		c2.setId("10002");
		c2.setPermit("all");
		c2.setHide(false);
		c2.setUserId("1");
		instance.addCalendar(c);
		instance.addCalendar(c2);
	}

	/**
	 * �¼�
	 */

	public void addEvent(Event event) {
		events.add(event);
	}

	public void removeEvent(Event event) {
		events.remove(event);
	}

	public void updateEvent(Event event) {
		if (events.contains(event)) {
			for (Iterator<Event> iter = events.iterator(); iter.hasNext();) {
				Event cal = iter.next();
			}

		}
	}

	public void deleteEvent(String id) {
		for (Iterator<Event> iter = events.iterator(); iter.hasNext();) {
			Event cal = iter.next();
			if (cal.getId().equals(id)) {
				events.remove(cal);
				break;
			}
		}
	}

	public List<Event> selectAll() {
		return events;
	}

	public int getCount() {
		return events.size();
	}

	/**
	 * ��ĳ�����һ������
	 * 
	 * @param calendar
	 */
	public void addCalendar(Calendar calendar) {
		this.calendars.add(calendar);
	}

	public List<Config> getConfig() {
		return this.configs;

	}

	public List<Calendar> getCalendars() {
		return this.calendars;
	}

	public void deleteCalendar(String id) {
		for (Iterator<Calendar> iter = calendars.iterator(); iter.hasNext();) {
			Calendar cal = iter.next();
			if (cal.getId().equals(id)) {
				calendars.remove(cal);
				break;
			}
		}
	}

}
