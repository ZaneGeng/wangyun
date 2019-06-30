<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="${pageContext.request.contextPath}/res/js/login.js"></script>
   <meta charset="UTF-8">
   <title>易购登录</title>
</head>
   <style type="text/css">
        #div01{
        background-color:#eac789;
        }
        
        #div02{
        width:1190px;
        height:600px;
        background-image:url(res/images/loginbz3.jpg);
        margin:auto;
        }
        
        #div03{
        width: 350px;
        height:400px;
        background-color: #fff;
        right:300px;
        position: absolute;
        top:100px;
        }
        .loginInput {
    color: #9b9b9b;
    width: 240px;
    font-size: 14px;
    line-height: 18px;
    height: 18px;
    padding: 11px 8px 11px 50px;
    border: 1px solid #CBCBCB;
    margin-top: 20px;
    margin-left: 30px;
   }
   .loginButton {
    width: 300px;
    height: 42px;
    line-height: 42px;
    background-color: #ff0036;
    font-weight: 700;
    font-size: 16px;
    color: #ffffff;
    cursor: pointer;
    border-radius: 3px;
    border: 0;
    margin-top: 20px;
    margin-left: 30px;
}
.loginInputDiv {
    position: relative;
    margin-top: 25px;

}
.loginInputDiv > .loginLabel {
    display: block;
    width: 38px;
    height: 38px;
    line-height: 38px;
    background: #ddd;
    text-align: center;
    position: absolute;
    top: 21px;
    left: 31px;
    font-size: 18px;
}
.passwordInputDiv > .passwordLabel{
    display: block;
    width: 38px;
    height: 38px;
    line-height: 38px;
    background: #ddd;
    text-align: center;
    position: absolute;
    top: 109px;
    left: 31px;
    font-size: 18px;
}

span {
	color: #ffffff;
}
   </style>
<body>
   
   <form action="${pageContext.request.contextPath}/dologin" , Method="post">
     <div id="div01">
         <div id="div02"/>
         <div id="div03">
               <div class="loginInputDiv">
               <label for="name" class="loginLabel">
                <img src="${pageContext.request.contextPath}/res/images/2018-04-27_235518.png" />
               </label>
              <input type="text"  id="name" class="loginInput" name="user_name"  placeholder="会员名/邮箱/手机号"><p id="login#" hidden="hidden">请输入用户名</p>
              </div>
              
              <div class="passwordInputDiv">
              <label for="name" class="passwordLabel">
                <img src="${pageContext.request.contextPath}/res/images/2018-04-27_235533.png" />
               </label>
              <input type="password" name="user_password" id="password" class="loginInput" placeholder="输入密码">
              </div>
              
              <input type="submit" class="loginButton" value="登 录">
              <span>${error}</span>
              <div style="padding-top: 30px;padding-left: 150px">
                  <a href="${pageContext.request.contextPath}/register">注册账户</a>
              </div>
            </div>
     </div>
     </form>
</body>
</html>