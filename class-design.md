class Maze  
- String file
- int[2] mazeSize  
- int[2] start
- int[2] goal
- int[2] position
- char[width][height] mapData  
  
> method Maze(String path)
>> file = path
>> Maping(file)

> method Maping(file)
>> FileReader = File  
>> BufferedReader = filereader  
>> while(){mapdata = bufferedreader}
  
> method print()  
>> output (mapData)  

> method getStart()
>> return start

> method setPosition()
>> this.position = Player.get x,y
---
class Player
- int[] x, y
- int count

 メソッド 
- コンストラクタ(引数:なし)
- コンストラクタ(引数:初期位置)
- 歩く  
 count++1  
 前に障害物がないか調べる
- 前に障害物がないか調べる
- 回転
- 現在地を調べる  
ゴールなら終了

- get x,y
- get count
- set x,y
