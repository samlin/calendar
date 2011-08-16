
Ext.ns('Ext.ux.calendar');
Ext.ux.calendar.CommentTip = Ext.extend(Ext.Tip, {
    closable:true,
    closeAction:'hide',    
    showTip:function(title, text, bEl, pos, during){
        this.setTitle(title);
        if(this.rendered){
            this.body.update(text);
        }else{
            this.html = text;
        }
        this.showBy(bEl, pos);
        during = during || 5000;
        (function(){
            this.hide();
        }).defer(during, this);
    }    
});