package com.todaysoftmag.gsn

class Message {
	String message
	Date date = new Date()
	
	static belongsTo = [user: User]

    static constraints = {
		message size:5..100, blank:false, validator: {val, obj -> obj.messageValidator(val)}
    }
	
	String toString() {
		message + " on " + date + " by " + user
	}
	
	private messageValidator(val) {
		if (val.toLowerCase().contains("test")) {
			return "test.is.not.allowed"
		}
		return true
	}
}
