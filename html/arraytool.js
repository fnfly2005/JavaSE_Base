Array.prototype.getMax =function(){
	var temp = 0;
	for (var x=1;x<this.length;x++){
		if(this[x]>this[temp]){
			temp = x;
			}
	}
	return this[temp];
}

Array.prototype.toString = function(){
	return "["+this.join(",")+"]"
}
