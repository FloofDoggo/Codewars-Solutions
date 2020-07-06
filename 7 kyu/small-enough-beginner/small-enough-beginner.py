def small_enough(array, limit):
    for val in array:
        if val > limit: return False;
    return True;