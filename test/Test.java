/**
 * Created by jjxx9 on 2017/4/11.
 */

public class Test {
    {
        cnt = 6;
    }

    int cnt = 100;

    public Test() {
        cnt = 60;
    }

    public static void main(String[] args){
        Test test = new Test();
        System.out.println("cnt = " + test.cnt);
        //最后输出是50，如果按照错误说法就应该是3
        //按顺序执行就是cnt=6--->cnt=100---->cnt = 100/2 = 50.
    }

    {
        cnt /= 2;
    }
}

/*
while (上一次迭代中是有交换发生) {
    for（从第一个用户到最后一个用户）{     // Ni
        for（从第一个子载波到最后一个子载波）{       // SCk
            if （子载波SCk 没有连接到 用户Ni）{
                if (Ni-SCk的评价值 < Ni当前连接的最佳评价值) {
                    for (从Ni的最差连接子载波 到 低于连接SCk的评价值的最优连接子载波) {     // SCp
						for (从SCk的最差连接用户 到 最差连接用户) {		// Nj
							if (（Nj-SCp的评价值 > Ni-SCp的评价值） && （Ni-SCk的评价值 > Nj-SCk的评价值）) {
								交换
								记录有交换发生
								break; 跳出当前循环
							}
						}
                       
                    }
                }
            }
        }
    }
}
*/