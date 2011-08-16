Ext.ns("Ext.ux.calendar");

Ext.ux.calendar.LanManager = {

    addJavaScript:function(lan){
        var flag = true;
        var exist = false;
        var id = 'x-calendar-language';
        var lanel = document.getElementById(id);
        if(lanel){
            if(lanel.name == lan){
                flag = false;
                exist = true;
            }else{
                Ext.get(lanel).remove();
            }
        }
        if(!exist){
            var js = document.createElement('script');
            js.id = id;
            js.name = lan;
            js.setAttribute('type', 'text/javascript');
            var url = Ext.ux.calendar.CONST.CALENDAR_LANGUAGE_PATH+lan+'.js';
            js.setAttribute('src', url);
            document.getElementsByTagName("head")[0].appendChild(js);
        }
        exist = false;
        id = 'ext-language';
        lanel = document.getElementById(id);
        if(lanel){
            if(lanel.name == lan){
                exist = true;
            }else{
                Ext.get(lanel).remove();
            }
        }
        if(!exist){
            js = document.createElement('script');
            js.id = id;
            js.setAttribute('type', 'text/javascript');
            url = Ext.ux.calendar.CONST.EXT_LANGUAGE_PATH+'ext-lang-'+lan+'.js';
            js.setAttribute('src', url);
            document.getElementsByTagName("head")[0].appendChild(js);
        }
        return flag;
    }
};