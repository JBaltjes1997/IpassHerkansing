
// function showForm(){
//     if(document.getElementById("#supplier").checked()) {
//         document.style.display = "block";
//     } else {
//         document.style.display = "none";
//     }
// }
//
// showForm();

// const dezeForm = document.getElementById("#testMetMax")
// const dezeRadioButton = document.getElementById("#supplier")
// dezeRadioButton.addEventListener("click", () => {
//         if (dezeRadioButton.click()) {
//             dezeForm.style.display = 'block';
//         } else {
//             dezeForm.style.display = 'none';
//         }
//     })

const box = document.getElementById('testMetMax');

function handleRadioClick() {
    if (document.getElementById('supplier').checked) {
        box.style.display = 'block';
    } else {
        box.style.display = 'none';
    }
}

const radioButtons = document.querySelectorAll('input[name="typeOf"]');
radioButtons.forEach(radio => {
    radio.addEventListener('click', handleRadioClick);
});