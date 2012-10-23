package com.todaysoftmag.gsn

class MessageController {
	static allowedMethods = [save: "POST"]
	def index() {
		redirect(action: "list", params: params)
	}
    def list() {
		def allMessages = Message.list()
		def myMessages = Message.findAllByUser(session.user)
		
		[allMessages: allMessages, myMessages: myMessages]
	}
	
	def create() {
		[message: new Message(params)]
	}
	
	def save() {
		def message = new Message(params)		
		def user = User.findById(session.user.id)	
		user.addToMessages(message)		
		
		if (!message.validate()) {
			render(view: "create", model: [message:message])
			return
		}
		
		if (!user.save(flush:true)) {
			render(view: "create", model: [message: message])
		}else{
			flash.message = "Message posted with success!" 
			redirect(action: "list")
		}
	}
}
