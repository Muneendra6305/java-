class Solution {
    public static int intToRoman(int num) {
        String s1=Integer.toString(num);
        int ans=0;
        int n=s1.length();
        int v1=0,v2=0;
        for(int i=0;i<n-1;i++)
        {
            if(i<n-1)
            {
                v1=calculate(s1.charAt(i));
                v2=calculate(s1.charAt(i));
                if(v1<v2)
                {
                    ans=ans-v1;
                }
                else
                {
                    ans+=v1;
                }
            }
            else
            {
                ans=ans+calculate(s1.charAt(i));
            }
        }
        return ans;
    }
    static int calculate(char c)
    {
        if(c=='I')
          return 1;
        else if(c=='V') 
            return 5;
        else if(c=='X')
             return 10;
        else if(c=='L')
             return 50;
        else if(c=='C')
            return 100;
        else if(c=='D')
            return 500;
        else if(c=='M')
            return 1000;
    }
}
