
$(function () {
    $.post({
        url:'user/getAll',
        success:function (data) {

               for(var i=0;i<data.length;i++){

                   var text="  <tr>\n" +
                       "            <th>"+data[i].userId+"</th>\n" +
                       "            <th>"+data[i].name+"</th>\n" +                                 
                       "            <th>"+data[i].email+"</th>\n" +
                       "            <th>"+data[i].uCreateTime+"</th>\n" +
                       "            <th>"+data[i].identity+"</th>\n" +
                       "            <th>"+data[i].status+"</th>\n" +
                       "            <th>"+data[i].password+"</th>\n" +  
                       "            <td>\n" +
                       "                <a href=\"user/delByUserId?userId="+data[i].userId+"\" class=\"btn btn-danger\">删除</a>\n" +
                       "                <a href=\"update.html?userId="+data[i].userId+"\" class=\"btn btn-success\">修改</a>\n" +
                       "            </td>\n" +
                       "        </tr>"
                  var obj= $(".pool");
                   obj.append(text);
               }
        }
    })
});