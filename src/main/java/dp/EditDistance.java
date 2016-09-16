package dp;

public class EditDistance {

    public static void main(String[] args) {
        String first = "geek";
        String second = "gesek";
        System.out.println(new EditDistance().distance(first, second, first.length(), second.length()));

        String str1 = "sunday";
        String str2 = "saturday";

        System.out.println( new EditDistance().distance( str1 , str2 , str1.length(), str2.length()) );

    }

    public  int distance(String source, String target,int sourceSize, int targetSize) {
        //base cases
        if (sourceSize == 0)
            return targetSize;
        if(targetSize == 0)
            return sourceSize;
        if (source.charAt(sourceSize-1) == target.charAt(targetSize-1))
            return distance(source,target,sourceSize-1,targetSize-1);
        else
            return 1+ min(distance(source, target, sourceSize, targetSize - 1)
                    , distance(source, target, sourceSize - 1, targetSize)
                    , distance(source, target, sourceSize - 1, targetSize - 1));
    }

    public int min(int first,int second,int thrid) {
        int min;
        int temp;
        temp = first<second?first:second;
        min = temp<thrid?temp:thrid;

        return min;
    }

}
