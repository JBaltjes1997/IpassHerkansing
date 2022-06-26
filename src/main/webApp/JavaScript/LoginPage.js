
// function login(event){
//     event.preventDefault()
//     const form = document.forms['inlogForm'];
//     const formData = new FormData(form);
//     LoginService.loginTest(formData);
//
//     for(var key of formData.keys()){
//         console.log(key)
//     }
//
//     let username = document.querySelector('#userName').value;
//     let password = document.querySelector('#password').value;
// }
//
// function loginKnop(){
//     document.getElementById('#submitButton').addEventListener('click', event => login(event));
// }
//
// loginKnop();

function login(event){
    var formData = new FormData(document.querySelector("#inlogForm"));
    var encData = new URLSearchParams(formData.entries());

    fetch("/restservices/authentication", { method: 'POST', body: encData })
        .then(function (response){
            if(response.ok)return response.json();
            else throw "Wrong username/password";
        })
        .then(myJson => window.sessionStorage.setItem("myJWT", myJson.JWT))
        .catch(error => console.log(error));
}