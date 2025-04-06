import { Injectable } from '@angular/core';

const TOKEN="ecom-token";
const USER="ecom-user"l


@Injectable({
  providedIn: 'root'
})
export class UserStorageService {

  constructor() { }
  public saveToken(token:string):void{
    window.localStorage.removeItem(TOKEN);
    window.localStorage.setItem(TOKEN,token);
  }
  public saveUser(user):void{
    window.localStorage.removeItem(TOKEN);
    window.localStorage.setItem(TOKEN,JSON.stringify(user));
  }
}
