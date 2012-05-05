var i = 0;
var h = [];

//for(i = 0; i < 10000000; i++) {
while(i < 10000000) {
  //h.push("aaa" + i);
  h << "aaa" + i;
  if(i < 100) {
    //console.log(sprintf("aaa%d", i));
  }
  i += 1;
}

