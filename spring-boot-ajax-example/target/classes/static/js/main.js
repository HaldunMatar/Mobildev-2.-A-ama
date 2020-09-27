$(document).ready(function () {

    $("#search-form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });

});

function fire_ajax_submit() {

    var search = {}
    search["username"] = $("#username").val();
    search["password"] = $("#password").val();
   

    $("#btn-search").prop("disabled", true);
    alert(JSON.stringify(search))
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/api/search",
        data: JSON.stringify(search),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {

       
            GFG_FUN(data);
            
        

            console.log("SUCCESS : ", data);
            $("#btn-search").prop("disabled", false);

        },
        error: function (e) {

            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);

        }
    });

}


function GFG_FUN(list1) { 
    var cols = []; 
      
    for (var i = 0; i < list1.length; i++) { 
        for (var k in list1[i]) { 
            if (cols.indexOf(k) === -1) { 
                  
                // Push all keys to the array 
                cols.push(k); 
            } 
        } 
    } 
      
    // Create a table element 
    var table = document.createElement("table"); 
      
    // Create table row tr element of a table 
    var tr = table.insertRow(-1); 
      
    for (var i = 0; i < cols.length; i++) { 
          
        // Create the table header th element 
        var theader = document.createElement("th"); 
        theader.innerHTML = cols[i]; 
          
        // Append columnName to the table row 
        tr.appendChild(theader); 
    } 
      
    // Adding the data to the table 
    for (var i = 0; i < list1.length; i++) { 
          
        // Create a new row 
        trow = table.insertRow(-1); 
        for (var j = 0; j < cols.length; j++) { 
            var cell = trow.insertCell(-1); 
              
            // Inserting the cell at particular place 
            cell.innerHTML = list1[i][cols[j]]; 
        } 
    } 
      
    // Add the newely created table containing json data 
    var el = document.getElementById("table"); 
    el.innerHTML = ""; 
    el.appendChild(table); 
} 
