import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    this.showSlides();
  }
  
  
 static slideIndex = 0;
 i=0;

showSlides() {
  this.i = 0;
  const slides = document.getElementsByClassName("mySlides");
  const dots = document.getElementsByClassName("dot");
  for (this.i = 0; this.i < slides.length; this.i++) {
    const slide = slides[this.i] as HTMLElement;
    slide.style.display = "none";  
  }
  HomeComponent.slideIndex++;
  if (HomeComponent.slideIndex > slides.length) {
    HomeComponent.slideIndex = 1;
  }    
  for (this.i = 0; this.i < dots.length; this.i++) {
    dots[this.i].className = dots[this.i].className.replace(" active", "");
  }
  const slide = slides[HomeComponent.slideIndex-1] as HTMLElement;
  slide.style.display = "block";

  dots[HomeComponent.slideIndex-1].className += " active";
  
  setTimeout(this.showSlides, 2000);
}

}
