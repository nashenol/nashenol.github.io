const main = document.body;

let time = new Date();
let item = document.createElement("h2");
item.textContent = "Today is " + time;
item.classList.add("centerCustom");
item.oncopy = function(event) {
  alert("I know you copied me");
};
main.appendChild(item);

let count = 0;

let button1 = document.createElement("button");
button1.textContent = "stuff";
button1.onclick = function() {
  console.log("Hello World!!");
  let button2 = document.createElement("button");
  button2.textContent = count++;
  button2.onclick = function(event) {
    console.log(event.srcElement.innerText);
  };
  main.appendChild(button2);
};
main.appendChild(button1);
