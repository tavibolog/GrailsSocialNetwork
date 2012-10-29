package com.todaysoftmag.gsn



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(UserController)
@Mock(User)
class UserControllerTests {
	def userController
	
	@Before
	public void setUp() {
		userController = new UserController()
	}

	    
	void testWrongUserNameOrPassword() {
		request.method = "POST"
		params.username = "notfound"
		
		// create a user in our data store
		def user = new User(firstName: "John", lastName: "Doe", userName: "jdoe", password: "passwd")
		mockDomain(User, [user])
		
		userController.login()
		
		assertTrue view == "/user/login"
		assertTrue model.message == "Wrong username or password!"		
	}
	
	void testLoginWithSuccess() {
		request.method = "POST"
		params.username = "jdoe"
		params.password = "passwd"
		
		// create a user in our data store
		def user = new User(firstName: "John", lastName: "Doe", userName: "jdoe", password: "passwd")
		mockDomain(User, [user])
		
		userController.login()
		
		assertTrue response.redirectedUrl == "/message/list"
		assertTrue session.user.userName == "jdoe"
	}
}
