public class modThree {
    public static boolean modthree()
    {
        int[] nums = ArrayEx.CreateArray();
        boolean flag = false;
        for(int i = 0 ; i < nums.length-2; i++)
        {
          if(nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0)
          {
            flag = true;
          }
          if(nums[i] % 2 == 1 && nums[i+1] % 2 == 1 && nums[i+2] % 2 == 1)
          {
            flag = true;
          }
        }
        return flag;
    }

    public static void main(String[]args)
    {
        boolean flag = modthree();
        System.out.println(flag);
    }
          
}
