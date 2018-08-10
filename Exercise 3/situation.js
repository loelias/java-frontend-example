function situacaoAnimal(regiao, animal) {
    var animais = document.getElementsByTagName("li");

    for (var i = 0; i < animais.length; i++){
        if(animal === animais[i].attributes["data-animal"].value && regiao === animais[i].parentElement.attributes["regiao"].value){
            var animal = animais[i].innerText;
            return animal;
        }
    }
}
