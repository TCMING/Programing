package leetcode.easy;

import java.util.Arrays;

/**
 * 1046
 * 有一堆石头，每块石头的重量都是正整数。
 *
 * 每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
 *
 * 如果 x == y，那么两块石头都会被完全粉碎；
 * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
 * 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
 *
 * 链接：https://leetcode-cn.com/problems/last-stone-weight

 * @Author tianchengming
 * @Date 2020年12月30日 10:23
 * @Version 1.0
 */
public class LastStoneWeight {

    public static void main(String[] args) {
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        int[] stones = {2,4,7,8,1,1};
        System.out.println(lastStoneWeight.lastStoneWeight(stones));
    }

    public int lastStoneWeight(int[] stones) {
        if(stones == null || stones.length == 0){
            return 0;
        }
        if(stones.length == 1){
            return stones[0];
        }
        Arrays.sort(stones);
        while(stones[stones.length-1] > 0 && stones[stones.length-2] > 0){
            stones[stones.length-1] = stones[stones.length-1] - stones[stones.length-2];
            stones[stones.length-2]= 0;
            Arrays.sort(stones);
        }
        return stones[stones.length-1];

    }

}