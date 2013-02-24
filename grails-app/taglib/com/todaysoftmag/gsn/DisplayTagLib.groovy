package com.todaysoftmag.gsn

class DisplayTagLib {
	static namespace = "display"
	
	def greetings = {attrs ->
		if (session && session.user) {
			out << "<div id=\"login\">Hello, " + session.user + "!</div>"
		} else {
			out << g.link(controller: "user", action: "login"){"not signed in"}
		}
	}
	
}
