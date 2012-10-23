import com.todaysoftmag.gsn.Message
import com.todaysoftmag.gsn.User

class BootStrap {

    def init = { servletContext ->
		def user1 = new User(firstName: "John", lastName: "Doe", userName: "jdoe", password: "passwd")
		def user2 = new User(firstName: "Joanne", lastName: "Doe", userName: "jodoe", password: "passwd")		
		
		user1.addToMessages(new Message(message: "Good morning!"))
		user1.addToMessages(new Message(message: "Nice movie: Skyfall!"))
		
		user2.addToMessages(new Message(message: "Waiting for the summer..."))
		
		user1.save(failOnError:true)		
		user2.save(failOnError:true)
		
    }
    def destroy = {
    }
}
