def IsAnagram(wordOne, wordTwo):
    if(wordOne.lower() == wordTwo.lower()):
        return False
    return ''.join(sorted(wordOne.lower())) == ''.join(sorted(wordTwo.lower()))

print(IsAnagram("amor", "roma"))