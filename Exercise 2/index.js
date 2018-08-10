function adicionaDiv() {
    var divList = $("body").find("div");
    
    divList.each(function(){
        var novaDiv = $("<div><div>");

        decorarDiv(novaDiv);
        $(this).append(novaDiv);
    });
    
}

function decorarDiv(div) {
    div.text('Nova Div');
}

$(document).ready(function(){
    adicionaDiv();
});

module.exports = adicionaDiv;
