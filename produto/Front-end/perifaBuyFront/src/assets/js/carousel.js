// event listener 'load' para esperar que toda a pagina carregue antes de rodar o codigo da função passada como parametro
window.addEventListener("load", function(event) {

    // Colocar event listeners para todos os cards das categorias
    function setEventListeners() {
        var slides = [document.getElementByClassName(""),
            document.getElementByClassName(""),
            document.getElementByClassName(""),
            document.getElementByClassName(""),
            document.getElementByClassName("")];

            for (let i = 0; i < slides.length; i++) {
                slides[i].addEventListener('click', moveToSlide);
            }
    }

    // Função para mover para o slide e ativar o slide escolhido
    function moveToSlide(event) {
        // buscar pelo elemento (slide) através do id usando como parametro o nome do elemento(card seleção de categoria) clicado
        let element = document.getElementById(event.target.className);

        // buscar pela lista de slides (por procurando o elemento pai dos slides e escolhendo os filhos através do jquery) para remover a classe 'active' do slide atual
        let = elementos = document.querySelector("class-com-todos-slides").children;
        for (let i = 0; i < elementos.length; i++) {
            if (elementos[i].classList.contains("active")) {
                elementos[i].classList.remove("active");
            }
        }

        // Adiciona a classe 'active' ao slide atual e move o nagedor para o slide        
        element.classList.add('active');
        $("html, body").scrollTop($(element).offset().top);
        /*
        $('.nome-slide').localScroll({duration:800})
        document.getElementByClassName("nome-slide").classList.add("active")
        */
       
    }
    setEventListeners();
});
