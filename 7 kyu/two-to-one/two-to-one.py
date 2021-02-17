def longest(a1, a2):
    cSet1 = set(a1)
    cSet2 = set(a2)
    return "".join(sorted(cSet1 | cSet2))