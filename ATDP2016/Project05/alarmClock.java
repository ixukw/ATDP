public String alarmClock(int day, boolean vacation) {
  String earlyWakeupV = "10:00";
  String lateWakeupV = "off";
  String earlyWakeup = "7:00";
  String lateWakeup = earlyWakeupV;
  if (vacation)
  {
    if (day >= 1 && day <= 5)
    {
      return earlyWakeupV;
    }
    if (day < 1 || day > 5)
    {
      return lateWakeupV;
    }
  }
  else
  {
     if (day >= 1 && day <= 5)
    {
      return earlyWakeup;
    }
    if (day < 1 || day > 5)
    {
      return lateWakeup;
    }
  }
}
