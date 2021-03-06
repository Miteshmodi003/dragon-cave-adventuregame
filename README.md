# Dragon Cave Adventure Game

Adventure Cave is a text-based adventure game where the player must navigate through a dangerous cave in search of gold and the glory of slaying the dragon.
The Board (Cave)
The cave is made up of a 4x4 grid of rooms with randomly located features. Each feature creates observable phenomenon according to the descriptions below:
1 Entrance - Where the player begins the game.
1 Dragon - Creates a "smell" in adjacent (not diagonal) rooms.
3 Pits - Creates a "breeze" in adjacent (not diagonal) rooms.
1 Pile of Gold - Creates a "glitter" in the same room.

Due to the randomness, a game may be impossible to beat.
For example, the entrance may be surrounded by pits.
The Rules
You always begin the game at the entrance facing EAST.
If you enter the room with the dragon you get eaten.
If you enter a room with a pit you fall to your death.
If you enter the room with the gold you can grab it.
If you are at the entrance you can climb out.
You have 1 arrow which you can shoot in a straight line across multiple rooms. If it hits the dragon, the dragon dies.
To win, you should kill the dragon, get the gold, and climb out of the cave.
The commands
The following commands are executed by typing one letter and hitting enter:
Move (F)orward.
Turn (L)eft.
Turn (R)ight.
(G)rab the Gold.
(S)hoot the Arrow.
(C)limb out.
(Q)uit the game.
(X) to cheat (get a map and your location).

The messages
Intro Message

Welcome to Adventure Cave!
Try to find the gold and return here to climb back out.
You have 1 arrow that you can shoot.
Try the following commands:
Move (F)orward, Turn (L)eft, Turn (R)ight,
(G)rab the Gold, (S)hoot the Arrow, (C)limb out.
(Q)uit the game, Use (X) to cheat.
In Game Messages (Sorted Alphabetically)
"!!!!!! You Win !!!!!!"
"A damp breeze is in the air!\n"
"A foul stench is in the air!\n"
"But there is still a dragon to slay."
"But there is still gold to be found."
"Nothing happens."
"Quitter!!!"
"The Dragon Eats You !!!"
"The room is glittering!\n"
"Try the following commands:\n"
"Try to find the gold and return here to climb back out."
"You Die !!!"
"You are facing "
"You are in: "
"You bump into a wall."
"You don't have an arrow."
"You escape the cave!!!"
"You fall into a pit !!!"
"You got the gold !!!"
"You have 1 arrow that you can shoot."
"You here a giant roar in the distance!!!"
"You here a thud in the distance."
"You walk into the next room."


# Sample Game

Welcome to Dragon Cave!
Try to find the gold and return here to climb back out.
You have 1 arrow that you can shoot.
Try the following commands:
Move (F)orward, Turn (L)eft, Turn (R)ight,
(G)rab the Gold, (S)hoot the Arrow, (C)limb out.
(Q)uit the game, Use (X) to cheat.


You are facing EAST
Enter Command: X
.P      .       .       .       
.G      .P      .       .       
.       .       .       .       
.       .D      .P      .       
CHEAT: You are in: (1,3)

You are facing EAST
Enter Command: r

You are facing SOUTH
Enter Command: f
You walk into the next room.

You are facing SOUTH
Enter Command: f
You walk into the next room.
A damp breeze is in the air!

You are facing SOUTH
Enter Command: f
You bump into a wall.
A damp breeze is in the air!

You are facing SOUTH
Enter Command: r
A damp breeze is in the air!

You are facing WEST
Enter Command: s
You here a giant roar in the distance!!!
A damp breeze is in the air!

You are facing WEST
Enter Command: r
A damp breeze is in the air!

You are facing NORTH
Enter Command: f
You walk into the next room.

You are facing NORTH
Enter Command: l

You are facing WEST
Enter Command: f
You walk into the next room.
A damp breeze is in the air!

You are facing WEST
Enter Command: f
You walk into the next room.
A damp breeze is in the air!

You are facing WEST
Enter Command: x
.P      .       .       .       
.G      .P      .       .       
.       .       .       .       
.       .       .P      .       
CHEAT: You are in: (2,1)
A damp breeze is in the air!

You are facing WEST
Enter Command: f
You walk into the next room.

You are facing WEST
Enter Command: r

You are facing NORTH
Enter Command: f
You walk into the next room.
The room is glittering!
A damp breeze is in the air!

You are facing NORTH
Enter Command: g
You got the gold !!!
A damp breeze is in the air!

You are facing NORTH
Enter Command: r
A damp breeze is in the air!

You are facing EAST
Enter Command: r
A damp breeze is in the air!

You are facing SOUTH
Enter Command: f
You walk into the next room.

You are facing SOUTH
Enter Command: x
.P      .       .       .       
.       .P      .       .       
.       .       .       .       
.       .       .P      .       
CHEAT: You are in: (2,0)

You are facing SOUTH
Enter Command: l

You are facing EAST
Enter Command: f
You walk into the next room.
A damp breeze is in the air!

You are facing EAST
Enter Command: f
You walk into the next room.
A damp breeze is in the air!

You are facing EAST
Enter Command: f
You walk into the next room.

You are facing EAST
Enter Command: f
You bump into a wall.

You are facing EAST
Enter Command: c
Nothing happens.

You are facing EAST
Enter Command: l

You are facing NORTH
Enter Command: f
You walk into the next room.

You are facing NORTH
Enter Command: c
You escape the cave!!!
!!!!!! You Win !!!!!!
