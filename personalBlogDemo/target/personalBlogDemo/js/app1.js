$(function () {
    //jquery中通过$("#id")获取dom元素
    $("#login_form").submit(function () {
        //ajax自己发起请求
        //ajax自己发请求
        $.ajax({
            url: "../register",//请求的服务路径
            type: "post",//请求方法
            // contentType: "",//请求的数据类型：请求头Content-Type，默认表单格式，json需要指定为json
            data: $("#login_form").serialize(),//请求数据：使用序列化表单的数据
            dataType: "json",//响应的数据类型：使用json要指定
            success: function (r) {//响应体json字符串，会解析为方法参数
                if(r.success){
                    //前端页面url直接跳转某个路径
                    window.location.href = "../jsp/articleList.jsp";
                }else{
                    alert("错误码："+r.code+"\n错误消息："+r.message)
                }
            }
        })

        //统一不执行默认的表单提交
        return false;
    })
})