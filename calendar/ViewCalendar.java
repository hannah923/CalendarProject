package calendar;

import java.util.Calendar;

public class ViewCalendar extends MainCalendarApp{

	
	public ViewCalendar(int yearInt, int monthInt) {
		count = 0;

	      
//      monthInt = Integer.parseInt(monthText);
//      yearInt = Integer.parseInt(yearText);
////       cal.set(cal.YEAR, Integer.parseInt(t_year.getText()));
////      cal.set(cal.MONTH, monthInt-1); // 1월이 0부터 시작하므로 월에서 -1
////      cal.set(cal.MONTH, Integer.parseInt(t_month.getText())-1); // 1월이 0부터 시작하므로 월에서 -1
//      cal.set(cal.MONTH, monthInt-1); // 1월이 0부터 시작하므로 월에서 -1
//      cal.set(Calendar.DAY_OF_MONTH, 1); // DAY_OF_MONTH를 1로 설정 (월의 첫날)
//      day = cal.get(Calendar.DAY_OF_WEEK); // 그 주의 요일 반환 (일:1 ~ 토:7)
//      lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//      // System.out.println(week);

   e_calendar.setVisible(false);
   e_calendar.removeAll();

   for (int i = 0; i < 7; i++) {
      thumb2[i] = new ThumbPanel2(dayArray[i], colorArray[i]);
      e_calendar.add(thumb2[i]);
   }

   cal2.set(cal2.YEAR, yearInt);
   cal2.set(cal2.MONTH, monthInt); // 1월이 0부터 시작하므로 월에서 -1
   cal2.set(Calendar.DAY_OF_MONTH, 1); // DAY_OF_MONTH를 1로 설정 (월의 첫날)
   day = cal2.get(Calendar.DAY_OF_WEEK); // 그 주의 요일 반환 (일:1 ~ 토:7)
   lastday = cal2.getActualMaximum(Calendar.DAY_OF_MONTH);

//   for (int i = 0; i < 6; i++) {
//      for (int j = 0; j < 7; j++) {
//         count++;
//         if (count < day) {
//            thumb[i] = new ThumbPanel(colorArray[j], yearInt, monthInt + 1, 0, day);
//            e_calendar.add(thumb[i]);
//         } else if (count == day) {
//            date = 1;
//            thumb[i] = new ThumbPanel(colorArray[j], yearInt, monthInt + 1, date, day);
//            e_calendar.add(thumb[i]);
//            date++;
//         } else if (date > lastday) {
//            thumb[i] = new ThumbPanel(colorArray[j], yearInt, monthInt + 1, 0, day);
//            e_calendar.add(thumb[i]);
//         } else {
//            thumb[i] = new ThumbPanel(colorArray[j], yearInt, monthInt + 1, date, day);
//            e_calendar.add(thumb[i]);
//            date++;
//         }
//      }
//   }
//   
//   e_calendar.setVisible(true);
//
	}
}
