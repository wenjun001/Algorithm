package template;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiu on 6/20/16.
 */
public class DFSTemplate {

    public static void main(String[] args) {

        String[] source = {"a","b","c"};
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        dfs(source,res,temp,0,source.length);
        int i = 0;
        for (List<String> root:res
                ) {
            System.out.print("i:"+i++ +"  ");
            for (String s:root
                    ) {
                System.out.print(s);
            }
            System.out.println();
        }

    }

    public static void dfs(String[] source,List<List<String>> res,List<String> temp, int start,int size){
        // return exist
        if(start>size){
            return;
        }
        // add result
        res.add(new ArrayList<String>(temp));

        for(int i = start;i<size;i++){
            // add path
            temp.add(source[i]);
            dfs(source,res,temp,i+1,size);
            // remove path
            temp.remove(source[i]);
        }

    }


}
