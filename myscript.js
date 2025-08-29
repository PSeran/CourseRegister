
function showfunction(){
    alert("these are the course")
    fetch("http://localhost:8081/courses")
    .then((response)=>response.json())
    .then((courses)=>{
         const dataTable = document.getElementById("coursetable");
         courses.forEach(course => {
            var row= `<tr>
            <td>${course.CourseId}</td>
            <td>${course.CourseName}</td>
            <td>${course.Trainer}</td>
            <td>${course.durationInWeek}</td>
            </tr>`
            dataTable.innerHTML +=row;
         });
    })
}

function showentroledStudent(){
    
     fetch("http://localhost:8081/courses/enrolled")
    .then((response)=>response.json())
    .then((students)=>{
         const dataTable = document.getElementById("enrolledtable");
         students.forEach(student => {
            var row= `<tr>
            <td>${student.u_name}</td>
            <td>${student.u_email}</td>
            <td>${student.cource_name}</td>
        
            </tr>`
            dataTable.innerHTML +=row;
         });
    })
}

// private String CourseId;
    // private String CourseName;
    // private String Trainer;
    // private int durationInWeek;