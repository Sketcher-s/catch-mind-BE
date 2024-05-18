package shop.catchmind.global.config.constant;

import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

public final class AuthenticationProcessingConstant {

    private AuthenticationProcessingConstant() {}
    public static final String DEFAULT_LOGIN_REQUEST_URL = "/api/auth/login";
    public static final String HTTP_METHOD = "POST";
    public static final String CONTENT_TYPE = "application/json";
    public static final String USERNAME_KEY = "email";
    public static final String PASSWORD_KEY = "password";

    public static final AntPathRequestMatcher DEFAULT_LOGIN_PATH_REQUEST_MATCHER =
            new AntPathRequestMatcher(DEFAULT_LOGIN_REQUEST_URL, HTTP_METHOD);
}
