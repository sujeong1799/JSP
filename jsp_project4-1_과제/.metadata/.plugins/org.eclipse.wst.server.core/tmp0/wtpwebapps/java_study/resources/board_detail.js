
async function postCommentToServer(cmtData) {
	try {
		const url = "/cmt/post";
		const config = {
			method: 'post',
			headers: {
				'content-Type': 'application/json; charset=utf-8'
			},
			body: JSON.stringify(cmtData)
		};


		const resp = await fetch(url, config);
		const result = await resp.text();
		return result;
	}catch(error){
		console.log(error);
	}

}

document.getElementById('cmtAddBtn').addEventListener('click', () => {
	const cmtText = document.getElementById('cmtText').value; 
	console.log(cmtText);
	if (cmtText == null || cmtText == "") { 
		alert('댓글을 입력해주세요');
		return false;
	} else {
		let cmtData = {
			bno: bnoVal,
			writer: document.getElementById('cmtWriter').value,
			content: cmtText
		};
		postCommentToServer(cmtData).then(result => {
			if (result > 0) {
				alert('댓글 등록 성공!!');
				
				document.getElementById('cmtText').value = "";
			}
			printCommentList(cmtData.bno);
		})
	}
})


async function getCommentListFromServer(bno) {
	try {
		const resp = await fetch('/cmt/list/' + bno); 
		const cmtList = await resp.json();
		return cmtList;

	} catch (error) {
		console.log(error);
	}
}


function printCommentList(bno) {
	getCommentListFromServer(bno).then(result => {
		console.log(result);
		if (result.length > 0) {
			spreadCommentList(result);
		} else {
			let div = document.getElementById('accordionFlushExample');
			div.innerText = "comment가 없습니다.";
		}
	})
}
function spreadCommentList(result) {
	console.log(result);
	let div = document.getElementById('accordionFlushExample');
	div.innerHTML = "";
	for (let i = 0; i < result.length; i++) {
		let html = `<div class="accordion-item">`;
		html += `<h2 class="accordion-header" id="flush-heading${i}">`; 
		html += `<button class="accordion-button collapsed" type="button"
					data-bs-toggle="collapse" `;
		html += `data-bs-target="#flush-collapse${i}";
					aria-expanded="false" aria-controls="flush-collapse${i}">`;
		html += `${result[i].cno}, ${result[i].writer} </button></h2> `;
		html += `<div id="flush-collapse${i}" class="accordion-collapse collapse"`;
		html += `aria-labelledby="flush-heading${i}"
				data-bs-parent="#accordionFlushExample">`;
		html += `<div class="accordion-body">`;
		html += `<button type="button" data-cno="${result[i].cno}" data-writer="${result[i].writer}" class="btn btn-sm btn-outline-success cmtModBtn">%</button>`;
		html += `<button type="button" data-cno="${result[i].cno}" class="btn btn-sm btn-outline-danger cmtDelBtn">X</button>`;
		html += `<input type="text" class="form-control" id="cmtText1" value="${result[i].content}">`;
		html += `${result[i].reg_date}`;
		html += `</div></div></div>`;
		div.innerHTML += html;
	}
}


async function removeCommentFromServer(cnoVal){
	try{
		const url = '/cmt/remove?cnoVal='+cnoVal;
		const config = {
			method : 'post'
		}
		const resp = await fetch(url, config);
		const result = await resp.text();
		return result;
	}catch(error){
		console.log(error);
	}	
}

async function updateCommentFromServer(cnoVal, cmtText1, writer){
	try{
		const url = "/cmt/modify";
		const config = {
			method:'post',
			headers:{
				'content-Type': 'application/json; charset=utf-8'
			},
			body: JSON.stringify({cno:cnoVal, content:cmtText1, writer:writer})
		}		
		const resp = await fetch(url, config);
		const result = await resp.text();
		return result;
	}catch(error){
		console.log(error);
	}
}

document.addEventListener('click', (e)=>{
	if(e.target.classList.contains('cmtModBtn')){
		let cnoVal = e.target.dataset.cno;
		console.log(cnoVal);

		let div = e.target.closest('div');
		let cmtText1 = div.querySelector('#cmtText1').value;
		let writer = e.target.dataset.writer;
		
		updateCommentFromServer(cnoVal, cmtText1, writer).then(result=>{
			if(result>0){
				alert('댓글 수정 완료');
				console.log(result);
				printCommentList(bnoVal);
			}else{
				alert('댓글 수정불가!');
			}
		})
	}
	if(e.target.classList.contains('cmtDelBtn')){
		let cnoVal = e.target.dataset.cno;
		console.log(cnoVal);
		removeCommentFromServer(cnoVal).then(result =>{
			if(result > 0){
				alert('댓글 삭제 완료!!');
				printCommentList(bnoVal);
				console.log(bnoVal);
			}
		})
	}
})

