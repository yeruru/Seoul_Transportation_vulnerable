const{Editor} = toastui;

const editor = new Editor({
     el: document.querySelector('#editor'),
     height: '600px',
     initialEditType: 'wysiwyg',
     previewStyle: 'vertical',
     
     
     
     
     
     
     
     
     initialValue:content,
     thema:'dark'
   });
   
   
   
   const viewer = Editor.factory({
   	el: document.querySelector('#viewer'),
   	viewer:true,
   	height:'500px',
 	initialValue:content,
 	thema:'dark'
   });
   

