/**
 * 
 */

 
 function check(){
	 
	 if(document.frm.jumin_1.value.length != 6){
		 alert("주민번호가 6자리여야 합니다.");
		 frm.jumin_1.focus();
		 return false;
	 }else if(document.frm.jumin_2.value.length != 7){
		 alert("주민번호2가 7글자여야 합니다.");
		 frm.jumin_2.focus();
		 return false;
		 // 아이디 값이 4글자 이상하여야 한다.
	 } else if(document.frm.id.value.length < 4){
		 alert("아이디는 4글자 이상이여야 합니다.")
		 frm.id.focus();
		 return false;
		 // 비밀번호와 비밀번호 확인 일치 여부
	 } else if(document.frm.pwd.value != document.frm.pwd_re.value){
		 alert("비밀번호가 다릅니다.");
		 frm.pwd_re.focus();
		 return false;
	 } else { // 모두 맞다면
		 return true;
	 }
 }