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
    var selector = document.querySelector("#user").value;
    if (selector === 'USER') {
        console.log("hoi");
        var firstname = document.querySelector("#fname").value;
        var lastname = document.querySelector("#lname").value;
        var password = document.querySelector("#password").value;

        console.log(firstname);

        fetch(`/restservices/gebruikersApplicatie/${firstname}/${lastname}/${password}`, {method: "POST"})
            .then(response => {
                console.log(response.status)
                if(response.status === 200){
                    window.location.assign(`/UserPage.html`);
                }
            });
    } else {
        console.log("Niet gelukt")

        // var firstname = document.querySelector("#fname").value;
        // var lastname = document.querySelector("#lname").value;
        // var password = document.querySelector("#password").value;
        // var specialty = document.querySelector("#specialty").value;
        //
        // fetch(`/restservices/ProgrammersForHire/${naam}/${wachtwoord}/${expertise}`, {method: "POST"})
        //     .then(response => {
        //
        //         if(response.status === 200){
        //             window.location.assign(`/SupplierPage.html`);
        //         }
        //     });
    }
}

function createKnop(){
    document.querySelector("#submitProfileButton").addEventListener('click', event => check_nieuw_account(event));
    // document.getElementById('submitTestButton').addEventListener('click', () => console.log("gelukt"));
}

createKnop();
