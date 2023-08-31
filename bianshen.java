
public class bianshen {
    public static void main(String[] args) {
        System.out.println("local function Game(event)");
            for (int i = 0; i < 1001; i++) {
                System.out.println("if event.content == "+"\"model"+i+"\"then");
                System.out.println("Chat: sendSystemMsg(\"#cAAFFFF设#cAAEEFF置#cAADDFF外#cAACCFF观#cAABBFF为#R"+i+"\")");
                System.out.println("Actor:changeCustomModel(event.eventobjid,[[skin_"+i+"]])");
                System.out.println("end");
                System.out.println("");
        System.out.println("end");
        System.out.println("ScriptSupportEvent:registerEvent([=[Player.InputContent]=], Game)");
    }
    }
}
