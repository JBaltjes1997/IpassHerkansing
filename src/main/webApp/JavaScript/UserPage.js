

const formButton = document.getElementById('dezeButton');
const dezeForm = document.getElementById('hulpvraagform');

formButton.addEventListener('click', () => {
    if (dezeForm.style.display === 'none') {
        dezeForm.style.display = 'block';
    } else {
        dezeForm.style.display = 'none';
    }
});

