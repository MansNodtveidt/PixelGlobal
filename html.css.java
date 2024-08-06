<!DOCTYPE html>
<html lang="sv">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dynamisk Hemsida</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #4CAF50;
            color: white;
            text-align: center;
            padding: 1em 0;
        }

        nav ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        }

        nav ul li {
            float: left;
        }

        nav ul li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        nav ul li a:hover {
            background-color: #111;
        }

        main {
            padding: 20px;
        }

        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 1em 0;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
    </style>
</head>
<body>
    <header>
        <h1>Välkommen till Min Dynamiska Hemsida</h1>
    </header>
    <nav>
        <ul>
            <li><a href="#home">Hem</a></li>
            <li><a href="#about">Om</a></li>
            <li><a href="#contact">Kontakt</a></li>
        </ul>
    </nav>
    <main>
        <section id="home">
            <h2>Hem</h2>
            <p id="welcome-message">Detta är startsidan för min dynamiska hemsida.</p>
        </section>
        <section id="about">
            <h2>Om</h2>
            <p>Här kan du läsa om mig.</p>
        </section>
        <section id="contact">
            <h2>Kontakt</h2>
            <p>Här kan du kontakta mig.</p>
        </section>
    </main>
    <footer>
        <p>&copy; 2024 Min Dynamiska Hemsida</p>
    </footer>
    <script>
        document.addEventListener('DOMContentLoaded', () => {
            const welcomeMessage = document.getElementById('welcome-message');
            const currentDate = new Date();
            welcomeMessage.textContent += ` Idag är det ${currentDate.toLocaleDateString()}.`;
        });
    </script>
</body>
</html>
