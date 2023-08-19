<h1>Contains Duplicate, Daily leetcode challenge</h1>

![1_OathM0PWiIfPfFuJ3wv87A](https://github.com/albrran/Contains-Duplicate-Leetcode-challenge/assets/120284166/57bb7217-6e14-4042-917e-4acc23d05b91)
<br>
<h2>Problem: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.</h2>
<br>
    <h2>Example 1:</h2>
    <p>Input: nums = [1,2,3,1]</p>
    <p>Output: true</p>
    <h2>Example 2:</h2>
    <p>Input: nums = [1,2,3,4]</p>
    <p>Output: false</p>
    <h2>Example 3:</h2>
    <p>Input: nums = [1,1,1,3,3,4,3,2,4,2]</p>
    <p>Output: true</p>
    <h3>Constraints:</h3>
    <p><i>1 <= nums.length <= 105</i></p>
    <p><i>-109 <= nums[i] <= 109</i></p>
      <br>
<h1>Solution 1: HashSet</h1>
<p>Imagine that you have a physically empty bucket, and you want to know if you have two of the same toys. We'll start by adding our toys to the bucket until we run out of toys. When we add each toy to the bucket, we look inside the bucket to see if we already have that type of toy in the bucket</p>
        
![ezgif com-gif-maker](https://github.com/albrran/Contains-Duplicate-Leetcode-challenge/assets/120284166/da856e13-3b58-451f-adc4-e82962555447)
<ol>
    <li>Initialize the HashSet</li>
    <li>Iterate through the given array populating the HashSet with numbers that aren't already within the Hashset</li>
    <li>Return true if you reach a number within the array that is already in the Hashset, false otherwise</li>
</ol>
<p><b>Time Complexity:</b> O(n)</p>
<p><b>Space Complexity:</b> O(n)</p>

<h1>Solution 2: Sorted Array</h1>
<p>Picture the given array. It contains numbers in random order, but what if we sorted the array so that each value within the array incremented positively? That would mean, if we did have any duplicates, they would be right beside each other within the array. </p>

![array-gif-1](https://github.com/albrran/Contains-Duplicate-Leetcode-challenge/assets/120284166/2b9464ca-458f-41c4-8349-0e8aee8e8f89)

<ol>
    <li>Sort the given array</li>
    <li>Iterate through the array and compare the current value with the current value + 1</li>
    <li>Return true if the numbers are the same</li>
    <li>Return false if not found</li>
</ol>
<p><b>Time Complexity:</b> O(n)</p>
<p><b>Space Complexity:</b> O(n)</p>

