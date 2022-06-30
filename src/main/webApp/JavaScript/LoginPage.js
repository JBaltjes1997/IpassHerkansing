import LoginService from "./LoginService";

function login(event){
    event.preventDefault()
    const form = document.forms['inlogForm'];
    const formData = new FormData(form);
    // LoginService.loginTest(formData);

    for(var key of formData.keys()){
        console.log(key)
    }

    var firstname = document.querySelector("#fname").value;
    var password = document.querySelector("#password").value;

    var selector = document.querySelector("#user").value;
    if (selector === 'USER') {

        fetch(`/restservices/gebruikersApplicatie/${firstname}/${password}`, {method: "POST"})
            .then(response => {
                console.log(response.status)
                if(response.status === 200){
                    window.location.assign(`/UserPage.html`);
                }
            });
    } else {
        fetch(`/restservices/anbiedersApplicatie/${firstname}/${password}`, {method: "POST"})
            .then(response => {
                console.log(response.status)
                if(response.status === 200){
                    window.location.assign(`/UserPage.html`);
                }
            });
    }


    // let username = document.querySelector('#userName').value;
    // let password = document.querySelector('#password').value;
}

function loginKnop(){
    document.getElementById('#submitButton').addEventListener('click', event => login(event));
}

loginKnop();



