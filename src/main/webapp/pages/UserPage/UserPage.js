/* perform any action on widgets within this block */
Page.onReady = function() {
    /*
     * widgets can be accessed through 'Page.Widgets' property here
     * e.g. to get value of text widget named 'username' use following script
     * 'Page.Widgets.username.datavalue'
     */
    Page.Widgets.container2.display = "none";
    // Get all elements with the specified class
    var element = document.getElementsByClassName("myicon");

    // Add event listeners for hover

    element[0].addEventListener("mouseenter", handleMouseEnter);
    element[0].addEventListener("mouseleave", handleMouseLeave);


    // Event handler for mouseenter (hover in)
    function handleMouseEnter(event) {
        // Code to execute when the element is being hovered
        // Add your desired actions here
        Page.Widgets.container2.display = "flex";

    }

    // Event handler for mouseleave (hover out)
    function handleMouseLeave(event) {
        // Code to execute when the element is no longer being hovered
        // Add your desired actions her
        Page.Widgets.container2.display = "none";

    }



    // Additional code...

};


// Page.UserinfoLiveForm1Beforeservicecall = function($event, $operation, $data, options) {
//     if (Page.Variables.FileServiceUploadFile.dataSet.length > 0) {

//         debugger;

//         $data.Userinfo.image = Page.Variables.FileServiceUploadFile.dataSet[0].path;
//     }
// };