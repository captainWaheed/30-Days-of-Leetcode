class Solution {
 public List<Integer> selfDividingNumbers(int left, int right) 
    {
        List<Integer> list = new ArrayList<Integer>();
        for(int num=left; num<=right; num++)
        {
            if(isSelfDividingNumber(num))
            {
                list.add(num);
            }
        }
        return list;
    }
    public boolean isSelfDividingNumber(int number) {
    for (int tempNumber = number; tempNumber > 0; tempNumber /= 10) {
        int digit = tempNumber % 10;
        if (digit == 0 || number % digit != 0) {
            return false;
        }
    }
    return true;
}

}