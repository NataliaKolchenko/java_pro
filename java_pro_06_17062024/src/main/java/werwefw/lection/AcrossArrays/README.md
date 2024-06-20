Задача "Пересечение двух массивов"
Даны два массива целых чисел nums1 и nums2. Необходимо вернуть массив, содержащий элементы, которые присутствуют в обоих массивах nums1 и nums2. Каждый элемент в результирующем массиве должен быть уникальным, и порядок элементов может быть любым.

Пример 1:

Входные данные: nums1 = [1,2,2,1], nums2 = [2,2]
Выходные данные: [2]
Пример 2:

Входные данные: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Выходные данные: [9,4]
Объяснение: [4,9] также является допустимым ответом.
Ограничения:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
Задача требует найти элементы, которые присутствуют в обоих массивах, и вернуть их в виде нового массива без дубликатов. Порядок элементов в результирующем массиве не имеет значения.