

// function getUsers(){
//     fetch(`http://localhost:8080/restservices/aanbiedersApplicatie`, {
//         method: 'GET'
//     })
//         .then (response => {
//             if (response.status !== 200) {
//                 throw new Error(response);
//         }
//             return true;
//         })
//         .catch(error => {
//             throw error;
//     });
// }
//
// async function doWork(){
//     const response = await getUsers();
//     console.log(response)
// }
// doWork()

// fetch(`http://localhost:8080/restservices/aanbiedersApplicatie`)
// .then(function (response) {
//     return response.json()
// })
// .then(function (data) {
//     console.log('the data', data)
// })

function getSuppliers(response){
    // console.log(response);
    var select = document.getElementById("zoek-aanbieders");
    select.innerHTML = "";
    for(const counter in response){
        console.log(response[counter]);
        var optie = document.createElement('option');
        optie.value = response[counter].naam;
        optie.innerHTML = response[counter].naam + ', ' + response[counter].expertise;
        select.appendChild(optie);
    }
}

const deleteButton = document.querySelector("#deleteButton")
deleteButton.addEventListener("click", () => {
    var wachtwoord=prompt('Ter bevestiging, vul alsjeblieft je wachtwoord hier in: ');
    fetch(`/restservices/gebruikersApplicatie/${wachtwoord}`, {method: "DELETE"})
    //     .then(res => res.text()) // or res.json()
    //     .then(res => console.log(res));
        .then(window.location.assign(`/LoginPage.html`));
        // .then(response => {
        //     // console.log(response.status)
        //     if(response.status === 204){
        //         window.location.assign(`/LoginPage.html`);
        //     }
        // });
})

const logOutButton = document.querySelector("#logOutButton")
logOutButton.addEventListener('click', () => {
    window.location.assign(`/LoginPage.html`);
})