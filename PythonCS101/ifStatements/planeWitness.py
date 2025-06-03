# Betero Tiikana's Text Adventure
print("A Plane Blew All Engines and the investigation is being carried out.")
print("You are the witness. Did the plane fly to the LEFT, MIDDLE or RIGHT?")
decision = input().upper()
if decision[:4] == "LEFT":
    print("The plane steered to the left. In the left distance there's a rocky land.")
    decision = input("Did the plane land on the rocky grounds, yes or no?" + "\n").upper()
    if decision[:3] == "YES":
        print("The plane would have crashed onto rocky grounds but luckily it didn't. Let's start over again!")
    elif decision[:4] == "NO":
        print("Everyone survived, so the plane did not turn left but went either middle or right! Let's start over again.." + "\n")