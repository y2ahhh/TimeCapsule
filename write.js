import * as Main from "./main.js";
import * as Date from "./date.js";
const upload = document.querySelector("#upload-write");
const title_input = document.querySelector(".title");
const name_input = document.querySelector(".name");
const write_input = document.querySelector("#write");

/* 이벤트 리스너 */
// 작성하기
upload.addEventListener("click", () => {
  save("/api/letters", {
    title: title_input.value,
    name: name_input.value,
    content: write_input.value,
    createdAt: Date.current(),
    endDate: Date.future(),
  });
});

/* fetch API */
// 데이터 저장
const save = function (url, data) {
  fetch(url, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(data),
  })
    .then((response) => {
      alert("데이터가 저장되었습니다!");

      // input 초기화
      title_input.value = "";
      name_input.value = "";
      write_input.value = "";

      // 데이터 불러오기
      Main.load("/api/letters");
    })
    .catch((error) => {
      alert("데이터 저장에 실패했습니다!");
    });
};