@RestController
class App {
	
	@RequestMapping("/")
	def home(){		//리퀘스트 핸들러
		"Hello!"
	}
}