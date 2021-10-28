console.log("Ajax tutorial in one video ");

let fetchBtn = document.getElementById("fetchBtn");

fetchBtn.addEventListener('click', buttonClickHandler);

function buttonClickHandler() {
    // instantiate an xhr object
    console.log('button clicked Fetch Button');
    const xhr = new XMLHttpRequest();
    xhr.open('GET', 'http://api.sunilos.com:9080/ORSP10/College', true);
    xhr.onprogress = function () {
        console.log('On progress... ');
    }
    xhr.onload = function () {
        console.log(this.responseText);
    }
    xhr.send();
}