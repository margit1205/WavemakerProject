Page.onReady = function() {



};





// function of finding product selected

Page.productListonSuccess = function(variable, data) {
    // var productIds = Page.Variables.PayselectedItems.dataSet;
    // console.log(productIds);
    // // var pageparam = Page.Widgets.PAGEID.caption;
    // // console.log(pageparam);
    // var allProducts = Page.Variables.productList.dataSet;

    // // Filter products based on product IDs
    // for(let i=0;i<productIds.length;i++){
    // var filteredProducts = allProducts.filter(function(product) {
    //     return productIds[i].indexOf(product.id !== -1);
    // });
    // }





    var productIds = Page.Variables.PayselectedItems.dataSet;
    console.log(productIds);
    var allProducts = Page.Variables.productList.dataSet;
    var filteredProducts = [];

    // Filter products based on product IDs
    for (let i = 0; i < productIds.length; i++) {
        var productId = productIds[i];
        var filteredProduct = allProducts.find(function(product) {
            return product.id === productId;
        });
        if (filteredProduct) {
            filteredProducts.push(filteredProduct);
        }
    }

    // console.log(filteredProducts);

    // console.log(filteredProducts)


    // if (pageparam != null) {
    //     var filteredProducts2 = allProducts.filter(function(product) {
    //         return pageparam === product.id;
    //     });
    // console.log(filteredProducts2)
    // console.log(filteredProducts2.length);
    // }

    var filteredProducts2 = Page.Variables.DescripProduct.dataSet;
    if (filteredProducts.length > 0) {
        Page.Variables.svProducts.dataSet = filteredProducts;
        Page.Widgets.NoOfItems.caption = filteredProducts.length;
        var totalAmount = 0;

        for (let i = 0; i < filteredProducts.length; i++) {
            totalAmount += filteredProducts[i].price;
        }

        var GSTAmount = ((totalAmount * 18) / 100).toFixed(2);
        var totalAmountWithGST = (parseFloat(totalAmount) + parseFloat(GSTAmount)).toFixed(2);

        Page.Widgets.gstamount.caption = "Rs. " + GSTAmount;
        Page.Widgets.totalamount.caption = "Rs. " + totalAmountWithGST;
    } else if (filteredProducts2.length === 1) {

        Page.Variables.svProducts.dataSet = filteredProducts2;
        Page.Widgets.NoOfItems.caption = filteredProducts2.length;
        var totalAmount2 = filteredProducts2[0].price;
        var GSTAmount2 = ((totalAmount2 * 18) / 100).toFixed(2);
        var totalAmountWithGST2 = (parseFloat(totalAmount2) + parseFloat(GSTAmount2)).toFixed(2);

        Page.Widgets.gstamount.caption = "Rs. " + GSTAmount2;
        Page.Widgets.totalamount.caption = "Rs. " + totalAmountWithGST2;
        console.log("No selected products. Showing description products.");
    }


    Page.radioset2Change = function($event, widget, newVal, oldVal) {
        Page.Widgets.select1.datavalue = undefined;
    };

    Page.wizard1Done = function(widget, steps) {
        // Page.Variables.insertOrders.setInput('orderDate', Date.now());

        var orderDate = new Date(); // Get the current date and time
        var shippingDate = new Date();
        shippingDate.setDate(shippingDate.getDate() + 10); // Add 10 days to the current date
        Page.Variables.insertOrders.setInput('orderDate', orderDate);
        Page.Variables.insertOrders.setInput('shippingDate', shippingDate);
    };


};



Page.insertOrdersonSuccess = function(widget, steps) {

    // insrting the orders product

    var dataObj = Page.Variables.svProducts.dataSet;
    var orderListData = Page.Variables.insertOrders.dataSet;
    // console.log(dataObj.length);
    // console.log(orderListData);


    for (let i = 0; i < dataObj.length; i++) {
        Page.Variables.InsertOrderItems.setInput({
            "productId": dataObj[i].id,
            "quantity": '1',
            "price": dataObj[i].price,
            "orderId": orderListData.id

        });

        Page.Variables.InsertOrderItems.createRecord();
    }


};