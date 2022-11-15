
let openMenuButton = document.querySelector('.open-menu-btn');
let closeMenuButton = document.querySelector('.close-menu-btn');
let menuContainer = document.querySelector('.menu');
let menuContent = document.querySelector('.menu .menu-content');


closeMenuButton.remove();
menuContent.remove();

/* Setup action on buttons */
openMenuButton.addEventListener('click', () => {
    menuContainer.prepend(closeMenuButton);
    openMenuButton.remove();
    menuContainer.appendChild(menuContent)
})

closeMenuButton.addEventListener('click', () => {
    menuContainer.prepend(openMenuButton);
    closeMenuButton.remove();
    menuContent.remove();
})

