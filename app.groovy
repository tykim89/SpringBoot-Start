@Grab("thymeleaf-spring4")

@Controller
class App {

	@RequestMapping("/")
	@ResponseBody
	def home(ModelAndView mav) {
		mav.setViewName("home")
		//mav.addObject("msg", "Hello! this is sample page.")
		mav.addObject("msg", "안녕하세요?")
		mav
	}
}