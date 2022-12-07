package com.tig.pricecomp.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(String token);

}
