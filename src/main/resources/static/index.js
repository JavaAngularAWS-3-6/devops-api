let root = document.getElementById("root");

async function setupPage(){
    let req = await fetch('http://100.25.196.128:8000/characters/');
    let characters = await req.json();

    let charactersDiv = document.createElement("div");
    let characterInformation = document.createElement("div");
    charactersDiv.className = "character-container";
    characterInformation.className = "character-information";

    characters.forEach(character => {
        let characterElement = document.createElement("p");
        characterElement.textContent = character.nickName;
        characterElement.className = "character";
        characterElement.id = character.nickName;
        characterElement.addEventListener('click', displayCharacter);
        charactersDiv.appendChild(characterElement);
    });

    root.appendChild(charactersDiv);
    root.appendChild(characterInformation);
}

async function displayCharacter(e){
    let info = document.getElementsByClassName('character-information')[0];
    info.innerHTML = '';
    let nickname = e.target.id;
    let req = await fetch(`http://100.25.196.128:8000/characters/${nickname}`);
    let character = await req.json();
    console.log(character);
    let image = document.createElement('img');
    console.log(character.imageURL);
    image.setAttribute('src', character.imageURL);
    info.appendChild(image);
    let name = document.createElement('h1');
    name.textContent = `${character.firstName} ${character.lastName}`
    info.appendChild(name);
    let nick = document.createElement('h2');
    nick.textContent = `Goes by: ${character.nickName}`;
    info.appendChild(nick);
    let creature = document.createElement('h2');
    creature.textContent = `Is a: ${character.creature}`;
    info.appendChild(creature);
}

setupPage();