// import LoginService from "./LoginService";

// const form = document.forms['inlogForm'];
// const formData = new FormData(form);
// LoginService.loginTest(formData);

// for(var key of formData.keys()){
//     console.log(key)
// }



function login(event){
    event.preventDefault()

    let selector = document.querySelector("#user-login").value;
    if (selector === 'USER-Login') {
        userLogin();
    } else {
        supplierLogin();
    }
}

function userLogin(){
    let firstname = document.querySelector("#userName").value;
    let password = document.querySelector("#password").value;
    fetch(`/restservices/gebruikersApplicatie/${firstname}/${password}`, {method: "GET"})
        .then(response => {
            console.log(response.status)
            if(response.status === 200){
                window.location.assign(`/UserPage.html`);
            } else {
                window.alert("Gebruiker bestaat niet ");
            }
        });
}

function supplierLogin(){
    let firstname = document.querySelector("#userName").value;
    let password = document.querySelector("#password").value;
    fetch(`/restservices/aanbiedersApplicatie/${firstname}/${password}`, {method: "GET"})
        .then(response => {
            console.log(response.status)
            if(response.status === 200){
                window.location.assign(`/SupplierPage.html`);
            } else {
                window.alert("Gebruiker bestaat niet ");
            }
        });
}

function loginKnop(){
    document.querySelector("#submitLogInButton").addEventListener('click', event => login(event));
}

loginKnop();