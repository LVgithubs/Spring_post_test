//이벤트 리스너

$("#btn-write").click(() => {
    write();
});
$("#btn-search").click(() => {
    search();
});


//기능

//글 쓰기

async function write() {

    let BoardDto = {
        title: $("#title").val(),
        content: $("#content").val()
    }

    // (2) fetch 요청한다. (json으로 변환해서)
    let response = await fetch("/api/write", {
        method: "POST",
        body: JSON.stringify(BoardDto),
        headers: {
            'Content-Type': 'application/json; charset=utf-8'
        },
    });
    let responseParse = await response.json();
    console.log(responseParse);
    
    if (responseParse.code == 1) {
        alert("작성 성공");
        location.href = "/";
    } else {
        alert('작성 실패');
    } 
}

    $('#content').summernote({
        height: 300
    });