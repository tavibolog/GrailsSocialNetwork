<!doctype html>
<html>
<head>
<meta name="layout" content="main">
<title>List Messages</title>
</head>
<body>
	<div class="nav" role="navigation">	    	    
		<ul>
			<li><g:link class="create" action="create">New Message</g:link></li>
		</ul>
	</div>
	<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
	<div id="list-messages" class="content scaffold-list" role="main">				
		<table>
			<thead>
				<tr>
					<td>Your Posts</td>
					<td>All Posts</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><g:each in="${myMessages}" var="message">
							<div>${message.toString()}</div>
						</g:each></td>
					<td><g:each in="${allMessages}" var="message">
							<div>
								${message.toString()}
							</div>
						</g:each></td>
				</tr>				
			</tbody>
		</table>
	</div>
</body>
</html>
