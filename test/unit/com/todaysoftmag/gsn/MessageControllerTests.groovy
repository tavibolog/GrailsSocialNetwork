package com.todaysoftmag.gsn



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(MessageController)
class MessageControllerTests {
	
	def messageController
	
	@Before
	public void setUp() {
		messageController = new MessageController()
	}
		
    void testRedirectOnIndex() {
       messageController.index()
	   
	   assertTrue response.redirectedUrl == "/message/list"
    }
}
