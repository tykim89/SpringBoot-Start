@Grab("thymeleaf-spring4")

@Controller
class App {

	@RequestMapping("/")
	@ResponseBody
	def home(ModelAndView mav) {
		mav.setViewName("home")
		//mav.addObject("msg", "Hello! this is sample page.")
		mav.addObject("msg", "\uc548\ub155\ud558\uc138\uc694?")
		mav
	}
}
