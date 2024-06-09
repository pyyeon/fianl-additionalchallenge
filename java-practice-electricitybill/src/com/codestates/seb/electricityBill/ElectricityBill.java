package com.codestates.seb.electricityBill;

public class ElectricityBill {
  public static void main(String[] args) {
    System.out.println("=".repeat(25));
    System.out.println(" 주택용 전기요금(저압) 계산기 ");
    System.out.println("=".repeat(25));
double[] electricityUsage = { 99, 150, 250, 301, 450, 510};
for (int i = 0; i < electricityUsage.length; i++ ) {
  // 총 전기 요금 계산
  double usage = electricityUsage[i];
  double totalBill = calculateElectricityBill(usage);

  // 결과 출력
  System.out.println("사용한 전기량: " + usage + " kWh");
  System.out.println("총 전기 요금: " + totalBill + " 원");
}

//   초과 전까지 계산 + 초과분에 대한 요금을 책정 따로
//    99kWh의 전기 요금은 6009.3원 입니다.
//    150kWh의 전기 요금은 12365.0원 입니다.

    //TODO:

    // 1, 100 이하인 경우 전력당 60.7 원이 부가됩니다. (사용한 전력 100 kWh 이하일 경)

    // 2, 100 이하인 경우 전력당 60.7원 부과, 100 초과인 경우 125.9원 부과 (사용한 전력이 100 kWh 초과일 경우)
    // 전기 요금 계산 메서드


  }
  public static double calculateElectricityBill(double usage) {
    // 총 전기 요금 계산
    double total = 0.0;
    double rate = 60.7;
    double overRate = 125.9;
    // 1. 100 kWh 이하의 구간(100kWh) > 60.7(kWh당)
    if(0< usage && usage <= 100){
      total = usage * rate;
    }else if (usage > 100){//    2. **100 kWh 초과의 구간**(100kWh) > 125.9 (kWh당)
      total = 100 * rate + (usage - 100) * overRate;
    }

      return total;
  }

}
