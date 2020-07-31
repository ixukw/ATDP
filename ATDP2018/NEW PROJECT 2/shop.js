var slideIndex = 0;
slideyshow();

function slideyshow() {
    var i;
    var x = document.getElementsByClassName("sliders");
    for (i = 0; i < x.length; i++) {
      x[i].style.display = "none"; 
    }
    slideIndex++;
    if (slideIndex > x.length) {slideIndex = 1} 
    x[slideIndex-1].style.display = "block"; 
    setTimeout(slideyshow, 1618); 
}