<!doctype html>
<html>
<head>
<title>Login</title>
<meta name="layout" content="main" />
</head>
<body>
	<g:form url="[controller:'user',action:'login']">
		<fieldset class="form">
			<h1>Please login</h1>
			<g:if test="${message}">
				<div class="errors">
					${message}
				</div>
			</g:if>
			<p>
				<label for="username">Username</label>
				<g:textField name="username" />
			</p>
			<p>
				<label for="password">Password</label>
				<g:passwordField name="password" />
			</p>
			<fieldset class="buttons">
				<g:submitButton name="loginButton" class="save" value="Login" />
			</fieldset>			
		</fieldset>
	</g:form>
</body>
</html>