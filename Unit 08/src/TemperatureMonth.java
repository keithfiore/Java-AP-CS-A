public class TemperatureMonth{

  private double[][] temperatures;

  public TemperatureMonth(double[][] t){
    temperatures = t;
  }

  public double getMaxTemp(){
    double max = temperatures[0][0];
    for(double[] week : temperatures){
      for(double temp : week){
        if(temp > max)
          max = temp;
      }
    }
    return max;
  }

  public double getMinTemp(){
    double min = temperatures[0][0];
    for(double[] week : temperatures){
      for(double temp : week){
        if(temp < min)
          min = temp;
      }
    }
    return min;
  }

  public double getMonthlyAverage(){
    double sum = 0;
    for(double[] week : temperatures){
      for(double temp : week){
        sum+=temp;
      }
    }
    return sum/(temperatures.length*temperatures[0].length);
  }

  public double[] getWeeklyAverages(){
    double[] avgs = new double[temperatures.length];
    for(int w = 0; w < temperatures.length; w++){
      double sum = 0;
      for(double temp : temperatures[w]){
        sum+=temp;
      }
      avgs[w] = sum/temperatures[w].length;
    }
    return avgs;
  }

}
