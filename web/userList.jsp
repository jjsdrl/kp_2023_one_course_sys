<%--
  Created by IntelliJ IDEA.
  User: 75084
  Date: 2023/12/20
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>小白兔科技课件管理系统</title>
    <link rel="stylesheet" href="css/public.css"/>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <h1>小白兔科技课件管理系统</h1>
    <div class="publicHeaderR">
        <p><span>下午好！</span><span style="color: #fff21b"> Admin</span> , 欢迎你！</p>
        <a href="login.jsp">退出</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2015年1月1日 11:11  星期一</span>
    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li ><a href="subjectList.jsp">科目管理</a></li>
                <li><a href="studyList.jsp">课件管理</a></li>
                <li><a href="userList.jsp">用户管理</a></li>
                <li><a href="password.jsp">密码修改</a></li>
                <li><a href="login.jsp">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>用户管理页面</span>
        </div>
        <div class="search">
            <span>用户名：</span>
            <input type="text" placeholder="请输入用户名"/>
            <input type="button" value="查询"/>
            <a href="userAdd.jsp">添加用户</a>
        </div>
        <!--用户-->
        <table class="providerTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th width="10%">用户账号</th>
                <th width="20%">真实姓名</th>
                <th width="10%">性别</th>
                <th width="10%">年龄</th>
                <th width="10%">电话</th>
                <th width="10%">用户类型</th>
                <th width="30%">操作</th>
            </tr>
            <tr>
                <td>hanlu</td>
                <td>韩露</td>
                <td>女</td>
                <td>20</td>
                <td>15918230478</td>
                <td>学员</td>
                <td>
                    <a href="userView.jsp"><img src="img/read.png" alt="查看" title="查看"/></a>
                    <a href="userUpdate.jsp"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                    <a href="#" class="removeUser"><img src="img/schu.png" alt="删除" title="删除"/></a>
                </td>
            </tr>
            <tr>
                <td>PRO-COD1</td>
                <td>陈晨</td>
                <td>男</td>
                <td>30</td>
                <td>15918230478</td>
                <td>老师</td>
                <td>
                    <a href="userView.jsp"><img src="img/read.png" alt="查看" title="查看"/></a>
                    <a href="userUpdate.jsp"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                    <a href="#" class="removeUser"><img src="img/schu.png" alt="删除" title="删除"/></a>
                </td>
            </tr>
            <tr>
                <td>admin</td>
                <td>冯小刚</td>
                <td>男</td>
                <td>40</td>
                <td>15918230478</td>
                <td>管理员</td>
                <td>
                    <a href="userView.jsp"><img src="img/read.png" alt="查看" title="查看"/></a>
                    <a href="userUpdate.jsp"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                    <a href="#" class="removeUser"><img src="img/schu.png" alt="删除" title="删除"/></a>
                </td>
            </tr>
            <tr>
                <td colspan="7">
                    当前第1页，6条数据&nbsp;&nbsp;&nbsp;&nbsp;共2页
                    首页
                    尾页
                    上一页
                    下一页
                </td>
            </tr>
        </table>

    </div>
</section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeUse">
    <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该用户吗？</p>
            <a href="#" id="yes">确定</a>
            <a href="#" id="no">取消</a>
        </div>
    </div>
</div>

<footer class="footer">
</footer>

<script src="js/jquery.js"></script>
<script src="js/js.js"></script>
<script src="js/time.js"></script>

</body>
</html>