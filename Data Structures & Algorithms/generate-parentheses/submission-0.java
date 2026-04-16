class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        generate(n,0,0,list,"");
        return list;
    }

    public void generate(int n,int o,int c,List<String> list,String bracket){
        if(o==n && c==n){ list.add(bracket);return;}


        if(o<n){
            generate(n,o+1,c,list,bracket+"(");
        }

        if(c<o){
             generate(n,o,c+1,list,bracket+")");
        }
    }
}
