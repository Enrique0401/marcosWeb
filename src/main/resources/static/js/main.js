function togglPassword(inputId, iconId) {
    const password = document.getElementById(inputId);
    const icon = document.getElementById(iconId);
    if (password.type === "password") {
        password.type = "text";
        icon.classList.replace("bi-eye", "bi-eye-slash");
    } else {
        password.type = "password";
        icon.classList.replace("bi-eye-slash", "bi-eye");
    }
}

function redirectInicio(event) {
    event.preventDefault(); 
    const pass = document.getElementById("password").value;
    const confirm = document.getElementById("confirmPassword").value;

    if (pass !== confirm) {
        alert("Las contraseñas no coinciden");
        return;
    }

    window.location.href = "../index.html"; 
}


function togglePassword() {
    const password = document.getElementById("password");
    const icon = document.getElementById("toggleIcon");
    if (password.type === "password") {
        password.type = "text";
        icon.classList.replace("bi-eye", "bi-eye-slash");
    } else {
        password.type = "password";
        icon.classList.replace("bi-eye-slash", "bi-eye");
    }
}

function redirectIndex(event) {
    event.preventDefault();
    window.location.href = "../index.html";
}