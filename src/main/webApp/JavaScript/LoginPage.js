import LoginService from "./LoginService";

// const form = document.forms['inlogForm'];
// const formData = new FormData(form);
// LoginService.loginTest(formData);

// for(var key of formData.keys()){
//     console.log(key)
// }

let firstname = document.querySelector("#userName").value;
let password = document.querySelector("#password").value;

function login(event){
    event.preventDefault()

    var selector = document.querySelector("#user").value;
    if (selector === 'USER') {
        userLogin();
    } else {
        supplierLogin();
    }
}

function userLogin(){
    fetch(`/restservices/gebruikersApplicatie/${firstname}/${password}`, {method: "GET"})
        .then(response => {
            console.log(response.status)
            if(response.status === 200){
                window.location.assign(`/UserPage.html`);
            }
        });
}

function supplierLogin(){
    fetch(`/restservices/anbiedersApplicatie/${firstname}/${password}`, {method: "GET"})
        .then(response => {
            console.log(response.status)
            if(response.status === 200){
                window.location.assign(`/UserPage.html`);
            }
        });
}

function loginKnop(){
    document.getElementById('#submitButton').addEventListener('click', event => login(event));
}

loginKnop();
