<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<body>
<h2>Spring Hello World!</h2>
<center>
<h3>
	<form name="frm" action="<c:url value='login'/>" method="POST">
		Логин: <input type="text" name="username"/><br/>
		Пароль: <input type="password" name="password"/><br/>
		<input type="submit" name="submit" value="Вход"/><br/>
		<c:if test="${not empty error}">
			<div><h2>Вы ошиблись при вводе пароля. Введите данные заново</h2></div>
		</c:if>
		<div>
			<a href="<c:url value='registration'/>">Регистрация</a>
		</div>
		<input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
	</form>
</h3>
</center>
</body>
</html>
