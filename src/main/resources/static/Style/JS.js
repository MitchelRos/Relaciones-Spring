(function() {
  // Add event listener
  document.addEventListener("mousemove", parallax);
  // Magic happens here
  function parallax(e) {
      let _w = window.innerWidth/2;
      let _h = window.innerHeight/2;
      let _mouseX = e.clientX;
      let _mouseY = e.clientY;
      console.log("with ",_w+" heigth ",_h)
      console
      let x = ((_mouseX - _w));
      let y = ((_mouseY - _h));
      let _depth1 =`translate3d(${x * (4/100)}px,${y * (2/100)}px,0px)`;
      let _depth2 =`translate3d(${x * (5/180)}px,${y * (1/180)}px,0px)`;
      let _depth3 =`translate3d(${x * (4/160)}px,${y * (1/160)}px,0px)`;
      let _depth4 =`translate3d(${x * (3/140)}px,${y * (1/140)}px,0px)`;
      let _depth5 =`translate3d(${x * (2/120)}px,${y * (1/120)}px,0px)`;
      let _depth6 =`translate3d(${x * (1/80)}px,${y * (1/80)}px,0px)`;
      
      document.getElementById("HumoFondo").style.transform = `translate3d(0px,${y * (2/100)}px,0px)`;
      document.getElementById("Humo").style.transform = `translate3d(0px,${y * (1/160)}px,0px)`;
      document.getElementById("llamasP").style.transform = _depth1;
      document.getElementById("ParedFondo").style.transform = `translate3d(0px,${y * (1/180)}px,0px)`;
      document.getElementById("FondoPared").style.transform = _depth2;
      document.getElementById("llama2").style.transform = _depth3;
      document.getElementById("PerroSentado").style.transform = _depth4;
      document.getElementById("mesa").style.transform = _depth4;
      document.getElementById("llama1").style.transform = _depth5;
      document.getElementById("llama3").style.transform = _depth5;
      document.getElementById("BurbujaT").style.transform = `translate3d(${x * (1/80)}px,${y * (1/140)}px,0px)`;


  }

})();