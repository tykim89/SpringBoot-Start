@RestController
class App {
	
	@RequestMapping("/")
	def home(){		//리퀘스트 핸들러
		def header = "<html><body>"
		def footer = "</body></html>"
		def content = "<h1>Hello!</h1><p>this is html content.</p>"

		header + content + footer
	}
}