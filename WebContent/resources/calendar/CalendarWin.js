Ext.ns('Ext.ux.calendar');
Ext.ux.calendar.CalendarWin = Ext.extend(Ext.Window, {    	    
    initComponent: function(){        
        this.mainPanel = new Ext.ux.calendar.MainPanel({
        	datasource:this.datasource,
            calendarSetting:this.calendarSetting,
            userId:this.userId
        });
        Ext.ux.calendar.CalendarWin.superclass.initComponent.call(Ext.apply(this, {            
            layout:'fit',
            items:[this.mainPanel]
        }));                        
    } 
});