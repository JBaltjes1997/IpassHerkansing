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


function check_nieuw_account(event){
    event.preventDefault();
    let selector = document.querySelector("#user");
    if (selector.checked) {
        console.log('gebruiker');
        createNewUserProfile();
    } else {
        console.log('aanbieder');
        createNewSupplierProfile();
    }
}

function createNewUserProfile(){
    var firstname = document.querySelector("#fname").value;
    var lastname = document.querySelector("#lname").value;
    var password = document.querySelector("#password").value;

    fetch(`/restservices/gebruikersApplicatie/${firstname}/${lastname}/${password}`, {method: "POST"})
        .then(response => {
            console.log(response.status)
            if(response.status === 200){
                window.location.assign(`/UserPage.html`);
            } else {
                window.alert("Deze gebruiker-wachtwoord combinatie bestaat al");
            }
        });
}

function createNewSupplierProfile(){
    var firstname = document.querySelector("#fname").value;
    var lastname = document.querySelector("#lname").value;
    var password = document.querySelector("#password").value;
    var specialisme = document.querySelector("#specialty").value;

    fetch(`/restservices/aanbiedersApplicatie/${firstname}/${lastname}/${password}/${specialisme}`, {method: "POST"})
        .then(response => {
            console.log(response.status)
            if(response.status === 200){
                window.location.assign(`/SupplierPage.html`);
            } else {
                window.alert("Deze gebruiker-wachtwoord combinatie bestaat al");
            }
        });
}

function createKnop(){
    document.querySelector("#submitProfileButton").addEventListener('click', event => check_nieuw_account(event));
    // document.getElementById('submitTestButton').addEventListener('click', () => console.log("gelukt"));
}

createKnop();