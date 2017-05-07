package hello.filter.versions;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class HeaderVersionFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		final String header = request.getHeader(VersionsAcceptable.HEADER_NAME);
		if (null == header || header.isEmpty()) {
			MutableHeaderHttpServletRequest mutableRequest = new MutableHeaderHttpServletRequest(request);
			mutableRequest.putHeader(VersionsAcceptable.HEADER_NAME, VersionsAcceptable.NOT_FOUND_VERSION_NUMBER);
			filterChain.doFilter(mutableRequest, response);
		} else {
			filterChain.doFilter(request, response);
		}
	}
}
