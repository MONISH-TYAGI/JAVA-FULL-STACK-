import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AuthService } from '../services/auth/auth.service';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: false,
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit{


 
  loginForm: FormGroup = new FormGroup({}); // ✅ Ensure initialization
  hidePassword = true;
  constructor(
  private formBuilder:FormBuilder,
  private authService:AuthService,
  private snackBar:MatSnackBar,
  private router:Router
  ) {}

  ngOnInit():void{
    this.loginForm=this.formBuilder.group({
      email:[null,[Validators.required]],
      password:[null,[Validators.required]],
    })
  }

  togglePasswordVisibility(){
    this.hidePassword=!this.hidePassword;
  }
  onSubmit():void{

    if (this.loginForm.invalid) {
      this.snackBar.open('Please fill all fields', 'OK', { duration: 5000 });
      return;
    }
    const username = this.loginForm.get('email')!.value;
    const password = this.loginForm.get('password')!.value;

    this.authService.login(username,password).subscribe(
      ()=>{
        this.snackBar.open('Login Success','OK',{duration:5000});
        this.router.navigate(['/dashboard']); 
      },
      ()=>{
        this.snackBar.open('Bad Credentials','ERROR',{duration:5000});
      }
    )
  }
}
