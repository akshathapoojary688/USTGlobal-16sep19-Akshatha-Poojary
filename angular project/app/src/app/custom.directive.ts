import { Directive, HostBinding, ElementRef, HostListener } from '@angular/core';


@Directive({
    selector : '[custDir]'
})


 export class customDirective{
    constructor(private el: ElementRef){
        this.el.nativeElement.style.backgroundColor = 'red';
    }
   @HostBinding('style.backgroundColor') backgroundColor = 'yellow';

    @HostListener('mouseenter') mouseEnterEvent() {
        this.el.nativeElement.style.backgroundColor = 'green';

       
    

        
        }
    }
    

