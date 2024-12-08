#Перемножение двух матриц

  Подготовка исходных данных: сгенерируйте два целочисленных массива А
и В, размерностью NxN (151 или большее простое число). Запишите их один
или в два файла в удобном формате по вашему желанию.

  Необходимо написать программу, которая будет умножить матрицу А на
матрицу В и выводить результат. Вывод результата только после
выполнения всех расчетов.

  Проверка: в исходных данных подготовьте единичную матрицу заданной
размерности NxN и передайте ее в качестве матрицы В, чтобы получить
ответ идентичный матрице A.

В результате сравнения скорости работы на матрице размерностью 151X151 получились такие результаты:
// Замер времени на одном потоке
//19740500
//16729000 // лучшее время
//21361900
//21763200
//24815700
//24377400
//16510300
//19350400
//20399200
//19043700
//17639200

// Замер времени на синхронизированных n потоках
//20059200 // худшее время
//10975200 // лучшее время
//13374200
//13374200
//18712800
//12769400
//12508700
//12630400
//11272300
//15587000
//12537100