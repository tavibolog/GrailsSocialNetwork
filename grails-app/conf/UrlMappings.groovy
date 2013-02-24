class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
		
		"/login" (controller: "user", action: "login")

		"/"(view:"/user/login")
		"500"(view:'/error')
	}
}
