import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Product, ProductContent } from './types/products.reponse.model';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
  host: {ngSkipHydration: 'true'},
})
export class AppComponent {
  title = 'client-app1';

  products:Product[]=[];
  constructor(private httpClient:HttpClient) {
  }

   loadProducts(){
      console.log("loading products");
      this.httpClient.get<ProductContent>('http://localhost:9090/products').subscribe((productContent)=>{
         console.log(productContent)      
        this.products=productContent.content
      })

  }
}
