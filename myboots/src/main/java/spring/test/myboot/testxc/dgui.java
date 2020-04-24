package spring.test.myboot.testxc;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class dgui {


    String one;
    String two;

    List<dgui> ss;


    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public List<dgui> getSs() {
        return ss;
    }

    public void setSs(List<dgui> ss) {
        this.ss = ss;
    }


    public List<dgui> testMeun() {

        List<dgui> jj= new CopyOnWriteArrayList();

       //List<dgui> jj = new ArrayList<>();
        dgui dddd = new dgui();
        dddd.setOne("第一层");
        dddd.setTwo("1");
        jj.add(dddd);

        dgui dddd1 = new dgui();
        dddd1.setOne("第二层");
        dddd1.setTwo("2");
        jj.add(dddd1);
        dgui dddd2 = new dgui();
        dddd2.setOne("第三层");
        dddd2.setTwo("3");
        jj.add(dddd2);


        dgui d;

        for (dgui j : jj) {

            List<dgui> j4 = new ArrayList<>();
            d = new dgui();
            d.setOne("第一|1层");
            d.setTwo("1");
            j4.add(d);
            j.setSs(j4);
            jj.add(j);


        }

        return jj;
    }


    public static void main(String... agr) {


     //   dgui d = new dgui();
      //  System.out.println(JSON.toJSONString(d.testMeun()));



   Long ss =      Long.valueOf(174989133L);
        System.out.println(Long.valueOf(174989133L));

    }


}
