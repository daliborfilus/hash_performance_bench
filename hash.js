var i = 0;
var h = {};

//for(i = 0; i < 10000000; i++) {
while(i < 10000000) {
  h[i] = "aaa" + i;
  //if(i < 100) {
    //console.log(sprintf("aaa%d", i));
  //}
  i += 1;
}

// 6s, ~580MB RAM
