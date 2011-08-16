Ext.ns("Ext.ux.calendar");

Ext.ux.calendar.CONST = {
    /*
     * The version number of myCalendar
     */
    VERSION:'2.0.5',
    /*
     *true to show the language submenu in, or not
     *
     */
    SHOW_LANGUAGE_MENU:true,
    
    BLANK_IMAGE_URL:'/calendar/resources/extjs/resources/images/default/s.gif',
    /*
     *define the main path of myCalendar
     */
    MAIN_PATH:'/calendar/resources/calendar/',
    /*
     *define the multi-language path of myCalendar
     */
    CALENDAR_LANGUAGE_PATH:'/calendar/resources/calendar/multi-language/',
    /*
     *define the multi-language path of EXT
     */
    EXT_LANGUAGE_PATH:'/calendar/resources/extjs/src/locale/',
    /*
     * 搜索URL地址
     */
    searchURL:'calendarEvent/search',
	/**
	*显示所有的日历的URL地址
	**/
    showAllCalendarURL:'/calendar/servlet/ShowAllCalendarServlet',
	
	/**
	*查找显示指定日历URL地址
	**/
    showOnlyCalendarURL:'/calendar/servlet/ShowOnlyCalendarServlet',
	
	/***
	*创建或者更新日历URL地址
	**/
    createUpdateCalendarURL:'/calendar/servlet/SaveCalendarServlet',
	/***
	**批量删除日历地址
	*/
    deleteEventsByCalendarURL:'calendarEvent/deleteByCalendar',
	/***
	**批量指定日历地址
	*/
    deleteCalendarURL:'/calendar/servlet/DeleteCalendarServlet',
	
	/***
	**加载日历地址
	*/
    loadCalendarURL:'/calendar/servlet/ListCalendarServlet',
	
	/***
	**加载事件日历地址
	*/
    loadEventURL:'/calendar/servlet/ListEventServlet',///'/calendar/data/listEvent.json',
	/***
	*加载重复的事件地址
	**/
    loadRepeatEventURL:'calendarEvent/loadRepeatEvents',
	/***
	*创建一个事件地址()
	**/
    createEventURL:'/calendar/servlet/SaveEventServlet',
	/***
	*更新一个事件地址()
	**/
    updateEventURL:'/calendar/servlet/SaveEventServlet',
	/***
	*删除一个事件地址()
	**/
    deleteEventURL:'/calendar/servlet/DeleteEventSevlet',
	/***
	*删除已回复事件地址()
	**/
    deleteRepeatEventURL:'calendarEvent/deleteRepeatEvent',
	
	/**
	*修改事件时间
	*/
    changeDayURL:'calendarEvent/updateDayEvents',
	/**
	*删除事件时间
	*/
    deleteDayURL:'calendarEvent/deleteDayEvents',
	/**
	*加载设置
	*/
    loadSettingURL:'calendarSetting/list',
	/**
	**更新设置
	*/
    updateSettingURL:'calendarSetting/update',

    createUpdateRepeatEventURL:'calendarEvent/createUpdateRepeatEvent',
	/**
	*初使化日历系统的URL地址
	**/
    initialLoadURL:'/calendar/servlet/InitServlet',
	/**
	*查询所有用户
	**/
    listUserURL:'calendar/queryUser'
};