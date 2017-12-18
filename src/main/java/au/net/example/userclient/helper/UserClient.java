package au.net.example.userclient.helper;

import javax.servlet.http.HttpServletRequest;

public class UserClient {
	public final static String getClientIP(HttpServletRequest request) {
        final String xfHeader = request.getHeader("X-Forwarded-For");
        if (xfHeader == null) {
            return request.getRemoteAddr();
        }
        return xfHeader.split(",")[0];
	}
}
