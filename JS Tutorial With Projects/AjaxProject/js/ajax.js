console.log("Ajax tutorial");

let fetchBtn = document.getElementById("fetchBtn");

fetchBtn.addEventListener('click', buttonClickHandler)

function buttonClickHandler() {
    const xhr = new XMLHttpRequest();
    xhr.open('GET', 'yash.txt', true);
    xhr.onprogress = function () {
        console.log("on progress....");

    }
    xhr.onload = function () {
        let obj = JSON.parse (this.responseText);
        console.log(obj);
    }
    xhr.send(); 
    console.log("we are done fetching.");
}