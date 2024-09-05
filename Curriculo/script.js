var modal = document.getElementById("meuModelo");
var img = document.getElementById("myImg");
var modalImg = document.getElementById("imgModelo");
var span = document.getElementsByClassName("close")[0];

img.onclick = function(){
    modal.style.display = "block";
    modalImg.src = "imagens/imagemgrande.png"; 
}


span.onclick = function() { 
    modal.style.display = "none";
}

window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}