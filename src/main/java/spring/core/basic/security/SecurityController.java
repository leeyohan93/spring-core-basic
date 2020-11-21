package spring.core.basic.security;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SecurityController {

    private final SecurityService securityService;

    @GetMapping("/async-context")
    public String asyncSecurityContextTest() {
        SecurityLogger.log("Controller");
        securityService.asyncSecurityContextTest();
        return "asyncSecurityContextTest";
    }
}
