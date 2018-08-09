const adicionaDiv = require("../index.js");

test('adicionar div-to-div', ()=> {

    var novoDiv = document.createElement("div");

    document.body.appendChild(novoDiv);

    var divs = document.getElementsByTagName("div");
    
    expect(divs.length).toEqual(1);

    adicionaDiv();

    expect(divs.length).toEqual(2);
});