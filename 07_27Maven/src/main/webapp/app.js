function myFunction() {
    //jsp的方法是先弹窗在加载body
    alert("Hello");
}
$(function () {
    //jquery的方式是当body加载完成后才弹窗
    alert("Hi");
    let data = {
        username : "zss",
        password : "123"
    };
    //jquery的ajax方法，默认是发起异步网络请求
    //{ }包裹起来的表示一个对象,用key : value键值对的格式保存属性
    //ajax传入的参数是一个json对象
    //(1)ajax的异步：之前在执行alert方法如果不点击就会阻塞，但是使用ajax之后在alert的同时就在执行ajax方法
    //(2)ajax的回调：如果执行成功，那么它就会执行success方法，并将json字符进行返回
    $.ajax({
        type : "POST",//请求方法
        contentType: "application/json",//请求数据类型
        url : "data/login.json",//请求路径
        data : JSON.stringify(data),//请求数据,如果数据类型是json类型的对象，需要将其转化为字符串
        //请求成功执行的方法
        success: function (msg) {
            if (msg.success){
                alert(JSON.stringify(msg));
            }else {
                alert("msg==false");
            }
        },error:function (XMLHttpRequest,textStatus,errorThrown) {
            this;//调用本次ajax请求传递的参数
        }
    });
    $.ajax({
        type : "POST",//请求方法
        contentType: "application/json",//请求数据类型
        url : "data/login2.json",//请求路径
        data : JSON.stringify(data),//请求数据,如果数据类型是json类型的对象，需要将其转化为字符串
        //请求成功执行的方法
        success: function (msg) {
            if (msg.success){
                alert(JSON.stringify(msg));
            }else {
                alert("msg==false");
            }
        },error:function (XMLHttpRequest,textStatus,errorThrown) {
            this;//调用本次ajax请求传递的参数
        }
    });
});


