funcs = []
for i in range(3):
    def f(): return i
    funcs.append(f)
print([fn() for fn in funcs])