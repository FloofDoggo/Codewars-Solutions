def div_con(x):
     return sum([e for e in x if type(e) == int]) - sum([int(e) for e in x if not type(e) == int])