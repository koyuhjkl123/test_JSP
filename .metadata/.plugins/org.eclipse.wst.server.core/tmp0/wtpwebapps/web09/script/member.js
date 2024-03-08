/**
 * 
 */
/* 로그인 아이디 및 비밀번호 검사 */
 function loginCheck(){
	 
	 if(document.frm.userid.value.length == 0){
		 alert("아이디를 입력하세요");
		 frm.userid.focus();
		 return false;
	 }
	 
	 if(document.frm.pwd.value == ""){
		 alert("비밀번호 입력하세요");
		 frm.pwd.focus();
		 return false;
	 }
	 
	 return true;
 }
 
 /* 회원가입 등록 전 id 체크 */
 function joinCheck(){
	 
	 if(document.frm.userid.value.length < 4){
		 alert("아이디는 4글자 이상이어야 합니다.")
		 frm.userid.focus();
		 return false;
	 }
	 if(document.frm.pwd.value != document.frm.pwd_c.value){
		 alert("비밀번호가 일치 하지 않습니다.");
		 frm.pwd.focus();
		 return false;
	 }
	 
	 if(document.frm.reid.value.length == 0){
		 alert("아이디 중복 체크를 해 주세요.");
		 frm.userid.focus();
		 return false;
	 }
	 
	 return true;
 }
 
 function idCheck(){
	 
	 if(document.frm.userid.value.length == 0){
		 alert("아이디를 입력해 주세요");
		 frm.userid.focus();
		 return false;
	 }
	 
	 let url = "idcheck.do?userid=" + document.frm.userid.value;
	 
	 window.open(url, "_blank", 
	 "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height= 200");
	 
 }
 
 function idOk(){
	 
	 opener.frm.userid.value = document.frm.userid.value;
	 opener.frm.reid.value = document.frm.userid.value;
	 
	 self.close();
	 
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 