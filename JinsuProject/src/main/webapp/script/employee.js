/**
 * 
 */


 const hypenTel = (target) => {
 target.value = target.value.replace(/[^0-9]/g, '').replace(/^(\d{2,3})(\d{3,4})(\d{4})$/, `$1-$2-$3`);
 }

function employeeCheck() {

// 비밀번호 확인
	if (document.frm.pass.value.length == 0) {
		alert("비밀번호를 입력하세요");
		frm.pass.focus();
		return false;
	}else if(document.frm.pass.value.length < 4){
		alert("비밀번호는 4글자 이상 입력하시길 바랍니다");
		frm.pass.focus();
		return false;
	}

// 아이디 확인
	if (document.frm.userid.value.length < 6) {
		alert("아이디를 6글자 이상 입력해야합니다");
		frm.userid.focus();
		return false;
	}
	
	// 핸드폰 번호 확인
	
	return true;
}

