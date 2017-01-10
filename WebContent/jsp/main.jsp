<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="../css/easyui.css">
    	<link rel="stylesheet" type="text/css" href="../css/icon.css">
    	<link rel="stylesheet" type="text/css" href="../css/demo.css">
    	<script type="text/javascript" src="../js/jquery.min.js"></script>
    	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
</head>
<body>
    	<h2>Complex Layout</h2>
    	<p>This sample shows how to create a complex layout.</p>
    	<div style="margin:20px 0;"></div>
    	<div id="main-ui" class="easyui-layout" style="width:80%;height:680px;">
    		<div data-options="region:'north'" style="height:40px"></div>
    		<div data-options="region:'south',split:true" style="height:40px;"></div>
    		<div data-options="region:'east',split:true" title="East" style="width:200px;">
    			<ul class="easyui-tree" data-options="url:'tree_data1.json',method:'get',animate:true,dnd:true"></ul>
    		</div>
    		<div data-options="region:'west',split:true" title="West" style="width:200px;">
    			<div class="easyui-accordion" data-options="fit:true,border:false">
    				<div title="Title1" style="padding:10px;">
    					content1
    				</div>
    				<div title="Title2" data-options="selected:true" style="padding:10px;">
    					content2
    				</div>
    				<div title="Title3" style="padding:10px">
    					content3
    				</div>
    			</div>
    		</div>
    		<div data-options="region:'center'">
    			<div class="easyui-tabs" data-options="fit:true,border:false,plain:true">
    				<div title="About" data-options="href:'_content.html'" style="padding:10px"></div>
    				<div title="DataGrid" style="padding:5px">
    					<table class="easyui-datagrid"
    							data-options="url:'datagrid_data1.json',method:'get',singleSelect:true,fit:true,fitColumns:true">
    						<thead>
    							<tr>
    								<th data-options="field:'itemid'" width="80">Item ID</th>
    								<th data-options="field:'productid'" width="100">Product ID</th>
    								<th data-options="field:'listprice',align:'right'" width="80">List Price</th>
    								<th data-options="field:'unitcost',align:'right'" width="80">Unit Cost</th>
    								<th data-options="field:'attr1'" width="150">Attribute</th>
    								<th data-options="field:'status',align:'center'" width="50">Status</th>
    							</tr>
    						</thead>
    					</table>
    				</div>
    			</div>
    		</div>
    	</div>
</body>
<script type="text/javascript">
	$().ready(function(){
		var height1 = $(window).height() - 20;
		$("#main-ui").attr("style","width:100%;height:"+ height1 + "px;");
		$("#main-ui").layout("resize",{  
            width:"100%",  
            height:height1+"px"  
        });  
	});
</script>   
</html>