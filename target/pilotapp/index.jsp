<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<body>
<h2>Spring Hello World!</h2>
<center>
<h3>
	<form name="f" action="<c:url value='/j_spring_security_check'" method="POST">
		Логин: <input type="text" name="j_username"/><br/>
		Пароль: <input type="password" name="j_password"/><br/>
		<input type="submit" name="submit" value="Вход"/><br/>
		<c:if test="${not empty error}">
			<div><h2>Вы ошиблись при вводе пароля. Введите данные заново</h2></div>
		</c:if>
		<div>
			<a href="/registration"></a>
		</div>
	</form>
</h3>
</center>
</body>
</html>
