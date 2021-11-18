console.log("this is ajax.js");
let fetchBtn = document.getElementById("fetchBtn");
fetchBtn.addEventListener('click', buttonHandler);
function buttonHandler() {
    console.log("fetch button clicked");
    const xhr = new XMLHttpRequest();
    xhr.open('GET', 'https://dummy.restapiexample.com/api/v1/employees', true);
    xhr.onprogress = function () {
        console.log("On progress!!");
    }
    xhr.onload = function () {
        console.log(this.responseText);
    }
    xhr.send();
}