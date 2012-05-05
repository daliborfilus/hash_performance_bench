<?php

ini_set('memory_limit', '1G');

$i = 0;
$h = array();
while($i < 1000000) {
  $h[$i] = "aaa{$i}";
  if($i < 100) {
    echo sprintf("aaa%d", $i)."\n";
  }
  $i += 1;
}

// 1.4s, ~220MB RAM