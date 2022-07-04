
function login(event){
    event.preventDefault()

    let selector = document.querySelector("#user-login");
    if (selector.checked) {
        userLogin();
    } else {
        supplierLogin();
    }
}

async function userLogin(){
    let firstname = document.querySelector("#userName").value;
    let password = document.querySelector("#password").value;
    await fetch(`/restservices/gebruikersApplicatie/${firstname}/${password}`, {method: "GET"})
        .then(response => {
            console.log(response.status)
            if(response.status === 200){
                window.location.assign(`/UserPage.html`);
            } else {
                window.alert("Gebruiker bestaat niet ");
            }
        });
}

async function supplierLogin(){
    let firstname = document.querySelector("#userName").value;
    let password = document.querySelector("#password").value;
    await fetch(`/restservices/aanbiedersApplicatie/${password}/${firstname}`, {method: "GET"})
        .then(response => {
            console.log(response.status)
            if(response.status === 200){
                window.location.assign(`/SupplierPage.html`);
            } else {
                window.alert("Aanbieder bestaat niet");
            }
        });
}

function loginKnop(){
    document.querySelector("#submitLogInButton").addEventListener('click', event => login(event));
}

loginKnop();