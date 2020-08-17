// ex6
function IMC(peso, altura){
    calculIMC = peso / (altura * altura);

    if(calculIMC > 40) {
        console.log(`Seu IMC foi de ${calculIMC}, você está no nivel Obeso Mórbido`)
    }
    else if(calculIMC > 35) {
        console.log(`Seu IMC foi de ${calculIMC}, você está no nivel Obeso Moderado`)
    }
    else if(calculIMC > 30) {
        console.log(`Seu IMC foi de ${calculIMC}, você está no nivel Obeso Leve`)
    }
    else if(calculIMC > 25) {
        console.log(`Seu IMC foi de ${calculIMC}, você está no nivel Sobrepeso`)
    }
    else if(calculIMC > 18.5) {
        console.log(`Seu IMC foi de ${calculIMC}, você está no nivel Peso Normal`)
    }
    else{
        console.log(`Seu IMC foi de ${calculIMC}, você está no nivel Abaixo do Peso`)
    }
}

IMC(60, 1.55)


// ex7
function MBytesToBytes(Mbytes){
    resultado = Mbytes * 1048.576 
    console.log(`${Mbytes} Megabytes é equivalente a ${resultado} bytes`)
}

MBytesToBytes(200)