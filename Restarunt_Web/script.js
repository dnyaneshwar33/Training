document.addEventListener("DOMContentLoaded", function() {
    const contactForm = document.getElementById("contactForm");
    const popup = document.getElementById("popup");
    const closeBtn = document.getElementById("closeBtn");
    const submitAgainBtn = document.getElementById("submitAgainBtn");
    const popupMessage = document.getElementById("popupMessage");

    contactForm.addEventListener("submit", function(event) {
        event.preventDefault();
        popup.style.display = "block";
    });

    closeBtn.addEventListener("click", function() {
        popup.style.display = "none";
    });

    submitAgainBtn.addEventListener("click", function() {
        popup.style.display = "none";
        contactForm.reset();
    });

    window.addEventListener("click", function(event) {
        if (event.target == popup) {
            popup.style.display = "none";
        }
    });
});
