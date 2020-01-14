class Maze  
- String file
- int[2] mazeSize  
- int[2] start
- int[2] goal
- int[2] position
- char[width][height] mapData  
  
> method Maze(String path)
>> file = path

> method Maping()
>> FileReader = File  
>> BufferedReader = filereader  
>> while(){mapdata = bufferedreader}
  
> method print()  
>> output (mapData)  
---
class Player
- int[] x, y
- int count
  他にプレイヤークラスが果たすべき機能はなんだろうか？
  
 メソッド 
- 歩く
  count++1
- 前に障害物がないか調べる
- 現在地を調べる
　ゴールなら終了

- get x,y
- get count
- set x,y
