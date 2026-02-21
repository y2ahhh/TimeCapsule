let today, current_year, current_month, current_day;
let next, after_year, after_month, after_day;

// 오늘 날짜
export const current = function () {
  today = new Date();
  current_year = today.getFullYear();
  current_month = today.getMonth() + 1;
  current_day = today.getDate();
  return digits(current_year, current_month, current_day);
};

// 1년 뒤 날짜
export const future = function () {
  next = new Date();
  next.setFullYear(today.getFullYear() + 1);
  after_year = next.getFullYear();
  after_month = next.getMonth() + 1;
  after_day = next.getDate();
  return digits(after_year, after_month, after_day)
};

// 자릿수
export const digits = function(year, month, day){
  month = month < 10 ? "0" + month : month;
  day = day < 10 ? "0" + day : day;
  return `${year}-${month}-${day}`;
}