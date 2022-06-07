
const box = document.getElementById('specialtyInput');

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