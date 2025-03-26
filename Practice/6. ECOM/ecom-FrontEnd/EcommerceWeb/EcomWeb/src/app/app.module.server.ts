import { NgModule } from '@angular/core';
import { ServerModule } from '@angular/platform-server';
import { AppComponent } from './app.component';
import { AppModule } from './app.module';
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
import { MatButtonModule } from '@angular/material/button';
// Import Angular Material modules
import { MatToolbarModule } from '@angular/material/toolbar';
@NgModule({
  imports: [AppModule, ServerModule,MatSlideToggleModule, MatToolbarModule,],
  bootstrap: [AppComponent],
})
export class AppServerModule {}
