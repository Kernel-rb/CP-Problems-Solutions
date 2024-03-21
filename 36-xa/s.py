def truncateSentence( s: str, k: int) -> str:
    a = s.split(" ")
    return " ".join(a[:k]) 

print(truncateSentence("Hello how are you Contestant" , 4))