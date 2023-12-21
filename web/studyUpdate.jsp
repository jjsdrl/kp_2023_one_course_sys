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
        <a href="${pageContext.request.contextPath}/loginOut">退出</a>
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
                <li><a href="${pageContext.request.contextPath}/loginOut">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>课件管理页面 >> 课件资源添加页面</span>
        </div>
        <div class="providerAdd">
            <form action="#">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div>
                    <label for="title">课件资源名：</label>
                    <input type="text" name="title" id="title" value="html新功能"/>
                    <span >*请输入课件资源名</span>
                </div>
                <div>
                    <label>所属科目：</label>

                    <select name="subject">
                        <option value="1">html</option>
                        <option value="2">JavaScript</option>
                        <option value="3">Java</option>
                    </select>
                    <span></span>
                </div>

                <div>
                    <label for="summary">课件简介：</label>
                    <textArea cols="80" rows="4" name="summary" id="summary">
					    
                      增加了播放视频功能
					 </textArea>
                </div>
                <div>
                    <label for="content">课件详情：</label>
                    <textArea cols="80" rows="12" name="content" id="content">
					     <video src="ziliao/Wildlife.wmv" controls="controls">
	  你的浏览器不支持！
	</video>
  <hr/>
  多资源的视频播放
     <video  controls="controls">
	     <source src="" type="video/webm">
		   你的浏览器不支持！
       </video>
					 </textArea>
                </div>
                <div>
                    <label for="fileSrc">课件附件：</label>
                    <input type="file" name="fileSrc" id="fileSrc"/>
                    <span >*请选择文件</span>
                </div>
                <div class="providerAddBtn">
                    <!--<a href="#">保存</a>-->
                    <!--<a href="userList.jsp">返回</a>-->
                    <input type="button" value="保存" onclick="history.back(-1)"/>
                    <input type="button" value="返回" onclick="history.back(-1)"/>
                </div>
            </form>
        </div>

    </div>
</section>
<footer class="footer">
</footer>
<script src="js/time.js"></script>

</body>
</html>
