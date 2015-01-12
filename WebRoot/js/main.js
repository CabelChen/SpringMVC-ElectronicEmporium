// JavaScript Document
window.onload= function(){
	timerTask(0);
}
$(function(){
		   $("#imgNum > a").click(function(){
						$(this).addClass('active').siblings().removeClass('active');
						
						toggleBanner($(this).index());
					});
		   
		   $('.shopClassItem').mouseover(function(){
						$(this).css( {'background-color':'#FFFFFF',"box-shadow":"0 0 5px 1px #888"});
						$(this).find("dt").css('background','inherit');
						$(this).find('a').css('color','#000');
						$('.aLink').css('color','#FFF');
						$(this).find('.category').show(50);
					});
		   $('.shopClassItem').mouseleave (function(){
						$(this).css({'background-color':'#4593FD',"box-shadow":"0 0"});
						$(this).find("dt").css('background','url(../images/icon/shop_sj.jpg) right center no-repeat');
						$(this).find('a').css('color','#FFF');
						$(this).find('.category').hide(50);
					});
		   $('.nav a').mouseover(function(){
						$(this).addClass('tempActive');
						
										  });
		   $('.nav a').mouseleave(function(){
						$(this).removeClass('tempActive');
						
										  });
		   });

function timerTask(count){
		var $imgNum = $("#imgNum > a:eq("+count+")").addClass("active").siblings().removeClass('active');
		toggleBanner(count);
		count = (count+1)%4;
		t=setTimeout('timerTask('+count+')',2000);
}
//Bannaer的切换
function toggleBanner(index){
		var left = -index%2*810;
		var top = -Math.floor(index/2)*326;
		$(".banner_big > .barImageBox").css("left",left+"px");
		$(".banner_big > .barImageBox").css("top",top+"px");
}
//商品分类详细页显示
function showCategory(){
		
}

