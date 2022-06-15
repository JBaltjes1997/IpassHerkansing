// function myFunction() {
//     var x = document.getElementById("hulpvraagform");
//     if (x.style.display === "none") {
//         x.style.display = "block";
//     } else {
//         x.style.display = "none";
//     }
// }

const formbutton = document.getElementById("#hulpvraagform");
formbutton.addEventListener('click', () => {
    if (formbutton.style.display === "none") {
        formbutton.style.display = "block";
    } else {
        formbutton.style.display = "none";
    }
});