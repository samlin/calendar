日历系统添加操作返回数据格式为:
{success:true,id:'操作ID'} 数据操作成功时，把操作成功的ID返回给客记端
如果失败则返回{success:false}

删除操作时，如果操作成功，返回数据
{success:true}
失败
{success:false}

加载数据格式为:方法有loadEvents 和 loadCalendar
{total:'总记录',data:[数据]}