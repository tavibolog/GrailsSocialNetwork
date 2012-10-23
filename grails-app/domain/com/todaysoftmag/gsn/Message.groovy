package com.todaysoftmag.gsn

class Message {
	String message
	Date date = new Date()
	
	static belongsTo = [user: User]

    static constraints = {
		message size:5..100, blank:false
    }
	
	String toString() {
		message + " on " + date + " by " + user
	}
}
