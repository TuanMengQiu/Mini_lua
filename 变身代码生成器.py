#团梦秋制作禁止盗取代码，使用代码请勿删除此注释
print("local function Game(event)")
for n in range(1,1001):#这里输入1-多少可以变身默认是1-1000
    print('if event.content == '+'"model'+str(n)+'"'+'then')
    print('Chat: sendSystemMsg("#cAAFFFF设#cAAEEFF置#cAADDFF外#cAACCFF观#cAABBFF为#R'+''+str(n)+'")')
    print("Actor:changeCustomModel(event.eventobjid,[[skin_"+str(n)+"]])")
    print("end")
print("end")
print("ScriptSupportEvent:registerEvent([=[Player.InputContent]=], Game)")