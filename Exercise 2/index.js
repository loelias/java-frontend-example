function adicionaDiv() {
        var divList = document.getElementsByTagName("div");
        
        for (var i = 0; i < divList.length; i++) {
            var novaDiv = document.createElement("div");

        decorarDiv(novaDiv);
        divList[i].appendChild(novaDiv);
        }
    }

    function decorarDiv(div) {
        div.textContent = 'Nova Div';
    }

window.onload = adicionaDiv;

module.exports = adicionaDiv;
