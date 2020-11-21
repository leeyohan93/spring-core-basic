package spring.core.basic.security;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {

    @Async
    public void asyncSecurityContextTest() {
        SecurityLogger.log("SecurityService");
    }
}
