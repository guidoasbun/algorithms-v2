export const twoNumberSum1 = (array: number[], targetSum: number): number[] => {
  const arrayLength: number = array.length;

  for (let i = 0; i < arrayLength - 1; i++) {
    const firstNum: number = array[i];

    for (let j = i + 1; j < arrayLength; j++) {
      const secondNum = array[j];

      if (firstNum + secondNum === targetSum) {
        return [firstNum, secondNum];
      }
    }
  }
  return [];
};

export const twoNumberSum2 = (array: number[], targetSum: number): number[] => {
  const hashMap = new Map<number, boolean>();

  for (const number of array) {
    const potentialMatch: number = targetSum - number;

    if (hashMap.has(potentialMatch)) {
      return [potentialMatch, number];
    } else {
      hashMap.set(number, true);
    }
  }

  return [];
};

export const twoNumberSum3 = (array: number[], targetSum: number): number[] => {
  array.sort((a, b) => a - b);
  let left: number = 0;
  let right: number = array.length - 1;

  while (left < right) {
    const currentSum: number = array[left] + array[right];
    if (currentSum === targetSum) {
      return [array[left], array[right]];
    } else if (currentSum < targetSum) {
      left++;
    } else if (currentSum > targetSum) {
      right--;
    }
  }

  return [];
};
