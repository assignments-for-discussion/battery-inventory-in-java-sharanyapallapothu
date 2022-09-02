package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public static int lowCount = 0;
    public static int mediumCount = 0;
    public static int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    for(int i =0; i<cycles.length; i++){
      if(cycles[i]<400){
        CountsByUsage.lowCount++;
      }
      else if(cycles[i]>=400 && cycles[i]<920){
        CountsByUsage.mediumCount++;
      }
      else if(cycles[i]>919){
        CountsByUsage.highCount++;
      }
    }
    return counts;
  }
  

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
