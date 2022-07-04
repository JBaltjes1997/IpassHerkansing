
const deleteButton = document.querySelector("#deleteButton")
deleteButton.addEventListener("click", () => {
    let wachtwoord=prompt('Ter bevestiging, vul alsjeblieft je wachtwoord hier in: ');
    fetch(`/restservices/gebruikersApplicatie/${wachtwoord}`, {method: "DELETE"})
        .then(window.location.assign(`/LoginPage.html`));
})

const logOutButton = document.querySelector("#logOutButton")
logOutButton.addEventListener('click', () => {
    window.location.assign(`/LoginPage.html`);
})

const confirmAlterButton = document.querySelector("#confirmUpdate");
confirmAlterButton.addEventListener('click', () => alterProfile());


async function alterProfile(){
    let current_firstname = document.querySelector("#current_name").value;
    let new_firstname = document.querySelector("#new_name").value;
    let lastname = document.querySelector("#lname").value;
    let password = document.querySelector("#password").value;

    console.log("data entries gelukt")

    await fetch(`/restservices/gebruikersApplicatie/${current_firstname}/${new_firstname}/${lastname}/${password}`,
        {method: "PUT"})
        .then(response => {
            console.log(response.status)
            if(response.status === 200){
                window.location.assign(`/UserPage.html`);
            } else {
                window.alert("De gebruiker die je ingevuld hebt bestaat niet");
            }
        });
}


// const box = document.getElementById('specialtyInput');
//
// function getSuppliers(response){
//     var select = document.getElementById("zoek-aanbieders");
//     select.innerHTML = "";
//     for(const counter in response){
//         console.log(response[counter]);
//         var optie = document.createElement('option');
//         optie.value = response[counter].naam;
//         optie.innerHTML = response[counter].naam + ', ' + response[counter].expertise;
//         select.appendChild(optie);
//     }
// }