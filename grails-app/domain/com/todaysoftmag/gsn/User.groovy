package com.todaysoftmag.gsn

class User {
	String id = UUID.randomUUID().toString()
	String firstName
	String lastName
	String userName
	String password
	
	static hasMany = [messages: Message]

    static constraints = {
		firstName size:3..10, blank:false
		lastName size:3..10, blank:false
		userName size:3..10, blank:false, unique:true
		password size: 3..10, blank: false
    }
	
	String toString() {
		userName
	}
}
