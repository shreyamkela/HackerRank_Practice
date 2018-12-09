'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the reverseString function
 * Use console.log() to print to stdout.
 */
function reverseString(s) {
    var temp = "";
    try {
        var a = s.split(""); //split the string at each character as "" used
        //console.log(a);
        var b = a.reverse(""); //reverse all elements in the array as "" used
        //console.log(b);
        var c = b.join(""); //join all elements in the array as "" used and form a string
        //console.log(c);
        s = c; //assign reversed string to s
	//If there is error, this new s is not printed and the initial s is printed by finally
	//If there is no error, this new s is printed 
    }
    catch (ex) {
        console.log(ex.message);
        
    }
    finally {
        console.log(s);
    }
    
}

