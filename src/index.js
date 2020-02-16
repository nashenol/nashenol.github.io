import _ from 'lodash';
// import * as tf from '@tensorflow/tfjs-node';

function component() {
	const element = document.createElement('div');
	
	element.innerHTML = _.join(['Hello', 'webpack'], ' ');
	
	return element;
}

document.body.appendChild(component());