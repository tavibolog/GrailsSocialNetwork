<!doctype html>
<html>
<head>
<meta name="layout" content="main">
<title>Create Message</title>
</head>
<body>
	<div class="nav" role="navigation">
	    <g:if test="${session?.user}"><div id="login">Hi ${session.user}</div></g:if>
		<ul>
			<li><g:link class="list" action="list">Messages</g:link></li>
		</ul>
	</div>
	<div id="create-message" class="content scaffold-create" role="main">
		<h1>Create Message</h1>
		<g:hasErrors bean="${message}">
			<ul class="errors" role="alert">
				<g:renderErrors bean="${message}" />
			</ul>
		</g:hasErrors>
		<g:form action="save">
			<fieldset class="form">
				<p>
					<label for="username">Message</label>
					<g:textField name="message" value="${message?.message}"
						class="${hasErrors(bean:message,field:'message','errors')}" />					
				</p>
			</fieldset>
			<fieldset class="buttons">
				<g:submitButton name="create" class="save" value="Post message" />
			</fieldset>
		</g:form>
	</div>
</body>
</html>
