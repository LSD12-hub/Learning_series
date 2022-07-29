const displayedImage = document.querySelector('.displayed-img');
const thumbBar = document.querySelector('.thumb-bar');

const btn = document.querySelector('button');
const overlay = document.querySelector('.overlay');

/* Declaring the array of image filenames */
const images = ["pic1.jpg", "pic2.jpg", "pic3.jpg", "pic4.jpg", "pic5.jpg"]

/* Looping through images */
for ( let i = 0; i < images.length; i++ ) {
    // const element = array[i];
    const newImage = document.createElement('img');
    newImage.setAttribute( 'src', "images/" + images[i] );
    newImage.addEventListener( "click" , function(){
        displayedImage.setAttribute( "src", this.src )
    });
    thumbBar.appendChild( newImage );
}

/* Wiring up the Darken/Lighten button */
btn.addEventListener( "click", function() {

    if (overlay.style.backgroundColor == "rgba(0, 0, 0, 0)") {
        overlay.style.backgroundColor = "rgba(0, 0, 0, 0.5)";
    } else {
        overlay.style.backgroundColor = "rgba(0, 0, 0, 0)";
    }
});

