# refactoring_step_by_step
1.	codesmell
	data class: private
	duplicated codesmell
	checkDriver method name
2.	add test
3.	eliminate smell
		public -> private
			duplicate: add age getting
			change police().checkDriver() driver.age to driver.getAge()
			rename checkDriver to isDriverAdult
			change public int age to private int age
4.	run test