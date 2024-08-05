# TTRPG Weather Generator

This is a small and very basic program written in Java that generates weather conditions for tabletop role-playing games.

The rules used are based on Dungeons & Dragons 3.5e with heavy modifications since my GM likes to homebrew a lot. I was able to work with him to identify how best to customize the weather tables for his use. After that it was very simple to create this basic program to generate the weather conditions on the fly. Additionally, I came up with the idea to include any effects that inclement weather might have on the players. This was to keep the GM from having to repeatedly stop the game to look up effects; also, he wanted to customize some weather effects for his homebrew world.

I'm not very experienced with Java yet, but I wanted to upload and preserve my code for future alterations.

My goal is to build a GUI for this program once I learn how.

## How this program works

A random number is generated that simulates a d100 roll.

Using this number, the program determine and output what kind of weather is present.
* normal weather
* abnormal weather
* inclement weather
* storm
* powerful storm

Each type of weather has a list of conditions depending in the climate of the area. If the conditions affect visibility, skill checks, or otherwise have any effect on the players, the rules are output as well.

## The future of this project

As mentioned before, I plan to expand this program in the future. My biggest concern is to develop a GUI so that generation is as easy as a button click.

I may also make additions or alterations based on the feedback from my GM, as this was a cooperative project between the two of us.

Thanks for checking out my little project!
