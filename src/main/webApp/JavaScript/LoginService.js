const BASE = "/restservices/";

export default class loginService{
    static loginTest(formData){
        var encData = new URLSearchParams(formData.entries());
        return fetch(`${BASE}/intro`, {
            method: "POST",
            body: encData,
        })
    }
}
