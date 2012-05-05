my %h = ();
my $i = 0;

while($i < 10000000)
{
  $h{$i} = "aaa{%i}";
  
  if($i < 100) {
    print sprintf("aaa%d", $i)."\n";
  }
  $i += 1;
}

# 37s, 1.55GB RAM
