<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<body>
<h2>Spring Hello World!</h2>
<center>
<h3>
	<form name="frm" action="<c:url value='set'/>" method="GET">
		Логин: <input type="text" name="username"/><br/>
		Пароль: <input type="password" name="password"/><br/>
		<input type="submit" name="submit" value="Регистрация"/><br/>
	</form>
</h3>
</center>
</body>
</html>