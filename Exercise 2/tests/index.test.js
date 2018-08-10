window.$ = require("../node_modules/jquery/dist/jquery.min.js");
const adicionaDiv = require("../index.js");

test('Teste adicionar div, adiciona a div', () => {
    
    var novaDiv = document.createElement("div");

    document.body.appendChild(novaDiv);


    var divs = document.getElementsByTagName("div");
    expect(divs.length).toEqual(1);

    adicionaDiv();

    expect(divs.length).toEqual(2);
});
