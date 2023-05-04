package JavaExam_20230503;

import java.util.ArrayList;

public class exam_Main {
    static ArrayList<Integer> random_ary = new ArrayList<Integer>();

    public static void main(String[] args) {
        for (int j = 0; j < 3; j++) {
            random_ary.add(get_newnum());
        }
        show_arraynum();
    }

    private static void show_arraynum() {
        String showmsg = "";
        int j = 1;
        for (int listitem : random_ary) {
            showmsg += listitem + (j++ < 3 ? ", " : " ");
        }
        System.out.print("取得3個不同的亂數陣列為: { " + showmsg + "}");
    }

    private static int get_newnum() {
        int newnum = (int) (Math.random() * 4);
        boolean havethesame = false;
        for (int i = 0; i < random_ary.size(); i++) {
            if (newnum == random_ary.get(i)) {
                havethesame = true;
            }
        }
        if (havethesame) {
            return get_newnum();
        } else {
            return newnum;
        }
    }

}
