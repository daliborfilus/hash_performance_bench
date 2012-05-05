i = 0
h = {}
while i < 1000000:
  h[i] = "aaa" + str(i)
  if i < 100:
    #print("aaa{0}".format(i))
    print(h[i])
  i += 1

# 1.35s, ~130MB RAM