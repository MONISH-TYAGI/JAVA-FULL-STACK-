package com.codeWithProjects.ecom.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.time.*;
import java.util.HashMap;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import java.util.Map;
import java.util.*;
import java.util.function.Function;

@Component
public class JwtUtil {
    public static final String SECRET="53454549759375937590475942795742975942759427957420957425749574957";


    public String generateToken(String userName){
        Map<String,Object> claims=new HashMap<>();
        return createToken(claims,userName);
    }
    public String createToken(Map<String,Object> claims,String userName)
    {
    return Jwts.builder()
            .setClaims(claims)
            .setSubject(userName)
            .setIssuedAt(new Date(System.currentTimeMillis()))
            .setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
            .signWith(getSignkey(), SignatureAlgorithm.ES256).compact();
    }

    private Key getSignkey(){
        byte[]keybytes= Decoders.BASE64.decode(SECRET);
        return Keys.hmacShaKeyFor(keybytes);
    }

    public String extractUsername(String token)
    {
        return extractClaim(token,Claims::getSubject);
    }
    public <T> T extractClaim(String token, Function<Claims,T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }


    private Claims extractAllClaims(String token)
    {
        return Jwts.parserBuilder().setSigningKey(getSignkey()).build().parseClaimsJwt(token).getBody();
    }
    private Boolean isTokenExpired(String token)

    {
        return extractExpiration(token).before(new Date());
    }
    public Date extractExpiration(String token)

    {
        return extractClaim(token,Claims::getExpiration);
    }
    public Boolean validateToken(String token, UserDetails userDetails){
            final String username=extractUsername(token);
            return (username.equals(userDetails.getUsername())&&!isTokenExpired(token));
    }
}
