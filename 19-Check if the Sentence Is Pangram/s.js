var checkIfPangram = function (sentence) {
    const alphabet = 'abcdefghijklmnopqrstuvwxyz';
    for (let i = 0; i < alphabet.length; i++) {
        if (sentence.indexOf(alphabet[i]) === -1) {
            return false;
        }
    }
};


      
