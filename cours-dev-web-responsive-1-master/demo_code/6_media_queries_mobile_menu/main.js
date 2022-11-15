let mobileMenuBtn = document.querySelector(".mobile-menu-button");

mobileMenuBtn.addEventListener("click", () => {
    /* On click on the menu button, toggle the visibility state of the menu */
    let mobileMenu = document.querySelector(".top-header .nav-menu");
    mobileMenu.classList.toggle("active");
})