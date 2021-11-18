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
        console.log("inside onload....");
        let obj = JSON.parse (this.responseText);
        console.log(obj);
        let list = document.getElementById('list');
	        str = "";
	        for(key in obj){
	        	str+=`<li> ${obj[key]} </li>` ;
	        }
	        list.innerHTML= str;
    }
    xhr.send(); 
    console.log("we are done fetching.");
}