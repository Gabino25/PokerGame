/**
 * References
 * http://www.brainjar.com/css/cards/
 * https://github.com/kubowania/memory-game
 */
document.addEventListener('DOMContentLoaded', () => {
    const CLUBS ="CLUBS";
    const DIAMONDS = "DIAMONS";
    const HEARTS ="HEARTS";
    const SPADES ="SPADES";
    const ACE ="ACE"; 
    const JACK ="JACK";
    const QUEEN ="QUEEN";
    const KING ="KING";
    const cardFigures = [CLUBS,DIAMONDS,HEARTS,SPADES];
    const cardValues = [ACE,"2","3","4","5","6","7","8","9","10",JACK,QUEEN,KING];
    let lpokerGame = document.getElementById("pokerGame"); 

   
    function getDecodeValue(){
        let retval; 
        switch (this.value) {
            case ACE:
            retval = 14; 
            break;
            case "2":
            retval = 2; 
            break;   
            case "3":
            retval = 3; 
            break;   
            case "4":
            retval = 4; 
            break;   
            case "5":
            retval = 5; 
            break;   
            case "6":
            retval = 6; 
            break;   
            case "7":
            retval = 7; 
            break;   
            case "8":
            retval = 8; 
            break;   
            case "9":
            retval = 9; 
            break;   
            case "10":
            retval = 10; 
            break;   
            case JACK:
            retval = 11; 
            break;   
            case QUEEN:
            retval = 12; 
            break;    
            case KING:
            retval = 13; 
            break;       
            default:
            break;
        }
        return retval; 
    }
    function getDecodeFigure(){
        let retval; 
        switch(this.figure){
            case CLUBS:
            retval = "&clubs;";
            break; 
            case DIAMONDS:
            retval = "&diams;";
            break;
            case HEARTS:
            retval = "&hearts;";
            break;
            case SPADES:
            retval = "&spades;";
            break;
            default:
            retval ="";    
        }
        return retval; 
    }

    function getNumDecodeFigure(){
        let decodeFigure = this.decodeFigureF();
        let decodeValue =  this.decodeValueF();
        let retval = [];
        if(decodeValue>=2&&decodeValue<=10){
          for(let i=0;i<decodeValue;i++){
            retval.push(decodeFigure);
          }
        }
        return retval;
    }

    function Card(pValue,pFigure,pColor){
        this.value = pValue;
        this.figure = pFigure;
        this.color = pColor;
        this.decodeFigureF = getDecodeFigure;
        this.decodeValueF = getDecodeValue;
        this.numDecodeFigureF = getNumDecodeFigure;
    }

    let deck = [];

    for(let i=0;i<cardValues.length;i++){
      for(let j=0;j<cardFigures.length;j++){
          let lCard;  
          if(cardFigures[j]===CLUBS||cardFigures[j]===SPADES){
            lCard = new Card(cardValues[i],cardFigures[j],"black");
          }else{
            lCard = new Card(cardValues[i],cardFigures[j],"red"); 
          }
          deck.push(lCard);
      }
    }

    for(let i=0;i<deck.length;i++){
        let lDiv = document.createElement("div");
        let lCard = deck[i];
        lDiv.style.color = deck[i].color;
        let str =""
        let lnumDecodeFigure = lCard.numDecodeFigureF();
        for(let i=0;i<lnumDecodeFigure.length;i++){
            str =str+lnumDecodeFigure[i];
        }
        lDiv.innerHTML = str;
        if(!!lpokerGame){
            lpokerGame.appendChild(lDiv);
        }
    }

    console.log(deck);
    
}); 