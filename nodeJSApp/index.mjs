import * as Shared from './../shared/build/compileSync/js/main/productionExecutable/kotlin/MultiPlatformLibrary-shared.js';

// Access the correct path
const Greeting = Shared.default.com.jetbrains.multiplatformlibrary.Greeting;


// console.log('Greeting() object from shared code');  // ✅ Should work now!
console.log(new Greeting().greet());  // ✅ Should work now!
