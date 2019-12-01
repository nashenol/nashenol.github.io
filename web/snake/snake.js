const canvas = document.getElementById('gameCanvas');
var dx = 10;
var dy = 0;
var foodX = 0;
var foodY = 0;
var score = 0;
var changingDirection = false;
let context = canvas.getContext('2d');
let snake = [
    {x: 250, y: 250},  
    {x: 240, y: 250},  
    {x: 230, y: 250},  
    {x: 220, y: 250},  
    {x: 210, y: 250}];

function drawSnake() {
    snake.forEach(drawSnakePart);
}

function drawSnakePart(snakePart) {
    context.fillStyle = 'lightgreen';
    context.strokeStyle = 'darkgreen';
    context.fillRect(snakePart.x, snakePart.y, 10, 10);
    context.strokeRect(snakePart.x, snakePart.y, 10, 10);
}

function changeDirection(event) {  
    const LEFT_KEY = 37;
    const RIGHT_KEY = 39;
    const UP_KEY = 38;
    const DOWN_KEY = 40;
    const keyPressed = event.keyCode;
    const goingUp = dy === -10;
    const goingDown = dy === 10;
    const goingRight = dx === 10;
    const goingLeft = dx === -10;
    if (changingDirection) {
        return;
    } else if (keyPressed === LEFT_KEY && !goingRight) {
        dx = -10;
        dy = 0;
    } else if (keyPressed === UP_KEY && !goingDown) {
        dx = 0;
        dy = -10;
    } else if (keyPressed === RIGHT_KEY && !goingLeft) {
        dx = 10;
        dy = 0;
    } else if (keyPressed === DOWN_KEY && !goingUp) {
        dx = 0;
        dy = 10;
    }
    changingDirection = true;
}

function moveSnake() {
    var didEatFood = snake[0].x === foodX && snake[0].y === foodY;
    var head = {x: snake[0].x + dx, y: snake[0].y + dy};
    snake.unshift(head);
    if (didEatFood) {
        score += 10;
        document.getElementById('score').innerHTML = score
        createFood();
    } else {
        snake.pop();
    }
}

function clearCanvas() {
    context.fillStyle = 'black';
    context.strokeStyle = 'black';
    context.fillRect(0, 0, canvas.width, canvas.height);
    context.strokeRect(0, 0, canvas.width, canvas.height);
}

function randomTen(min, max) {
    return Math.round((Math.random() * (max-min) + min) / 10) * 10;
}

function createFood() {
    foodX = randomTen(0, gameCanvas.width - 10);
    foodY = randomTen(0, gameCanvas.height - 10);
    snake.forEach(function isFoodOnSnake(part) {
        const foodIsOnSnake = part.x == foodX && part.y == foodY;
        if (foodIsOnSnake) {
            createFood();
        }
    });
}

function drawFood() {
    context.fillStyle = 'red';
    context.strokeStyle = 'red';
    context.fillRect(foodX, foodY, 10, 10);
    context.strokeRect(foodX, foodY, 10, 10);
}

function didGameEnd() {
    for (let i = 4; i < snake. length; i++) {
        const didCollide = snake[i].x === snake[0].x && snake[i].y === snake[0].y;
        if (didCollide) {
            return true;
        }
    }
    const hitLeftWall = snake[0].x < 0;
    const hitRightWall = snake[0].x > gameCanvas.width - 10;
    const hitToptWall = snake[0].y < 0;
    const hitBottomWall = snake[0].y > gameCanvas.height - 10;
    return hitLeftWall || hitRightWall || hitToptWall || hitBottomWall;
}

createFood();
function main() {
    if (didGameEnd()) {
        return;
    }
    setTimeout(function onTick() {
        changingDirection = false;
        clearCanvas();
        drawFood();
        moveSnake();
        drawSnake();
        main();
    }, 100);
}

document.addEventListener("keydown", changeDirection);
main();
