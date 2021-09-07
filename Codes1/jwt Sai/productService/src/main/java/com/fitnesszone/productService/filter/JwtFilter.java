package com.fitnesszone.productService.filter;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.GenericFilterBean;



public class JwtFilter extends GenericFilterBean{

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		final HttpServletRequest request=(HttpServletRequest) servletRequest;
		final HttpServletResponse response=(HttpServletResponse) servletResponse;
		
		String authHeader=request.getHeader("Authorization");
		if(request.getMethod().equals("OPTIONS")) {
			response.setStatus(HttpServletResponse.SC_OK);
			chain.doFilter(request, response);
		}else if(authHeader==null|| !authHeader.startsWith("Bearer ")){
			throw new ServletException("Missing or invalid token");
			
		}
		String token=authHeader.substring(7);

        Claims claim= Jwts.parser().setSigningKey("mySecret").parseClaimsJwt(token)
                .getBody();

        request.setAttribute("claims", claim);
        chain.doFilter(request, response);
		
	}

}
