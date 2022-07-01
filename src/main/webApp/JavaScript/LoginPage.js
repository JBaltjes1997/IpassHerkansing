// import LoginService from "./LoginService";

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

    let selector = document.querySelector("#user-login").value;
    if (selector === 'USER') {
        console.log(firstname);
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
    fetch(`/restservices/aanbiedersApplicatie/${firstname}/${password}`, {method: "GET"})
        .then(response => {
            console.log(response.status)
            if(response.status === 200){
                window.location.assign(`/UserPage.html`);
            }
        });
}

function loginKnop(){
    document.getElementById('submitLogInButton').addEventListener('click', event => login(event));
}

loginKnop();

const button = document.querySelector("#testButton");
button.addEventListener('click', () => console.log("Gelukt"));