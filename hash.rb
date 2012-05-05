i = 0
h = {}
while i < 1_000_000 do
  h[i] = "aaa#{i}"
  puts "aaa%d" % [i] if i < 100
  i += 1
end

# 2.4s, ~130MB RAM