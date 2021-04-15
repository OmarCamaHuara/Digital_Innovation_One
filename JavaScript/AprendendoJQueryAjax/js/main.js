function consultaCep(){
    $(".barra-progreso").show()
    var cep = document.getElementById("cep").value;
    var url = "https://viacep.com.br/ws/"+cep+"/json/"

    console.log(url)

    $.ajax({
        url: url,
        type: "GET",
        success: function(response){
            console.log(response);
            $("#logradouro").html(response.logradouro);
            $("#bairro").html(response.bairro);
            $("#localidade").html(response.localidade);
            $("#uf").html(response.uf);
            $("#tituloCep").html(response.cep);
            $(".cep").show();
            $(".barra-progreso").hide();
            //Esta es la forma tradiccional los dos son iguales en AJAX
            //document.getElementById("logradouro").innerHTML = response.logradouro  
        }
    })
}

$(function(){
    $(".cep").hide();
    $(".barra-progreso").hide();
})