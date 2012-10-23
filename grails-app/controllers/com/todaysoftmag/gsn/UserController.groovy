package com.todaysoftmag.gsn

class UserController {
	def index() {
		redirect(controller: "message", action: "list", params: params)
	}
	def login() {
		if (request.get) {
			return
		}
		def u = User.findByUserName(params.username)
		if (u) {
			if (u.password == params.password) {
				session.user = u
				redirect(controller: "message", action: "list")
			}
		}
		render(view: "login", model: [message: "Wrong username or password!"])		
	}
}
