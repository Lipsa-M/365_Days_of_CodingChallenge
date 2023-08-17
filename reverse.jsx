import React from 'react'
function reverseString(str) {
    return str.split('').reverse().join('');
  }

function reverse() {
    const originalString = "Lipsa";
    const reversedString = reverseString(originalString);
  return (
    <div>
      <p>Original String: {originalString}</p>
      <p>Reversed String: {reversedString}</p>
    </div>
  )
}

export default reverse;
