/* perform any action on widgets within this block */
Page.onReady = function() {
    /*
     * widgets can be accessed through 'Page.Widgets' property here
     * e.g. to get value of text widget named 'username' use following script
     * 'Page.Widgets.username.datavalue'
     */

    // var k = Page.Variables.getCartitem.dataSet.length();
    // if (k == 0) {
    //     Page.Widgets.layoutgrid3.style.display = "none !important";
    // }
    // console.log(k);





};


Page.checkbox2Click = function($event, widget, item, currentItemWidgets) {
    var cartItems = Page.Variables.getCartitem.dataSet;
    var totalamount = 0;
    Page.selectedItemslist = [];

    for (let i = 0; i < cartItems.length; i++) {
        if (cartItems[i].id === item.id) {
            cartItems[i].is_selected = currentItemWidgets.checkbox2.datavalue;
        }
        if (cartItems[i].is_selected) {
            totalamount += cartItems[i].product.price;
            Page.selectedItemslist.push(cartItems[i].productId);
        }
    }
    Page.Widgets.amount.caption = "Rs." + totalamount + ".00";
    Page.Variables.PayselectedItems.dataSet = Page.selectedItemslist;
    var datademo = Page.Variables.PayselectedItems.dataSet;
    // console.log(datademo);

};