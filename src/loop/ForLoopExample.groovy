package loop;

//for loop

for(def i=0; i<=5; i++) {
	println "value of i: " + i
}

// while loop

def j = 1

while(j < 9) {
	println j
	j = j + 1
}

// for each loop

def list1 = [1,2,3,4,5,6]

for(int i: list1) {
	println "print the value of i: " + i
}