const blockChain = require('./model/blockchain');

let myBlockChain = new blockChain(4);

myBlockChain.addBlock('Teste');

console.log(myBlockChain.blocks);
