package com.example.designpattern.behavior.responsibility.filter;

/**
 * ...
 * @author sunyajun
 * @date 2020/4/14 5:17 PM
 */
public interface FilterChain {

    void doFilter(ServletRequest request, ServletResponse response);
}
