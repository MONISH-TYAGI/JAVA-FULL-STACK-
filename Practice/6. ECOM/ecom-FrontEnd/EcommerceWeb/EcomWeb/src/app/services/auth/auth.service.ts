import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {  map, Observable } from 'rxjs';


const BASIC_URL="http://localhost:8080/"
@Injectable({
  providedIn: 'root'
})
export class AuthService {
  userStorageService: any;

  constructor(private http:HttpClient) { }

  
  register(signupRequest:any):Observable<any>{
     return this.http.post(BASIC_URL+"sign-up",signupRequest);
  }

  login(username:string,password:string):any{
    const headers=new HttpHeaders().set('Content-Type','application/json');
    const body={username,password};
    return this.http.post(BASIC_URL+'authentic', body,{headers,observe:'response'}).pipe(
      map((res)=>{
        const authHeader = res.headers.get('authorization');
        const token = authHeader ? authHeader.substring(7) : null;
        const user=res.body;
        if(token&& user)
        {
          this.userStorageService.saveToken(token);
          this.userStorageService.saveUser(user);
          return ;
        }
        return false;
      })

    )
  }
}
