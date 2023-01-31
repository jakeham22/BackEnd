//package penterest_spring.demo.web.controller;
//
//import lombok.AllArgsConstructor;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import penterest_spring.demo.core.account.application.LoginService;
//import penterest_spring.demo.core.account.domain.UserInfoDto;
//
//@RestController
//@RequestMapping("api/user/")
//@AllArgsConstructor
//public class LoginController {
//    private LoginService loginService;
//    private UserInfoDto userInfoDto;
//
//    // 초기페이지로 돌아가기 위한 메서드
//    @GetMapping
//    public String index() {
//        return "home/index"; // TODO :초기 경로같은데 확인해 봐야할듯 config랑 동일해야하는지
//    }
//
//    /**
//     *
//     * @param model security의 기본 class
//     * @return
//     */
//    @GetMapping("/signup/member/signupForm")
//    public String signupForm(Model model) {
//        model.addAttribute("member", userInfoDto);
//
//        return "/member/signupForm";
//    }
//
//    @PostMapping("/signup")
//    public String signup(UserInfoDto userInfoDto) {
//        loginService.signUp(userInfoDto);
//
//        return "redirect:/";
//    }
//
//    @GetMapping("/login")
//    public String login() {
//        return "/member/loginForm";
//    }
//}
