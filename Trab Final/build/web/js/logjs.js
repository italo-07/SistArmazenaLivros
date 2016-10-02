/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(".input").focusin(function () {
    $(this).find("span").animate({"opacity": "0"}, 200);
});

$(".input").focusout(function () {
    $(this).find("span").animate({"opacity": "1"}, 300);
});


function validar(){
    log1 = document.login.nome.value;
    pass1 = document.formlog.senha.value;
    
    if(document.formlog.login.value == ""){
      alert("Forneça o nome do usuário");
      document.formlog.login.focus();
      return false;
    }else if(document.formlog.senha.value == ""){
      alert("Forneça a senha do usuário");
      document.formlog.senha.focus();
      return false;
    }else{
      return true;
      alert("aqui");
    }
}
        

        
        
 