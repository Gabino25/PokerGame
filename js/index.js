/**
 * References
 * http://www.brainjar.com/css/cards/
 * https://github.com/kubowania/memory-game
 */
document.addEventListener('DOMContentLoaded', () => {
    const CLUBS ="CLUBS";
    const DIAMONDS = "DIAMONDS";
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
        }else if(decodeValue>=11&&decodeValue<=13){
            for(let i=0;i<decodeValue;i++){
             retval.push("NA");
          }
        }
        if(decodeValue===14){
            retval.push(decodeFigure);
        }
        return retval;
    }

    function getDecodeGridArea(){
        let decodeValue =  this.decodeValueF();
        let retval = [];
        if(decodeValue>=2&&decodeValue<=10){
          switch (decodeValue) {
              case 2:
                for(let i=0;i<decodeValue;i++){
                    if(0===i){
                        retval.push("A2");
                    }else if(1===i){
                        retval.push("C2");
                    }
                  }
                  break;
                  case 3:
                    for(let i=0;i<decodeValue;i++){
                        if(0===i){
                            retval.push("A2");
                        }else if(1===i){
                            retval.push("B2");
                        }else if(2===i){
                            retval.push("C2");
                        }
                      }
                      break;    
                      case 4:
                        for(let i=0;i<decodeValue;i++){
                            if(0===i){
                                retval.push("A1");
                            }else if(1===i){
                                retval.push("A3");
                            }else if(2===i){
                                retval.push("C1");
                            }else if(3===i){
                                retval.push("C3");
                            }
                          }
                          break;  
                          case 5:
                            for(let i=0;i<decodeValue;i++){
                                if(0===i){
                                    retval.push("A1");
                                }else if(1===i){
                                    retval.push("A3");
                                }else if(2===i){
                                    retval.push("B2");
                                }else if(3===i){
                                    retval.push("C1");
                                }else if(4===i){
                                    retval.push("C3");
                                }
                              }
                              break;      
                              case 6:
                                for(let i=0;i<decodeValue;i++){
                                    if(0===i){
                                        retval.push("A1");
                                    }else if(1===i){
                                        retval.push("A3");
                                    }else if(2===i){
                                        retval.push("B1");
                                    }else if(3===i){
                                        retval.push("B3");
                                    }else if(4===i){
                                        retval.push("C1");
                                    }else if(5===i){
                                        retval.push("C3");
                                    }
                                  }
                                  break;  
                                  case 7:
                                    for(let i=0;i<decodeValue;i++){
                                        if(0===i){
                                            retval.push("A1");
                                        }else if(1===i){
                                            retval.push("A3");
                                        }else if(2===i){
                                            retval.push("B1");
                                        }else if(3===i){
                                            retval.push("B3");
                                        }else if(4===i){
                                            retval.push("C1");
                                        }else if(5===i){
                                            retval.push("C3");
                                        }else if(6===i){
                                            retval.push("B2");
                                        }
                                      }
                                      break;  
                                    case 8:
                                    for(let i=0;i<decodeValue;i++){
                                        if(0===i){
                                            retval.push("A1");
                                        }else if(1===i){
                                            retval.push("A3");
                                        }else if(2===i){
                                            retval.push("B1");
                                        }else if(3===i){
                                            retval.push("B2");
                                        }else if(4===i){
                                            retval.push("B3");
                                        }else if(5===i){
                                            retval.push("C1");
                                        }else if(6===i){
                                            retval.push("C2");
                                        }else if(7===i){
                                            retval.push("C3");
                                        }
                                      }
                                      break;     
                                      case 9:
                                        for(let i=0;i<decodeValue;i++){
                                            if(0===i){
                                                retval.push("A1");
                                            }else if(1===i){
                                                retval.push("A3");
                                            }else if(2===i){
                                                retval.push("B1");
                                            }else if(3===i){
                                                retval.push("B3");
                                            }else if(4===i){
                                                retval.push("C1");
                                            }else if(5===i){
                                                retval.push("C2");
                                            }else if(6===i){
                                                retval.push("C3");
                                            }else if(7===i){
                                                retval.push("D1");
                                            }else if(8===i){
                                                retval.push("D3");
                                            }

                                          }
                                          break;    
                                          case 10:
                                            for(let i=0;i<decodeValue;i++){
                                                if(0===i){
                                                    retval.push("A1");
                                                }else if(1===i){
                                                    retval.push("A3");
                                                }else if(2===i){
                                                    retval.push("B1");
                                                }else if(3===i){
                                                    retval.push("B2");
                                                }else if(4===i){
                                                    retval.push("B3");
                                                }else if(5===i){
                                                    retval.push("C1");
                                                }else if(6===i){
                                                    retval.push("C3");
                                                }else if(7===i){
                                                    retval.push("D1");
                                                }else if(8===i){
                                                    retval.push("D2");
                                                }else if(9===i){
                                                    retval.push("D3");
                                                }
    
                                              }
                                              break;                              
              default:
                  break;
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
        this.decodeGridArea = getDecodeGridArea;
    }

    let deck = [];

    
      for(let j=0;j<cardFigures.length;j++){
        for(let i=0;i<cardValues.length;i++){
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
        lDiv.classList.add("card");
        let str =""
        let lnumDecodeFigure = lCard.numDecodeFigureF();
        let ldecodeGridArea = lCard.decodeGridArea();
        let lnumDecodeFigureLenght = lnumDecodeFigure.length;
        if(lnumDecodeFigureLenght>=1&&lnumDecodeFigureLenght<=10){
            let lDiv2 = document.createElement("div");
            lDiv2.innerHTML = lnumDecodeFigure.length;
            if(!!lDiv){
                lDiv.appendChild(lDiv2);
            }
            if(lnumDecodeFigureLenght>1&&lnumDecodeFigureLenght<=8){
                lDiv.classList.add("ThreeByThree");
            }
            if(lnumDecodeFigureLenght>8&&lnumDecodeFigureLenght<=10){
                lDiv.classList.add("ThreeByFour");
            }
        }else if(lnumDecodeFigureLenght>10&&lnumDecodeFigureLenght<=13){
            let lDiv2 = document.createElement("div");
            let strCardValue = lCard.value+"";
            let strCardFigure = lCard.figure+"";
            strCardValue = String(strCardValue).toLowerCase();
            strCardFigure = String(strCardFigure).toLowerCase();
            lDiv2.style.backgroundImage ="url('/PokerGame/images/"+strCardValue+"-"+strCardFigure+".png')";
            lDiv2.style.backgroundRepeat ="no-repeat";
            lDiv2.style.backgroundSize ="100%";
            lDiv2.style.height = "100%";
            if(!!lDiv){
                lDiv.appendChild(lDiv2);
            }
        }
        for(let i=0;i<lnumDecodeFigure.length&&(lnumDecodeFigure.length>=1&&lnumDecodeFigure.length<=10);i++){
            let lDiv2 = document.createElement("div");
            lDiv2.classList.add("figure");
            if(1===lnumDecodeFigure.length){
                lDiv2.classList.add("OnlyOne");   
            }
            if(!!ldecodeGridArea[i]){
                lDiv2.style.gridArea = ldecodeGridArea[i];
            }
            lDiv2.innerHTML = lnumDecodeFigure[i]; 
            if(!!lDiv){
              lDiv.appendChild(lDiv2);
            }
            /*str =str+lnumDecodeFigure[i];*/
        }
        /*lDiv.innerHTML = str;*/
        if(!!lpokerGame){
            lpokerGame.appendChild(lDiv);
        }
    }

    console.log(deck);
    
}); 