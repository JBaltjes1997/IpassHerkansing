

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