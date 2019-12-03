// 登录注册验证
$(function(){
    // 登录部分 onblur: 光标离开控件，会触发onblur事件
    $("#login-name").blur(function(){
        var re = /^\w{1,20}$/;
        if ( $(this).parent().find( "span" ).length > 0 ) {
            $(this).parent().find( "span" ).remove();
        }
        if ( !re.test( $(this).val() ) ) {
            $(this).after( "<span class='error'>请输入用户名或手机号</span>" );
        }
    });
    $("#login-password").blur(function(){
        var re = /^\w{1,20}$/;
        if ( $(this).parent().find( "span" ).length > 0 ) {
            $(this).parent().find( "span" ).remove();
        }
        if ( !re.test( $(this).val() ) ) {
            $(this).after( "<span class='error'>请输入您的密码</span>" );
        }
    });
    $("#login-form :submit").click(function(){
        $("#login-name").trigger("blur");
        $("#login-password").trigger("blur");
        if ( $("#login-form").find(".error").length > 0 ) {
            return false;
        }
    });

    // 注册部分
    $("#register-name").blur(function(){
        var re = /^\w{1,20}$/;
        if ( $(this).parent().find( "span" ).length > 0 ) {
            $(this).parent().find( "span" ).remove();
        }
        if ( !re.test( $(this).val() ) ) {
            $(this).after( "<span class='error'>用户名</span>" );
        }
    });
    $("#register-phone").blur(function(){
        var re = /^(13\d|15[0-3]|15[4-9]|180|18[6-9])\d{8}$/;
        if ( $(this).parent().find( "span" ).length > 0 ) {
            $(this).parent().find( "span" ).remove();
        }
        if ( !re.test( $(this).val() ) ) {
            $(this).after( "<span class='error'>请输入正确的手机号</span>" );
        }
    });
    $("#register-password").blur(function(){
        var re = /^\w{6,20}$/;
        if ( $(this).parent().find( "span" ).length > 0 ) {
            $(this).parent().find( "span" ).remove();
        }
        if ( !re.test( $(this).val() ) ) {
            $(this).after( "<span class='error'>密码在6~20位之间</span>" );
        }
    });
    $("#register-form :submit").click(function(){
        $("#register-name").trigger("blur");
        $("#register-password").trigger("blur");
        if ( $("#register-form").find(".error").length > 0 ) {
            return false;
        }
    });









});
