import React from 'react'

function Day8() {
  const num=parseFloat(prompt("Enter first number:"));
    console.log(num)
    if(num%2==0)
      console.log("It is even", num)
    else
    console.log("Not even");
  return (
    <div>
      
    </div>
  )
}

export default Day8;
