"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.twoNumberSum3 = exports.twoNumberSum2 = exports.twoNumberSum1 = void 0;
const twoNumberSum1 = (array, targetSum) => {
    const arrayLength = array.length;
    for (let i = 0; i < arrayLength - 1; i++) {
        const firstNum = array[i];
        for (let j = i + 1; j < arrayLength; j++) {
            const secondNum = array[j];
            if (firstNum + secondNum === targetSum) {
                return [firstNum, secondNum];
            }
        }
    }
    return [];
};
exports.twoNumberSum1 = twoNumberSum1;
const twoNumberSum2 = (array, targetSum) => {
    const hashMap = new Map();
    for (const number of array) {
        const potentialMatch = targetSum - number;
        if (hashMap.has(potentialMatch)) {
            return [potentialMatch, number];
        }
        else {
            hashMap.set(number, true);
        }
    }
    return [];
};
exports.twoNumberSum2 = twoNumberSum2;
const twoNumberSum3 = (array, targetSum) => {
    array.sort((a, b) => a - b);
    let left = 0;
    let right = array.length - 1;
    while (left < right) {
        const currentSum = array[left] + array[right];
        if (currentSum === targetSum) {
            return [array[left], array[right]];
        }
        else if (currentSum < targetSum) {
            left++;
        }
        else if (currentSum > targetSum) {
            right--;
        }
    }
    return [];
};
exports.twoNumberSum3 = twoNumberSum3;
