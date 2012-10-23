package com.todaysoftmag.gsn

class SecurityFilters {

	def filters = {
		loginCheck(controller: '*', action: '*') {
			before = {
				if (!session.user && actionName != "login") {
					redirect(controller: "user", action: "login")
					return true
				}
			}
		}
	}
}
