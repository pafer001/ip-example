/*
ip地址转int
*/
$.IpToInt = function (ip) {
    var REG = /^(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$/;
    var result = REG.exec(ip);
    if (!result) return "";

    return (parseInt(result[1]) << 24
        | parseInt(result[2]) << 16
        | parseInt(result[3]) << 8
        | parseInt(result[4])) >>> 0;
}

String.prototype.padLeft = function (padChar, width) {
    var ret = this;
    while (ret.length < width) {
        if (ret.length + padChar.length < width) {
            ret = padChar + ret;
        }
        else {
            ret = padChar.substring(0, width - ret.length) + ret;
        }
    }
    return ret;
};

String.prototype.padRight = function (padChar, width) {
    var ret = this;
    while (ret.length < width) {
        if (ret.length + padChar.length < width) {
            ret += padChar;
        }
        else {
            ret += padChar.substring(0, width - ret.length);
        }
    }
    return ret;
};

String.prototype.startWith = function (str) {
    var reg = new RegExp("^" + str);
    return reg.test(this);
}

String.prototype.endWith = function (str) {
    var reg = new RegExp(str + "$");
    return reg.test(this);
}

//页面加载完成
$(function () {

    //
    //console.log("ip33.com为您提供最优质的在线工具~~~");

    //复制
    var es = $("[copy]");
    for (var i = 0; i < es.length; i++) {
        $(es[i]).click(function () {
            var copy = $(this).attr("copy");
            $(copy).focus();
            $(copy).select();
            document.execCommand("Copy", false, null);
        });
    }

});


//反射服务器方法
$.Invoke = function () {

    //接口地址
    var api = "//api.ip33.com/";

    //控制器
    var contoller = arguments[0];

    //方法
    var action = arguments[1];

    //参数
    var args = arguments[2];

    //回调函数
    var fun = arguments[3];

    //拼接url
    var url = api + contoller + "/" + action;

    //提交数据
    $.ajax({
        type: "GET",
        url: url,
        data : args,
        dataType: "json",
        success: fun
    });
}
