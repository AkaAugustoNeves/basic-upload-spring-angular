import { Component } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

  constructor(private appService: AppService) {}
  formData: FormData = new FormData();

  inputFileChange(event: any) {
    if (event.target.files && event.target.files[0]) {
      const arquivo = event.target.files[0];
      this.formData.append('arquivo', arquivo);

    }
  }

  async upload(){
    await this.appService.upload(this.formData).subscribe(result=>{
      console.log(result);
    },err=>{
      console.log(err);
    })
  }
}
