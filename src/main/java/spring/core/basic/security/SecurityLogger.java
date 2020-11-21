package spring.core.basic.security;

import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityLogger {
    public static void log(final String message) {
        System.out.println("Location: " + message);
        System.out.println("Thread: " + Thread.currentThread().getName());
        System.out.println("Principal: " + SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
    }
}
